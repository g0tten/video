/**
 */
package videostream;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link VideoStreamAPITest.UpdateVideo#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getUpdateVideo()
 * @model
 * @generated
 */
public interface UpdateVideo extends VideoOperation {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference.
	 * @see #setVideo(Video)
	 * @see VideoStreamAPITest.VideoStreamAPITestPackage#getUpdateVideo_Video()
	 * @model
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link VideoStreamAPITest.UpdateVideo#getVideo <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

} // UpdateVideo
