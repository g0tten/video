/**
 */
package videostream.impl;

import videostream.APIAuth;
import videostream.VideoAPITest;
import videostream.VideoOperation;
import videostream.VideostreamPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video API Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videostream.impl.VideoAPITestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link videostream.impl.VideoAPITestImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link videostream.impl.VideoAPITestImpl#getTestName <em>Test Name</em>}</li>
 *   <li>{@link videostream.impl.VideoAPITestImpl#getAuth <em>Auth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoAPITestImpl extends MinimalEObjectImpl.Container implements VideoAPITest {
	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected VideoOperation request;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestName() <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestName() <em>Test Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestName()
	 * @generated
	 * @ordered
	 */
	protected String testName = TEST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuth() <em>Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuth()
	 * @generated
	 * @ordered
	 */
	protected APIAuth auth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoAPITestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideostreamPackage.Literals.VIDEO_API_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoOperation getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(VideoOperation newRequest, NotificationChain msgs) {
		VideoOperation oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_API_TEST__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(VideoOperation newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.VIDEO_API_TEST__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.VIDEO_API_TEST__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_API_TEST__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_API_TEST__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestName(String newTestName) {
		String oldTestName = testName;
		testName = newTestName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_API_TEST__TEST_NAME, oldTestName, testName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIAuth getAuth() {
		return auth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuth(APIAuth newAuth, NotificationChain msgs) {
		APIAuth oldAuth = auth;
		auth = newAuth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_API_TEST__AUTH, oldAuth, newAuth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuth(APIAuth newAuth) {
		if (newAuth != auth) {
			NotificationChain msgs = null;
			if (auth != null)
				msgs = ((InternalEObject)auth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.VIDEO_API_TEST__AUTH, null, msgs);
			if (newAuth != null)
				msgs = ((InternalEObject)newAuth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.VIDEO_API_TEST__AUTH, null, msgs);
			msgs = basicSetAuth(newAuth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_API_TEST__AUTH, newAuth, newAuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideostreamPackage.VIDEO_API_TEST__REQUEST:
				return basicSetRequest(null, msgs);
			case VideostreamPackage.VIDEO_API_TEST__AUTH:
				return basicSetAuth(null, msgs);
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
			case VideostreamPackage.VIDEO_API_TEST__REQUEST:
				return getRequest();
			case VideostreamPackage.VIDEO_API_TEST__BASE_URL:
				return getBaseURL();
			case VideostreamPackage.VIDEO_API_TEST__TEST_NAME:
				return getTestName();
			case VideostreamPackage.VIDEO_API_TEST__AUTH:
				return getAuth();
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
			case VideostreamPackage.VIDEO_API_TEST__REQUEST:
				setRequest((VideoOperation)newValue);
				return;
			case VideostreamPackage.VIDEO_API_TEST__BASE_URL:
				setBaseURL((String)newValue);
				return;
			case VideostreamPackage.VIDEO_API_TEST__TEST_NAME:
				setTestName((String)newValue);
				return;
			case VideostreamPackage.VIDEO_API_TEST__AUTH:
				setAuth((APIAuth)newValue);
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
			case VideostreamPackage.VIDEO_API_TEST__REQUEST:
				setRequest((VideoOperation)null);
				return;
			case VideostreamPackage.VIDEO_API_TEST__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
				return;
			case VideostreamPackage.VIDEO_API_TEST__TEST_NAME:
				setTestName(TEST_NAME_EDEFAULT);
				return;
			case VideostreamPackage.VIDEO_API_TEST__AUTH:
				setAuth((APIAuth)null);
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
			case VideostreamPackage.VIDEO_API_TEST__REQUEST:
				return request != null;
			case VideostreamPackage.VIDEO_API_TEST__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
			case VideostreamPackage.VIDEO_API_TEST__TEST_NAME:
				return TEST_NAME_EDEFAULT == null ? testName != null : !TEST_NAME_EDEFAULT.equals(testName);
			case VideostreamPackage.VIDEO_API_TEST__AUTH:
				return auth != null;
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
		result.append(" (baseURL: ");
		result.append(baseURL);
		result.append(", testName: ");
		result.append(testName);
		result.append(')');
		return result.toString();
	}

} //VideoAPITestImpl
