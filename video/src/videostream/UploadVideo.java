/**
 */
package videostream;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upload Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoStreamAPITest.UploadVideo#getVideo <em>Video</em>}</li>
 *   <li>{@link VideoStreamAPITest.UploadVideo#getLocalPath <em>Local Path</em>}</li>
 * </ul>
 *
 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getUploadVideo()
 * @model
 * @generated
 */
public interface UploadVideo extends VideoOperation {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' containment reference.
	 * @see #setVideo(Video)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getUploadVideo_Video()
	 * @model containment="true"
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.UploadVideo#getVideo <em>Video</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' containment reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

	/**
	 * Returns the value of the '<em><b>Local Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Path</em>' attribute.
	 * @see #setLocalPath(String)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getUploadVideo_LocalPath()
	 * @model
	 * @generated
	 */
	String getLocalPath();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.UploadVideo#getLocalPath <em>Local Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Path</em>' attribute.
	 * @see #getLocalPath()
	 * @generated
	 */
	void setLocalPath(String value);

} // UploadVideo
