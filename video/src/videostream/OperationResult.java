/**
 */
package videostream;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoStreamAPITest.OperationResult#getTotalResults <em>Total Results</em>}</li>
 *   <li>{@link VideoStreamAPITest.OperationResult#getOperation <em>Operation</em>}</li>
 *   <li>{@link VideoStreamAPITest.OperationResult#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getOperationResult()
 * @model
 * @generated
 */
public interface OperationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Results</em>' attribute.
	 * @see #setTotalResults(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getOperationResult_TotalResults()
	 * @model
	 * @generated
	 */
	int getTotalResults();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.OperationResult#getTotalResults <em>Total Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Results</em>' attribute.
	 * @see #getTotalResults()
	 * @generated
	 */
	void setTotalResults(int value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(VideoOperation)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getOperationResult_Operation()
	 * @model containment="true"
	 * @generated
	 */
	VideoOperation getOperation();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.OperationResult#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(VideoOperation value);

	/**
	 * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
	 * The list contents are of type {@link VideoStreamAPITest.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' containment reference list.
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getOperationResult_Videos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideos();

} // OperationResult
