package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import gotten.utils.ModelManager;
import gotten.utils.exceptions.MetaModelNotFoundException;

public class SetYouTubeAPIKey {
	
	private static final String PROJECT_PATH = "C:/eclipse/runtime-EclipseApplication8" + File.separator + "video";

	private static final String ECORE_PATH = PROJECT_PATH + File.separator + "model";
	
	private static final String MODEL_PATH = PROJECT_PATH + File.separator + "model" + File.separator + "videotc";

	private static final String YOUTUBE_API_KEY = "AIzaSyATE_DybvLwY4rh5RRtHoBlolNW5BoQvOY";
	
	//private static final String YOUTUBE_API_KEY = "AIzaSyCtJ9eGUJ1uxpZ9rasL1a534unQCz7dlKc";

	public static void main(String[] args) throws MetaModelNotFoundException {
		
		String metamodel = ECORE_PATH + File.separator + "VideoStream.ecore";
		
		List<EPackage> packages = ModelManager.loadMetaModel(metamodel);
		List<Resource> models = new ArrayList<Resource>();
		
		File pathFile = new File(MODEL_PATH);
		for (File file : pathFile.listFiles()) {
			if (file.isFile()) {
				if (file.getName().endsWith(".model")) {
					Resource model = ModelManager.loadModelNoException(packages, file.getPath());  
					models.add(model);
				}
			}
			if (file.isDirectory()) {
				for (File subFile : file.listFiles()) {
					if (subFile.isFile()) {
						if (subFile.getName().endsWith(".model")) {
							Resource model = ModelManager.loadModelNoException(packages, subFile.getPath());
							models.add(model);
						}
					}
					if (subFile.isDirectory()) {
						for (File subSubFile : subFile.listFiles()) {
							if (subSubFile.isFile()) {
								if (subSubFile.getName().endsWith(".model")) {
									Resource model = ModelManager.loadModelNoException(packages, subSubFile.getPath());
									models.add(model);
								}
							}
						}
					}
				}
			}
		}
		
		for (Resource model : models) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("PROCESSING MODEL " + model.getURI().toFileString());
			EObject root = ModelManager.getRoot(model);
			Object obj = ModelManager.getReferencedNoException("auth", root);
			if (obj instanceof EObject) {
				EObject apiAuthEObject = (EObject) obj;
				EStructuralFeature apiKey = apiAuthEObject.eClass().getEStructuralFeature("key");
				String youtube_api_key = (String) apiAuthEObject.eGet(apiKey);
				System.out.println("CHANGING YOUTUBE API KEY FROM (" + youtube_api_key + ") TO (" + YOUTUBE_API_KEY + ")");
				apiAuthEObject.eSet(apiKey, YOUTUBE_API_KEY);
				ModelManager.saveOutModel(model, model.getURI().toFileString());
			}
			System.out.println("---------------------------------------------------------------");
		}
	}
}
