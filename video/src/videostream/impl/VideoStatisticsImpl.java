/**
 */
package videostream.impl;

import videostream.VideoStatistics;
import videostream.VideostreamPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videostream.impl.VideoStatisticsImpl#getViewCount <em>View Count</em>}</li>
 *   <li>{@link videostream.impl.VideoStatisticsImpl#getLikeCount <em>Like Count</em>}</li>
 *   <li>{@link videostream.impl.VideoStatisticsImpl#getFavoriteCount <em>Favorite Count</em>}</li>
 *   <li>{@link videostream.impl.VideoStatisticsImpl#getCommentCount <em>Comment Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoStatisticsImpl extends MinimalEObjectImpl.Container implements VideoStatistics {
	/**
	 * The default value of the '{@link #getViewCount() <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewCount()
	 * @generated
	 * @ordered
	 */
	protected static final int VIEW_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getViewCount() <em>View Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewCount()
	 * @generated
	 * @ordered
	 */
	protected int viewCount = VIEW_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLikeCount() <em>Like Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikeCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LIKE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLikeCount() <em>Like Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikeCount()
	 * @generated
	 * @ordered
	 */
	protected int likeCount = LIKE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFavoriteCount() <em>Favorite Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFavoriteCount()
	 * @generated
	 * @ordered
	 */
	protected static final int FAVORITE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFavoriteCount() <em>Favorite Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFavoriteCount()
	 * @generated
	 * @ordered
	 */
	protected int favoriteCount = FAVORITE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentCount() <em>Comment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMENT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommentCount() <em>Comment Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCount()
	 * @generated
	 * @ordered
	 */
	protected int commentCount = COMMENT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideostreamPackage.Literals.VIDEO_STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getViewCount() {
		return viewCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewCount(int newViewCount) {
		int oldViewCount = viewCount;
		viewCount = newViewCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_STATISTICS__VIEW_COUNT, oldViewCount, viewCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLikeCount() {
		return likeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikeCount(int newLikeCount) {
		int oldLikeCount = likeCount;
		likeCount = newLikeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_STATISTICS__LIKE_COUNT, oldLikeCount, likeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFavoriteCount() {
		return favoriteCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFavoriteCount(int newFavoriteCount) {
		int oldFavoriteCount = favoriteCount;
		favoriteCount = newFavoriteCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_STATISTICS__FAVORITE_COUNT, oldFavoriteCount, favoriteCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommentCount() {
		return commentCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentCount(int newCommentCount) {
		int oldCommentCount = commentCount;
		commentCount = newCommentCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideostreamPackage.VIDEO_STATISTICS__COMMENT_COUNT, oldCommentCount, commentCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideostreamPackage.VIDEO_STATISTICS__VIEW_COUNT:
				return getViewCount();
			case VideostreamPackage.VIDEO_STATISTICS__LIKE_COUNT:
				return getLikeCount();
			case VideostreamPackage.VIDEO_STATISTICS__FAVORITE_COUNT:
				return getFavoriteCount();
			case VideostreamPackage.VIDEO_STATISTICS__COMMENT_COUNT:
				return getCommentCount();
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
			case VideostreamPackage.VIDEO_STATISTICS__VIEW_COUNT:
				setViewCount((Integer)newValue);
				return;
			case VideostreamPackage.VIDEO_STATISTICS__LIKE_COUNT:
				setLikeCount((Integer)newValue);
				return;
			case VideostreamPackage.VIDEO_STATISTICS__FAVORITE_COUNT:
				setFavoriteCount((Integer)newValue);
				return;
			case VideostreamPackage.VIDEO_STATISTICS__COMMENT_COUNT:
				setCommentCount((Integer)newValue);
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
			case VideostreamPackage.VIDEO_STATISTICS__VIEW_COUNT:
				setViewCount(VIEW_COUNT_EDEFAULT);
				return;
			case VideostreamPackage.VIDEO_STATISTICS__LIKE_COUNT:
				setLikeCount(LIKE_COUNT_EDEFAULT);
				return;
			case VideostreamPackage.VIDEO_STATISTICS__FAVORITE_COUNT:
				setFavoriteCount(FAVORITE_COUNT_EDEFAULT);
				return;
			case VideostreamPackage.VIDEO_STATISTICS__COMMENT_COUNT:
				setCommentCount(COMMENT_COUNT_EDEFAULT);
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
			case VideostreamPackage.VIDEO_STATISTICS__VIEW_COUNT:
				return viewCount != VIEW_COUNT_EDEFAULT;
			case VideostreamPackage.VIDEO_STATISTICS__LIKE_COUNT:
				return likeCount != LIKE_COUNT_EDEFAULT;
			case VideostreamPackage.VIDEO_STATISTICS__FAVORITE_COUNT:
				return favoriteCount != FAVORITE_COUNT_EDEFAULT;
			case VideostreamPackage.VIDEO_STATISTICS__COMMENT_COUNT:
				return commentCount != COMMENT_COUNT_EDEFAULT;
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
		result.append(" (viewCount: ");
		result.append(viewCount);
		result.append(", likeCount: ");
		result.append(likeCount);
		result.append(", favoriteCount: ");
		result.append(favoriteCount);
		result.append(", commentCount: ");
		result.append(commentCount);
		result.append(')');
		return result.toString();
	}

} //VideoStatisticsImpl
