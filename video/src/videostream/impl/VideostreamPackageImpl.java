/**
 */
package videostream.impl;

import videostream.APIAuth;
import videostream.OperationResult;
import videostream.Order;
import videostream.SearchVideo;
import videostream.UpdateVideo;
import videostream.UploadVideo;
import videostream.Video;
import videostream.VideoAPITest;
import videostream.VideoOperation;
import videostream.VideoStatistics;
import videostream.VideostreamFactory;
import videostream.VideostreamPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideostreamPackageImpl extends EPackageImpl implements VideostreamPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoAPITestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uploadVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchVideoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see videostream.VideostreamPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VideostreamPackageImpl() {
		super(eNS_URI, VideostreamFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VideostreamPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VideostreamPackage init() {
		if (isInited) return (VideostreamPackage)EPackage.Registry.INSTANCE.getEPackage(VideostreamPackage.eNS_URI);

		// Obtain or create and register package
		VideostreamPackageImpl theVideostreamPackage = (VideostreamPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideostreamPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideostreamPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVideostreamPackage.createPackageContents();

		// Initialize created meta-data
		theVideostreamPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVideostreamPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VideostreamPackage.eNS_URI, theVideostreamPackage);
		return theVideostreamPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoAPITest() {
		return videoAPITestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoAPITest_Request() {
		return (EReference)videoAPITestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoAPITest_BaseURL() {
		return (EAttribute)videoAPITestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoAPITest_TestName() {
		return (EAttribute)videoAPITestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideoAPITest_Auth() {
		return (EReference)videoAPITestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIAuth() {
		return apiAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIAuth_Name() {
		return (EAttribute)apiAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIAuth_Key() {
		return (EAttribute)apiAuthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoOperation() {
		return videoOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoOperation_Path() {
		return (EAttribute)videoOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUploadVideo() {
		return uploadVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUploadVideo_Video() {
		return (EReference)uploadVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUploadVideo_LocalPath() {
		return (EAttribute)uploadVideoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Title() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Description() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Id() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVideo_Statistics() {
		return (EReference)videoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Tags() {
		return (EAttribute)videoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateVideo() {
		return updateVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateVideo_Video() {
		return (EReference)updateVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchVideo() {
		return searchVideoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchVideo_MaxResults() {
		return (EAttribute)searchVideoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchVideo_ResultsPerPage() {
		return (EAttribute)searchVideoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchVideo_OrderType() {
		return (EAttribute)searchVideoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchVideo_Duration() {
		return (EAttribute)searchVideoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchVideo_Query() {
		return (EAttribute)searchVideoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoStatistics() {
		return videoStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoStatistics_ViewCount() {
		return (EAttribute)videoStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoStatistics_LikeCount() {
		return (EAttribute)videoStatisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoStatistics_FavoriteCount() {
		return (EAttribute)videoStatisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoStatistics_CommentCount() {
		return (EAttribute)videoStatisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationResult() {
		return operationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResult_TotalResults() {
		return (EAttribute)operationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_Operation() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_Videos() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideostreamFactory getVideostreamFactory() {
		return (VideostreamFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		videoAPITestEClass = createEClass(VIDEO_API_TEST);
		createEReference(videoAPITestEClass, VIDEO_API_TEST__REQUEST);
		createEAttribute(videoAPITestEClass, VIDEO_API_TEST__BASE_URL);
		createEAttribute(videoAPITestEClass, VIDEO_API_TEST__TEST_NAME);
		createEReference(videoAPITestEClass, VIDEO_API_TEST__AUTH);

		apiAuthEClass = createEClass(API_AUTH);
		createEAttribute(apiAuthEClass, API_AUTH__NAME);
		createEAttribute(apiAuthEClass, API_AUTH__KEY);

		videoOperationEClass = createEClass(VIDEO_OPERATION);
		createEAttribute(videoOperationEClass, VIDEO_OPERATION__PATH);

		uploadVideoEClass = createEClass(UPLOAD_VIDEO);
		createEReference(uploadVideoEClass, UPLOAD_VIDEO__VIDEO);
		createEAttribute(uploadVideoEClass, UPLOAD_VIDEO__LOCAL_PATH);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__TITLE);
		createEAttribute(videoEClass, VIDEO__DESCRIPTION);
		createEAttribute(videoEClass, VIDEO__ID);
		createEReference(videoEClass, VIDEO__STATISTICS);
		createEAttribute(videoEClass, VIDEO__TAGS);

		updateVideoEClass = createEClass(UPDATE_VIDEO);
		createEReference(updateVideoEClass, UPDATE_VIDEO__VIDEO);

		searchVideoEClass = createEClass(SEARCH_VIDEO);
		createEAttribute(searchVideoEClass, SEARCH_VIDEO__MAX_RESULTS);
		createEAttribute(searchVideoEClass, SEARCH_VIDEO__RESULTS_PER_PAGE);
		createEAttribute(searchVideoEClass, SEARCH_VIDEO__ORDER_TYPE);
		createEAttribute(searchVideoEClass, SEARCH_VIDEO__DURATION);
		createEAttribute(searchVideoEClass, SEARCH_VIDEO__QUERY);

		videoStatisticsEClass = createEClass(VIDEO_STATISTICS);
		createEAttribute(videoStatisticsEClass, VIDEO_STATISTICS__VIEW_COUNT);
		createEAttribute(videoStatisticsEClass, VIDEO_STATISTICS__LIKE_COUNT);
		createEAttribute(videoStatisticsEClass, VIDEO_STATISTICS__FAVORITE_COUNT);
		createEAttribute(videoStatisticsEClass, VIDEO_STATISTICS__COMMENT_COUNT);

		operationResultEClass = createEClass(OPERATION_RESULT);
		createEAttribute(operationResultEClass, OPERATION_RESULT__TOTAL_RESULTS);
		createEReference(operationResultEClass, OPERATION_RESULT__OPERATION);
		createEReference(operationResultEClass, OPERATION_RESULT__VIDEOS);

		// Create enums
		orderEEnum = createEEnum(ORDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uploadVideoEClass.getESuperTypes().add(this.getVideoOperation());
		updateVideoEClass.getESuperTypes().add(this.getVideoOperation());
		searchVideoEClass.getESuperTypes().add(this.getVideoOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(videoAPITestEClass, VideoAPITest.class, "VideoAPITest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVideoAPITest_Request(), this.getVideoOperation(), null, "request", null, 1, 1, VideoAPITest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoAPITest_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, VideoAPITest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoAPITest_TestName(), ecorePackage.getEString(), "testName", null, 0, 1, VideoAPITest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideoAPITest_Auth(), this.getAPIAuth(), null, "auth", null, 0, 1, VideoAPITest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiAuthEClass, APIAuth.class, "APIAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIAuth_Name(), ecorePackage.getEString(), "name", null, 0, 1, APIAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPIAuth_Key(), ecorePackage.getEString(), "key", null, 0, 1, APIAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoOperationEClass, VideoOperation.class, "VideoOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoOperation_Path(), ecorePackage.getEString(), "path", null, 0, 1, VideoOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uploadVideoEClass, UploadVideo.class, "UploadVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUploadVideo_Video(), this.getVideo(), null, "video", null, 0, 1, UploadVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUploadVideo_LocalPath(), ecorePackage.getEString(), "localPath", null, 0, 1, UploadVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Title(), ecorePackage.getEString(), "Title", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Id(), ecorePackage.getEString(), "Id", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVideo_Statistics(), this.getVideoStatistics(), null, "statistics", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideo_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateVideoEClass, UpdateVideo.class, "UpdateVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateVideo_Video(), this.getVideo(), null, "video", null, 0, 1, UpdateVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchVideoEClass, SearchVideo.class, "SearchVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchVideo_MaxResults(), ecorePackage.getEInt(), "maxResults", null, 0, 1, SearchVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchVideo_ResultsPerPage(), ecorePackage.getEInt(), "resultsPerPage", null, 0, 1, SearchVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchVideo_OrderType(), this.getOrder(), "orderType", null, 0, 1, SearchVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchVideo_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, SearchVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchVideo_Query(), ecorePackage.getEString(), "query", null, 1, 1, SearchVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoStatisticsEClass, VideoStatistics.class, "VideoStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoStatistics_ViewCount(), ecorePackage.getEInt(), "viewCount", null, 0, 1, VideoStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoStatistics_LikeCount(), ecorePackage.getEInt(), "likeCount", null, 0, 1, VideoStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoStatistics_FavoriteCount(), ecorePackage.getEInt(), "favoriteCount", null, 0, 1, VideoStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoStatistics_CommentCount(), ecorePackage.getEInt(), "commentCount", null, 0, 1, VideoStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationResultEClass, OperationResult.class, "OperationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationResult_TotalResults(), ecorePackage.getEInt(), "totalResults", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_Operation(), this.getVideoOperation(), null, "operation", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_Videos(), this.getVideo(), null, "videos", null, 0, -1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.NONE);
		addEEnumLiteral(orderEEnum, Order.RATING);
		addEEnumLiteral(orderEEnum, Order.PLAYS);
		addEEnumLiteral(orderEEnum, Order.DATE);

		// Create resource
		createResource(eNS_URI);
	}

} //VideostreamPackageImpl
