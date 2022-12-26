/**
 */
package videostream.impl;

import videostream.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideostreamFactoryImpl extends EFactoryImpl implements VideostreamFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VideostreamFactory init() {
		try {
			VideostreamFactory theVideostreamFactory = (VideostreamFactory)EPackage.Registry.INSTANCE.getEFactory(VideostreamPackage.eNS_URI);
			if (theVideostreamFactory != null) {
				return theVideostreamFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VideostreamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideostreamFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VideostreamPackage.VIDEO_API_TEST: return createVideoAPITest();
			case VideostreamPackage.API_AUTH: return createAPIAuth();
			case VideostreamPackage.UPLOAD_VIDEO: return createUploadVideo();
			case VideostreamPackage.VIDEO: return createVideo();
			case VideostreamPackage.UPDATE_VIDEO: return createUpdateVideo();
			case VideostreamPackage.SEARCH_VIDEO: return createSearchVideo();
			case VideostreamPackage.VIDEO_STATISTICS: return createVideoStatistics();
			case VideostreamPackage.OPERATION_RESULT: return createOperationResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VideostreamPackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VideostreamPackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoAPITest createVideoAPITest() {
		VideoAPITestImpl videoAPITest = new VideoAPITestImpl();
		return videoAPITest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIAuth createAPIAuth() {
		APIAuthImpl apiAuth = new APIAuthImpl();
		return apiAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UploadVideo createUploadVideo() {
		UploadVideoImpl uploadVideo = new UploadVideoImpl();
		return uploadVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateVideo createUpdateVideo() {
		UpdateVideoImpl updateVideo = new UpdateVideoImpl();
		return updateVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchVideo createSearchVideo() {
		SearchVideoImpl searchVideo = new SearchVideoImpl();
		return searchVideo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoStatistics createVideoStatistics() {
		VideoStatisticsImpl videoStatistics = new VideoStatisticsImpl();
		return videoStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationResult createOperationResult() {
		OperationResultImpl operationResult = new OperationResultImpl();
		return operationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideostreamPackage getVideostreamPackage() {
		return (VideostreamPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VideostreamPackage getPackage() {
		return VideostreamPackage.eINSTANCE;
	}

} //VideostreamFactoryImpl
