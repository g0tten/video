package gotten.momot;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import videostream.VideoAPITest;
import videostream.VideoOperation;
import videostream.UploadVideo;
import videostream.UpdateVideo;
import videostream.SearchVideo;
import videostream.Order;
import gotten.utils.ModelManager;
import java.lang.Math;

public class FitnessFunctionForVideoStream_mr1 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_MaxResults = 0.0;

	private static double getMAxresultsDynamic(EObject eObject, Set<EObject> processed) {
		double maxresults = 0.0;
		if (processed.contains(eObject) == false) {
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.getName().equals("maxResults")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							maxresults += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							maxresults += (float) value;
						}
					}
					if (value instanceof Long) {
						if ((long) value != 0) {
							maxresults += (long) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							maxresults += (double) value;
						}
					}
					if (value instanceof String) {
						if (!((String) value).equals("NONE")) {
							maxresults += 1.0;
						}
					}
					if (value instanceof Order) {
						if (!((Order) value).getLiteral().equals("NONE")) {
							maxresults += 1.0;
						}
					}
				}
			}
			for (EReference ref : eObject.eClass().getEAllReferences()) {
				if (ref.getName().equals("request")) {
					Object o = ModelManager.getReferencedNoException(ref.getName(), eObject);
					if (o instanceof EObject) {
						EObject containedEObject = (EObject) o;
						if (processed.contains(containedEObject) == false) {
							double result = getMAxresultsDynamic(containedEObject, processed);
							if (result != 0) {
								maxresults += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getMAxresultsDynamic(containedEObject, processed);
								if (result != 0) {
									maxresults += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return maxresults;
	}

	private static double getMAxresults(VideoAPITest object) {
		double maxresults = 0.0;
		VideoOperation objectVideoOperation = object.getRequest();
		double result = getMAxresults(objectVideoOperation);
		if (result != 0) {
			maxresults += result;
		}
		return maxresults;
	}

	private static double getMAxresults(VideoOperation object) {
		double maxresults = 0.0;
		if (object instanceof SearchVideo) {
			Object valuemaxResults = ((SearchVideo) object).getMaxResults();
			if (valuemaxResults instanceof Integer) {
				if ((int) valuemaxResults != 0) {
					maxresults += (int) valuemaxResults;
				}
			}
			if (valuemaxResults instanceof Float) {
				if ((float) valuemaxResults != 0) {
					maxresults += (float) valuemaxResults;
				}
			}
			if (valuemaxResults instanceof Double) {
				if ((double) valuemaxResults != 0) {
					maxresults += (double) valuemaxResults;
				}
			}
			if (valuemaxResults instanceof Long) {
				if ((float) valuemaxResults != 0) {
					maxresults += (long) valuemaxResults;
				}
			}
			if (valuemaxResults instanceof String) {
				if (!((String) valuemaxResults).equals("NONE")) {
					maxresults += 1.0;
				}
			}
			if (valuemaxResults instanceof Order) {
				if (!((Order) valuemaxResults).getLiteral().equals("NONE")) {
					maxresults += 1.0;
				}
			}
		}
		return maxresults;
	}

	public static double getMAxresultsDistance(final VideoAPITest root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/VideoStream.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_MaxResults = getMAxresultsDynamic(initial_model_root, processed);
		}
		double maxresults = getMAxresults(root);
		return Math.abs(maxresults - INITIAL_MaxResults);
	}
}
