/**
 */
package videostream;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoStreamAPITest.SearchVideo#getMaxResults <em>Max Results</em>}</li>
 *   <li>{@link VideoStreamAPITest.SearchVideo#getResultsPerPage <em>Results Per Page</em>}</li>
 *   <li>{@link VideoStreamAPITest.SearchVideo#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link VideoStreamAPITest.SearchVideo#getDuration <em>Duration</em>}</li>
 *   <li>{@link VideoStreamAPITest.SearchVideo#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getSearchVideo()
 * @model
 * @generated
 */
public interface SearchVideo extends VideoOperation {
	/**
	 * Returns the value of the '<em><b>Max Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Results</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Results</em>' attribute.
	 * @see #setMaxResults(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getSearchVideo_MaxResults()
	 * @model
	 * @generated
	 */
	int getMaxResults();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.SearchVideo#getMaxResults <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Results</em>' attribute.
	 * @see #getMaxResults()
	 * @generated
	 */
	void setMaxResults(int value);

	/**
	 * Returns the value of the '<em><b>Results Per Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results Per Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results Per Page</em>' attribute.
	 * @see #setResultsPerPage(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getSearchVideo_ResultsPerPage()
	 * @model
	 * @generated
	 */
	int getResultsPerPage();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.SearchVideo#getResultsPerPage <em>Results Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results Per Page</em>' attribute.
	 * @see #getResultsPerPage()
	 * @generated
	 */
	void setResultsPerPage(int value);

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The literals are from the enumeration {@link VideoStreamAPITest.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see VideoStreamAPITest.Order
	 * @see #setOrderType(Order)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getSearchVideo_OrderType()
	 * @model
	 * @generated
	 */
	Order getOrderType();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.SearchVideo#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see VideoStreamAPITest.Order
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(Order value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getSearchVideo_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.SearchVideo#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getSearchVideo_Query()
	 * @model required="true"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.SearchVideo#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

} // SearchVideo
