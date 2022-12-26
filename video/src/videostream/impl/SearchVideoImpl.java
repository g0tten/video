/**
 */
package videostream.impl;

import videostream.Order;
import videostream.SearchVideo;
import videostream.VideostreamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videostream.impl.SearchVideoImpl#getMaxResults <em>Max Results</em>}</li>
 *   <li>{@link videostream.impl.SearchVideoImpl#getResultsPerPage <em>Results Per Page</em>}</li>
 *   <li>{@link videostream.impl.SearchVideoImpl#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link videostream.impl.SearchVideoImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link videostream.impl.SearchVideoImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchVideoImpl extends VideoOperationImpl implements SearchVideo {
	/**
	 * The default value of the '{@link #getMaxResults() <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResults()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RESULTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxResults() <em>Max Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResults()
	 * @generated
	 * @ordered
	 */
	protected int maxResults = MAX_RESULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultsPerPage() <em>Results Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsPerPage()
	 * @generated
	 * @ordered
	 */
	protected static final int RESULTS_PER_PAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResultsPerPage() <em>Results Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsPerPage()
	 * @generated
	 * @ordered
	 */
	protected int resultsPerPage = RESULTS_PER_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected static final Order ORDER_TYPE_EDEFAULT = Order.NONE;

	/**
	 * The cached value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected Order orderType = ORDER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchVideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideostreamPackage.Literals.SEARCH_VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxResults() {
		return maxResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResults(int newMaxResults) {
		int oldMaxResults = maxResults;
		maxResults = newMaxResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.SEARCH_VIDEO__MAX_RESULTS, oldMaxResults, maxResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResultsPerPage() {
		return resultsPerPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsPerPage(int newResultsPerPage) {
		int oldResultsPerPage = resultsPerPage;
		resultsPerPage = newResultsPerPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.SEARCH_VIDEO__RESULTS_PER_PAGE, oldResultsPerPage, resultsPerPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrderType() {
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderType(Order newOrderType) {
		Order oldOrderType = orderType;
		orderType = newOrderType == null ? ORDER_TYPE_EDEFAULT : newOrderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.SEARCH_VIDEO__ORDER_TYPE, oldOrderType, orderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.SEARCH_VIDEO__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.SEARCH_VIDEO__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideostreamPackage.SEARCH_VIDEO__MAX_RESULTS:
				return getMaxResults();
			case VideostreamPackage.SEARCH_VIDEO__RESULTS_PER_PAGE:
				return getResultsPerPage();
			case VideostreamPackage.SEARCH_VIDEO__ORDER_TYPE:
				return getOrderType();
			case VideostreamPackage.SEARCH_VIDEO__DURATION:
				return getDuration();
			case VideostreamPackage.SEARCH_VIDEO__QUERY:
				return getQuery();
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
			case VideostreamPackage.SEARCH_VIDEO__MAX_RESULTS:
				setMaxResults((Integer)newValue);
				return;
			case VideostreamPackage.SEARCH_VIDEO__RESULTS_PER_PAGE:
				setResultsPerPage((Integer)newValue);
				return;
			case VideostreamPackage.SEARCH_VIDEO__ORDER_TYPE:
				setOrderType((Order)newValue);
				return;
			case VideostreamPackage.SEARCH_VIDEO__DURATION:
				setDuration((Integer)newValue);
				return;
			case VideostreamPackage.SEARCH_VIDEO__QUERY:
				setQuery((String)newValue);
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
			case VideostreamPackage.SEARCH_VIDEO__MAX_RESULTS:
				setMaxResults(MAX_RESULTS_EDEFAULT);
				return;
			case VideostreamPackage.SEARCH_VIDEO__RESULTS_PER_PAGE:
				setResultsPerPage(RESULTS_PER_PAGE_EDEFAULT);
				return;
			case VideostreamPackage.SEARCH_VIDEO__ORDER_TYPE:
				setOrderType(ORDER_TYPE_EDEFAULT);
				return;
			case VideostreamPackage.SEARCH_VIDEO__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case VideostreamPackage.SEARCH_VIDEO__QUERY:
				setQuery(QUERY_EDEFAULT);
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
			case VideostreamPackage.SEARCH_VIDEO__MAX_RESULTS:
				return maxResults != MAX_RESULTS_EDEFAULT;
			case VideostreamPackage.SEARCH_VIDEO__RESULTS_PER_PAGE:
				return resultsPerPage != RESULTS_PER_PAGE_EDEFAULT;
			case VideostreamPackage.SEARCH_VIDEO__ORDER_TYPE:
				return orderType != ORDER_TYPE_EDEFAULT;
			case VideostreamPackage.SEARCH_VIDEO__DURATION:
				return duration != DURATION_EDEFAULT;
			case VideostreamPackage.SEARCH_VIDEO__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
		result.append(" (maxResults: ");
		result.append(maxResults);
		result.append(", resultsPerPage: ");
		result.append(resultsPerPage);
		result.append(", orderType: ");
		result.append(orderType);
		result.append(", duration: ");
		result.append(duration);
		result.append(", query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

} //SearchVideoImpl
