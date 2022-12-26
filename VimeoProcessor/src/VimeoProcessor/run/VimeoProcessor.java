package VimeoProcessor.run;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import com.clickntap.vimeo.VimeoVideoStreaming;

import gotten.processor.run.Processor;
import gotten.utils.ModelManager;

public class VimeoProcessor extends Processor {

	private static final String PROJECT_PATH = ModelManager.getWorkspaceAbsolutePath() + File.separator + "video";

	@Override
	public String getID() {
		return "VimeoProcessor";
	}

	@Override
	public String getMetamodel() {
		return "VideoStream.ecore";
	}

	@Override
	public Object getProcessorFeature(List<Resource> models, String name) {
		
		System.out.println("getProcessorFeature - Init");
		System.out.println("getProcessorFeature - Processing feature: "+name);
		List<Object> values = new ArrayList<Object>();
		if(models != null)
		{
			//Process the whole feature list
			for (Resource model : models) {
				String modelName = model.getURI().toFileString().substring(model.getURI().toFileString().lastIndexOf(File.separator + "model" + File.separator) + (File.pathSeparator + "model" + File.separator).length(), model.getURI().toFileString().length());
				String outputSimpleName = modelName.substring(modelName.lastIndexOf(File.separator) + 1, modelName.length());
				outputSimpleName = outputSimpleName.replace("input_", "output_").replace("workload_", "output_").replace("followup_", "output_").replace(".model", ".tc");

				System.out.println("outputSimpleName: " + outputSimpleName);
				String outputFileName = modelName.substring(0, modelName.lastIndexOf(File.separator) + 1) + outputSimpleName;
				System.out.println("outputFileName: " + outputFileName);
				
				String strPath = PROJECT_PATH+File.separatorChar+"tc"+File.separatorChar+getID()+File.separatorChar+outputFileName;
				
				File outputFile = new File(strPath);
				System.out.println("===============================================>");			
				
				System.out.println(strPath);
				System.out.println("===============================================>");
				//metamodelPath = "/home/j0hn/Documents/GitHub/metamorphic/code_REST/REST_Gotten/metamodel/VideoStream.ecore";
				//metamodelPath = "C:/eclipse/runtime-EclipseApplication6/video/model/VideoStream.ecore";
				String metamodelPath = "C:/eclipse/runtime-EclipseApplication8/video/model/VideoStream.ecore";
				List<EPackage> packages = ModelManager.loadMetaModelNoException(metamodelPath);

				if (packages != null && outputFile.exists() == true) { 
				
					String outputPath; //, strDescription, strTitle;
//					Resource resourceModel;
//					EObject resourceRoot;
					Resource testModel;
					int nResults;

					//metamodelPath = "/home/j0hn/Documents/GitHub/metamorphic/code_REST/REST_Gotten/metamodel/VideoStream.ecore";
					//metamodelPath = "C:/eclipse/runtime-EclipseApplication6/video/model/VideoStream.ecore";
					//inputPath= "/home/j0hn/Documents/GitHub/metamorphic/code_REST/REST_Gotten/results/test.xmi";
					//inputPath= "C:/eclipse/runtime-EclipseApplication4/video/model/videotc/videosource.model";
					//inputPath= "C:/eclipse/workspace7/REST_Gotten/results/test.xmi";
					outputPath= outputFile.getPath();
					//TODO: [PabloC]: Pablo G, hay que enlazar con el metamodelo aqui
					
					System.out.println("getProcessorFeature - Init - Registering metamodel");		
					//EMFHelper.registerEcore(metamodelPath);
					//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					//		"library", new EcoreResourceFactoryImpl());
					//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					//		Resource.Factory.Registry.DEFAULT_EXTENSION,
					//		new XMIResourceFactoryImpl()); 

					System.out.println("getProcessorFeature - Loading model: "+outputPath);
					//resourceModel = EMFHelper.loadResourceModel(inputPath);
					testModel = ModelManager.loadModelNoException(packages, outputPath);
					//resourceRoot = resourceModel.getContents().get(0);
					//EObject rootTest = testModel.getContents().get(0);
					EObject rootTest = ModelManager.getRoot(testModel);
						
					//EObject video, request;
						
					System.out.println("getProcessorFeature - Reading description");
					
					/*video = EMFHelper.getReference(rootTest, "video");
					strDescription = (String) EMFHelper.getFeature(video, "Description");
					strTitle = (String) EMFHelper.getFeature(video, "Title");*/
					
					//Open the model
					if(name.indexOf("NVideos") != -1)
					{
						System.out.println("getProcessorFeature - Reading feature NVideos");
							
						try
						{
							nResults = (int) ModelManager.getAttributeValue("totalResults", rootTest);
							//nResults = (int) EMFHelper.getFeature(rootTest, "totalResults");
						
							System.out.println("getProcessorFeature - NVideos: "+strPath);
							values.add(nResults);
						}catch(Exception e)
						{
							System.out.println("getProcessorFeature - Exception while reading feature: "+name);
						}
					}
					else if(name.indexOf("VideoId") != -1)
					{
							System.out.println("getProcessorFeature - Reading feature VideoId");
					}
						
				}
			}
		}
		System.out.println("getProcessorFeature - End");
		
		return values;
	}

