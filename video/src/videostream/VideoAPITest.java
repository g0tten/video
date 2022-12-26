/**
 */
package videostream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video API Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoStreamAPITest.VideoAPITest#getRequest <em>Request</em>}</li>
 *   <li>{@link VideoStreamAPITest.VideoAPITest#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link VideoStreamAPITest.VideoAPITest#getTestName <em>Test Name</em>}</li>
 *   <li>{@link VideoStreamAPITest.VideoAPITest#getAuth <em>Auth</em>}</li>
 * </ul>
 *
 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoAPITest()
 * @model
 * @generated
 */
public interface VideoAPITest extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(VideoOperation)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoAPITest_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VideoOperation getRequest();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoAPITest#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(VideoOperation value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoAPITest_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoAPITest#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Name</em>' attribute.
	 * @see #setTestName(String)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoAPITest_TestName()
	 * @model
	 * @generated
	 */
	String getTestName();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoAPITest#getTestName <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Name</em>' attribute.
	 * @see #getTestName()
	 * @generated
	 */
	void setTestName(String value);

	/**
	 * Returns the value of the '<em><b>Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth</em>' containment reference.
	 * @see #setAuth(APIAuth)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoAPITest_Auth()
	 * @model containment="true"
	 * @generated
	 */
	APIAuth getAuth();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoAPITest#getAuth <em>Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth</em>' containment reference.
	 * @see #getAuth()
	 * @generated
	 */
	void setAuth(APIAuth value);

} // VideoAPITest
