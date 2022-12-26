/**
 */
package videostream.util;

import videostream.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see videostream.VideostreamPackage
 * @generated
 */
public class VideoStreamAPITestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VideostreamPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoStreamAPITestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VideostreamPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoStreamAPITestSwitch<Adapter> modelSwitch =
		new VideoStreamAPITestSwitch<Adapter>() {
			@Override
			public Adapter caseVideoAPITest(VideoAPITest object) {
				return createVideoAPITestAdapter();
			}
			@Override
			public Adapter caseAPIAuth(APIAuth object) {
				return createAPIAuthAdapter();
			}
			@Override
			public Adapter caseVideoOperation(VideoOperation object) {
				return createVideoOperationAdapter();
			}
			@Override
			public Adapter caseUploadVideo(UploadVideo object) {
				return createUploadVideoAdapter();
			}
			@Override
			public Adapter caseVideo(Video object) {
				return createVideoAdapter();
			}
			@Override
			public Adapter caseUpdateVideo(UpdateVideo object) {
				return createUpdateVideoAdapter();
			}
			@Override
			public Adapter caseSearchVideo(SearchVideo object) {
				return createSearchVideoAdapter();
			}
			@Override
			public Adapter caseVideoStatistics(VideoStatistics object) {
				return createVideoStatisticsAdapter();
			}
			@Override
			public Adapter caseOperationResult(OperationResult object) {
				return createOperationResultAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link videostream.VideoAPITest <em>Video API Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.VideoAPITest
	 * @generated
	 */
	public Adapter createVideoAPITestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.APIAuth <em>API Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.APIAuth
	 * @generated
	 */
	public Adapter createAPIAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.VideoOperation <em>Video Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.VideoOperation
	 * @generated
	 */
	public Adapter createVideoOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.UploadVideo <em>Upload Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.UploadVideo
	 * @generated
	 */
	public Adapter createUploadVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.UpdateVideo <em>Update Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.UpdateVideo
	 * @generated
	 */
	public Adapter createUpdateVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.SearchVideo <em>Search Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.SearchVideo
	 * @generated
	 */
	public Adapter createSearchVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.VideoStatistics <em>Video Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.VideoStatistics
	 * @generated
	 */
	public Adapter createVideoStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link videostream.OperationResult <em>Operation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see videostream.OperationResult
	 * @generated
	 */
	public Adapter createOperationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //VideoStreamAPITestAdapterFactory