	@Override
	public String createTest(String pathInput, String pathOutput) {
		
		String mtcScript = "Id: 1\n";
		mtcScript += "MutantId: 0\n";
		mtcScript += "GroupId: 0\n";
		mtcScript += "InputSrc: " + pathInput + "\n";
		mtcScript += "OutputSrc: " + pathOutput + "\n";
		mtcScript += "ExecCommands: \n";
		mtcScript += "isSourceTC: false\n";
		mtcScript += "followUpChilds: #0##\n";
		mtcScript += "Description: MetaTC automatically created by YT-processor by gotten\n";
		
		return mtcScript;
	}

	@Override
	public String generate(String metamodel, Resource model) {
		
		System.out.println("generate - Init");
		
		System.out.println("generate - Metamodel: "+metamodel);
		System.out.println("generate - Model: "+model.toString());
		
		System.out.println("generate - End");
		return null;
	}

	@Override
	public int execute(List<Resource> models) {
		
		String modelName, tcSimpleName, tcName;
		System.out.println("execute - Init");
		
		String[] args = new String[3];
		//args[0] = "--standalone";
		for (Resource model : models) {
			
			System.out.println("> "+args[1]);
			try {
				modelName = getModelName(model);
				
				tcSimpleName = modelName.substring(modelName.lastIndexOf(File.separator) + 1, modelName.length());
				tcSimpleName = tcSimpleName.replace("input_", "tc_").replace("followup_", "tc_").replace("workload_", "tc_").replace(".model", ".tc");
				tcName = modelName.substring(0, modelName.lastIndexOf(File.separator) + 1) + tcSimpleName;
				
				System.out.println("MetaTC name:"+tcName);
				
				//TODO: [PabloC]: Pablo, aqui hay que quitar esta parte de prueba y enlazarlo correctamente.
				//Abrimos el MetaTC
				
				//Ejecutamos el jar
				
				//test
				System.out.println("Executing the videostreaming processor");
				//args[0] = ModelManager.getWorkspaceAbsolutePath() + "/" + this.getID();
				//args[0] = "/home/j0hn/Documents/GitHub/metamorphic/code_REST/REST_Gotten/metamodel/VideoStream.ecore";
				args[0] = "C:/eclipse/runtime-EclipseApplication8/video/model/VideoStream.ecore";
				//args[1] = "/home/j0hn/Documents/GitHub/metamorphic/code_REST/REST_Gotten/models/VideoAPITest_t1.xmi";
				//args[1] = "C:/eclipse/workspace7/REST_Gotten/models/VideoAPITest_t1.xmi";
				args[1] = model.getURI().toFileString();
				//args[2] = "/home/j0hn/Documents/GitHub/metamorphic/code_REST/REST_Gotten/results/test.xmi";
				//args[3] = "C:/eclipse/workspace7/REST_Gotten/results/test.xmi";
				args[2] = PROJECT_PATH + File.separator + "tc" + File.separator + this.getID() + File.separator + tcName;
				VimeoVideoStreaming.main(args);
				
				System.out.println(ModelManager.getWorkspaceAbsolutePath()+File.separatorChar+"sample.gotten"+File.separatorChar+"tc"+File.separatorChar+getID()+File.separatorChar);
				
				//args[1] = ModelManager.getWorkspaceAbsolutePath()+File.separatorChar+"sample.gotten"+File.separatorChar+"tc"+File.separatorChar+getID()+File.separatorChar+mtcName;
				
				VimeoVideoStreaming.main(args);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("execute - End");
		return 0;
	}

	private String getModelName(Resource model) throws Exception {
		String modelName;
		String modelURI;
		String fileSeparator;
		int nModelURILen, nPathSeparatorLen;
		try
		{
			modelURI = model.getURI().toFileString();
			nModelURILen = modelURI.length();
			fileSeparator = File.separator + "model" + File.separator;
			nPathSeparatorLen = (File.pathSeparator + "model" + File.separator).length();
			modelName = modelURI.substring(modelURI.lastIndexOf(fileSeparator) + nPathSeparatorLen, nModelURILen);
			//modelName = model.getURI().toFileString().substring(model.getURI().toFileString().lastIndexOf(File.separator + "model" + File.separator) + (File.pathSeparator + "model" + File.separator).length(), model.getURI().toFileString().length());
		}
		catch(Exception e)
		{
			throw new Exception("Exception while creating model name");
		}
		
		return modelName;
	}
}
