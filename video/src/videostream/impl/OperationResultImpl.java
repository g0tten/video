/**
 */
package videostream.impl;

import videostream.OperationResult;
import videostream.Video;
import videostream.VideoOperation;
import videostream.VideostreamPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videostream.impl.OperationResultImpl#getTotalResults <em>Total Results</em>}</li>
 *   <li>{@link videostream.impl.OperationResultImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link videostream.impl.OperationResultImpl#getVideos <em>Videos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationResultImpl extends MinimalEObjectImpl.Container implements OperationResult {
	/**
	 * The default value of the '{@link #getTotalResults() <em>Total Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalResults()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_RESULTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalResults() <em>Total Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalResults()
	 * @generated
	 * @ordered
	 */
	protected int totalResults = TOTAL_RESULTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected VideoOperation operation;

	/**
	 * The cached value of the '{@link #getVideos() <em>Videos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideos()
	 * @generated
	 * @ordered
	 */
	protected EList<Video> videos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideostreamPackage.Literals.OPERATION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalResults() {
		return totalResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalResults(int newTotalResults) {
		int oldTotalResults = totalResults;
		totalResults = newTotalResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.OPERATION_RESULT__TOTAL_RESULTS, oldTotalResults, totalResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(VideoOperation newOperation, NotificationChain msgs) {
		VideoOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideostreamPackage.OPERATION_RESULT__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(VideoOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.OPERATION_RESULT__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideostreamPackage.OPERATION_RESULT__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.OPERATION_RESULT__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Video> getVideos() {
		if (videos == null) {
			videos = new EObjectContainmentEList<Video>(Video.class, this, VideostreamPackage.OPERATION_RESULT__VIDEOS);
		}
		return videos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideostreamPackage.OPERATION_RESULT__OPERATION:
				return basicSetOperation(null, msgs);
			case VideostreamPackage.OPERATION_RESULT__VIDEOS:
				return ((InternalEList<?>)getVideos()).basicRemove(otherEnd, msgs);
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
			case VideostreamPackage.OPERATION_RESULT__TOTAL_RESULTS:
				return getTotalResults();
			case VideostreamPackage.OPERATION_RESULT__OPERATION:
				return getOperation();
			case VideostreamPackage.OPERATION_RESULT__VIDEOS:
				return getVideos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideostreamPackage.OPERATION_RESULT__TOTAL_RESULTS:
				setTotalResults((Integer)newValue);
				return;
			case VideostreamPackage.OPERATION_RESULT__OPERATION:
				setOperation((VideoOperation)newValue);
				return;
			case VideostreamPackage.OPERATION_RESULT__VIDEOS:
				getVideos().clear();
				getVideos().addAll((Collection<? extends Video>)newValue);
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
			case VideostreamPackage.OPERATION_RESULT__TOTAL_RESULTS:
				setTotalResults(TOTAL_RESULTS_EDEFAULT);
				return;
			case VideostreamPackage.OPERATION_RESULT__OPERATION:
				setOperation((VideoOperation)null);
				return;
			case VideostreamPackage.OPERATION_RESULT__VIDEOS:
				getVideos().clear();
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
			case VideostreamPackage.OPERATION_RESULT__TOTAL_RESULTS:
				return totalResults != TOTAL_RESULTS_EDEFAULT;
			case VideostreamPackage.OPERATION_RESULT__OPERATION:
				return operation != null;
			case VideostreamPackage.OPERATION_RESULT__VIDEOS:
				return videos != null && !videos.isEmpty();
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
		result.append(" (totalResults: ");
		result.append(totalResults);
		result.append(')');
		return result.toString();
	}

} //OperationResultImpl
