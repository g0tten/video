/**
 */
package videostream;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see VideoStreamAPITest.VideostreamPackage
 * @generated
 */
public interface VideostreamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideostreamFactory eINSTANCE = videostream.impl.VideostreamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Video API Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video API Test</em>'.
	 * @generated
	 */
	VideoAPITest createVideoAPITest();

	/**
	 * Returns a new object of class '<em>API Auth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Auth</em>'.
	 * @generated
	 */
	APIAuth createAPIAuth();

	/**
	 * Returns a new object of class '<em>Upload Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upload Video</em>'.
	 * @generated
	 */
	UploadVideo createUploadVideo();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Update Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Video</em>'.
	 * @generated
	 */
	UpdateVideo createUpdateVideo();

	/**
	 * Returns a new object of class '<em>Search Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search Video</em>'.
	 * @generated
	 */
	SearchVideo createSearchVideo();

	/**
	 * Returns a new object of class '<em>Video Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Statistics</em>'.
	 * @generated
	 */
	VideoStatistics createVideoStatistics();

	/**
	 * Returns a new object of class '<em>Operation Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Result</em>'.
	 * @generated
	 */
	OperationResult createOperationResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VideostreamPackage getVideostreamPackage();

} //VideostreamFactory
