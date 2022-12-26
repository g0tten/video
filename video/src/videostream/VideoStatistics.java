/**
 */
package videostream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoStreamAPITest.VideoStatistics#getViewCount <em>View Count</em>}</li>
 *   <li>{@link VideoStreamAPITest.VideoStatistics#getLikeCount <em>Like Count</em>}</li>
 *   <li>{@link VideoStreamAPITest.VideoStatistics#getFavoriteCount <em>Favorite Count</em>}</li>
 *   <li>{@link VideoStreamAPITest.VideoStatistics#getCommentCount <em>Comment Count</em>}</li>
 * </ul>
 *
 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoStatistics()
 * @model
 * @generated
 */
public interface VideoStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Count</em>' attribute.
	 * @see #setViewCount(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoStatistics_ViewCount()
	 * @model
	 * @generated
	 */
	int getViewCount();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoStatistics#getViewCount <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Count</em>' attribute.
	 * @see #getViewCount()
	 * @generated
	 */
	void setViewCount(int value);

	/**
	 * Returns the value of the '<em><b>Like Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Like Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Like Count</em>' attribute.
	 * @see #setLikeCount(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoStatistics_LikeCount()
	 * @model
	 * @generated
	 */
	int getLikeCount();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoStatistics#getLikeCount <em>Like Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Like Count</em>' attribute.
	 * @see #getLikeCount()
	 * @generated
	 */
	void setLikeCount(int value);

	/**
	 * Returns the value of the '<em><b>Favorite Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Favorite Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Favorite Count</em>' attribute.
	 * @see #setFavoriteCount(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoStatistics_FavoriteCount()
	 * @model
	 * @generated
	 */
	int getFavoriteCount();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoStatistics#getFavoriteCount <em>Favorite Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Favorite Count</em>' attribute.
	 * @see #getFavoriteCount()
	 * @generated
	 */
	void setFavoriteCount(int value);

	/**
	 * Returns the value of the '<em><b>Comment Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Count</em>' attribute.
	 * @see #setCommentCount(int)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getVideoStatistics_CommentCount()
	 * @model
	 * @generated
	 */
	int getCommentCount();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.VideoStatistics#getCommentCount <em>Comment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Count</em>' attribute.
	 * @see #getCommentCount()
	 * @generated
	 */
	void setCommentCount(int value);

} // VideoStatistics
