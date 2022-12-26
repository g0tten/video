/**
 */
package videostream.util;

import videostream.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see videostream.VideostreamPackage
 * @generated
 */
public class VideoStreamAPITestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VideostreamPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoStreamAPITestSwitch() {
		if (modelPackage == null) {
			modelPackage = VideostreamPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case VideostreamPackage.VIDEO_API_TEST: {
				VideoAPITest videoAPITest = (VideoAPITest)theEObject;
				T result = caseVideoAPITest(videoAPITest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.API_AUTH: {
				APIAuth apiAuth = (APIAuth)theEObject;
				T result = caseAPIAuth(apiAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.VIDEO_OPERATION: {
				VideoOperation videoOperation = (VideoOperation)theEObject;
				T result = caseVideoOperation(videoOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.UPLOAD_VIDEO: {
				UploadVideo uploadVideo = (UploadVideo)theEObject;
				T result = caseUploadVideo(uploadVideo);
				if (result == null) result = caseVideoOperation(uploadVideo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.UPDATE_VIDEO: {
				UpdateVideo updateVideo = (UpdateVideo)theEObject;
				T result = caseUpdateVideo(updateVideo);
				if (result == null) result = caseVideoOperation(updateVideo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.SEARCH_VIDEO: {
				SearchVideo searchVideo = (SearchVideo)theEObject;
				T result = caseSearchVideo(searchVideo);
				if (result == null) result = caseVideoOperation(searchVideo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.VIDEO_STATISTICS: {
				VideoStatistics videoStatistics = (VideoStatistics)theEObject;
				T result = caseVideoStatistics(videoStatistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VideostreamPackage.OPERATION_RESULT: {
				OperationResult operationResult = (OperationResult)theEObject;
				T result = caseOperationResult(operationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video API Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video API Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoAPITest(VideoAPITest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIAuth(APIAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoOperation(VideoOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upload Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upload Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUploadVideo(UploadVideo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateVideo(UpdateVideo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchVideo(SearchVideo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoStatistics(VideoStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationResult(OperationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //VideoStreamAPITestSwitch
