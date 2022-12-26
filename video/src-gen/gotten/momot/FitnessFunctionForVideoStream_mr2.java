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

public class FitnessFunctionForVideoStream_mr2 {
	private static String INITIAL_MODEL = null;
	private static double INITIAL_SearchOrder = 0.0;

	private static double getSEarchorderDynamic(EObject eObject, Set<EObject> processed) {
		double searchorder = 0.0;
		if (processed.contains(eObject) == false) {
			for (EAttribute att : eObject.eClass().getEAllAttributes()) {
				if (att.getName().equals("orderType")) {
					Object value = ModelManager.getAttributeValue(att.getName(), eObject);
					if (value instanceof Integer) {
						if ((int) value != 0) {
							searchorder += (int) value;
						}
					}
					if (value instanceof Float) {
						if ((float) value != 0) {
							searchorder += (float) value;
						}
					}
					if (value instanceof Long) {
						if ((long) value != 0) {
							searchorder += (long) value;
						}
					}
					if (value instanceof Double) {
						if ((double) value != 0) {
							searchorder += (double) value;
						}
					}
					if (value instanceof String) {
						if (!((String) value).equals("NONE")) {
							searchorder += 1.0;
						}
					}
					if (value instanceof Order) {
						if (!((Order) value).getLiteral().equals("NONE")) {
							searchorder += 1.0;
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
							double result = getSEarchorderDynamic(containedEObject, processed);
							if (result != 0) {
								searchorder += result;
							}
						}
					}
					if (o instanceof List<?>) {
						List<EObject> containedEObjects = (List<EObject>) o;
						for (EObject containedEObject : containedEObjects) {
							if (processed.contains(containedEObject) == false) {
								double result = getSEarchorderDynamic(containedEObject, processed);
								if (result != 0) {
									searchorder += result;
								}
							}
						}
					}
				}
			}
			processed.add(eObject);
		}
		return searchorder;
	}

	private static double getSEarchorder(VideoAPITest object) {
		double searchorder = 0.0;
		if (object instanceof SearchVideo) {
			Order valueorderType = ((SearchVideo) object).getOrderType();
			double result = getSEarchorder(valueorderType);
			if (result != 0) {
				searchorder += result;
			}
		}
		VideoOperation objectVideoOperation = object.getRequest();
		double result = getSEarchorder(objectVideoOperation);
		if (result != 0) {
			searchorder += result;
		}
		return searchorder;
	}

	private static double getSEarchorder(VideoOperation object) {
		double searchorder = 0.0;
		if (object instanceof SearchVideo) {
			Order valueorderType = ((SearchVideo) object).getOrderType();
			double result = getSEarchorder(valueorderType);
			if (result != 0) {
				searchorder += result;
			}
		}
		if (object instanceof SearchVideo) {
			Object valueorderType = ((SearchVideo) object).getOrderType();
			if (valueorderType instanceof Integer) {
				if ((int) valueorderType != 0) {
					searchorder += (int) valueorderType;
				}
			}
			if (valueorderType instanceof Float) {
				if ((float) valueorderType != 0) {
					searchorder += (float) valueorderType;
				}
			}
			if (valueorderType instanceof Double) {
				if ((double) valueorderType != 0) {
					searchorder += (double) valueorderType;
				}
			}
			if (valueorderType instanceof Long) {
				if ((float) valueorderType != 0) {
					searchorder += (long) valueorderType;
				}
			}
			if (valueorderType instanceof String) {
				if (!((String) valueorderType).equals("NONE")) {
					searchorder += 1.0;
				}
			}
			if (valueorderType instanceof Order) {
				if (!((Order) valueorderType).getLiteral().equals("NONE")) {
					searchorder += 1.0;
				}
			}
		}
		return searchorder;
	}

	private static double getSEarchorder(Order object) {
		double searchorder = 0.0;
		if (object instanceof Order) {
			String valueOrder = ((Order) object).getLiteral();
			if (!valueOrder.equals("NONE")) {
				searchorder += 1.0;
			}
		}
		return searchorder;
	}

	public static double getSEarchorderDistance(final VideoAPITest root, final String initial_model) {
		if (INITIAL_MODEL == null) {
			INITIAL_MODEL = initial_model;
			List<EPackage> packages = ModelManager.loadMetaModelNoException("model/VideoStream.ecore");
			Resource resource = ModelManager.loadModelNoException(packages, initial_model);
			EObject initial_model_root = resource.getContents().get(0);
			Set<EObject> processed = new HashSet<EObject>();
			INITIAL_SearchOrder = getSEarchorderDynamic(initial_model_root, processed);
		}
		double searchorder = getSEarchorder(root);
		return Math.abs(searchorder - INITIAL_SearchOrder);
	}
}
