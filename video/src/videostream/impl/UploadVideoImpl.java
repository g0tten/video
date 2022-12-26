/**
 */
package videostream.impl;

import videostream.UploadVideo;
import videostream.Video;
import videostream.VideostreamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Upload Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videostream.impl.UploadVideoImpl#getVideo <em>Video</em>}</li>
 *   <li>{@link videostream.impl.UploadVideoImpl#getLocalPath <em>Local Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UploadVideoImpl extends VideoOperationImpl implements UploadVideo {
	/**
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected Video video;

	/**
	 * The default value of the '{@link #getLocalPath() <em>Local Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPath()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalPath() <em>Local Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPath()
	 * @generated
	 * @ordered
	 */
	protected String localPath = LOCAL_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UploadVideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideostreamPackage.Literals.UPLOAD_VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video getVideo() {
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVideo(Video newVideo, NotificationChain msgs) {
		Video oldVideo = video;
		video = newVideo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideostreamPackage.UPLOAD_VIDEO__VIDEO, oldVideo, newVideo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideo(Video newVideo) {
		if (newVideo != video) {
			NotificationChain msgs = null;
			if (video != null)
				msgs = ((InternalEObject)video).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.UPLOAD_VIDEO__VIDEO, null, msgs);
			if (newVideo != null)
				msgs = ((InternalEObject)newVideo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.UPLOAD_VIDEO__VIDEO, null, msgs);
			msgs = basicSetVideo(newVideo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.UPLOAD_VIDEO__VIDEO, newVideo, newVideo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalPath() {
		return localPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPath(String newLocalPath) {
		String oldLocalPath = localPath;
		localPath = newLocalPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.UPLOAD_VIDEO__LOCAL_PATH, oldLocalPath, localPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideostreamPackage.UPLOAD_VIDEO__VIDEO:
				return basicSetVideo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideostreamPackage.UPLOAD_VIDEO__VIDEO:
				return getVideo();
			case VideostreamPackage.UPLOAD_VIDEO__LOCAL_PATH:
				return getLocalPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideostreamPackage.UPLOAD_VIDEO__VIDEO:
				setVideo((Video)newValue);
				return;
			case VideostreamPackage.UPLOAD_VIDEO__LOCAL_PATH:
				setLocalPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VideostreamPackage.UPLOAD_VIDEO__VIDEO:
				setVideo((Video)null);
				return;
			case VideostreamPackage.UPLOAD_VIDEO__LOCAL_PATH:
				setLocalPath(LOCAL_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VideostreamPackage.UPLOAD_VIDEO__VIDEO:
				return video != null;
			case VideostreamPackage.UPLOAD_VIDEO__LOCAL_PATH:
				return LOCAL_PATH_EDEFAULT == null ? localPath != null : !LOCAL_PATH_EDEFAULT.equals(localPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (localPath: ");
		result.append(localPath);
		result.append(')');
		return result.toString();
	}

} //UploadVideoImpl
