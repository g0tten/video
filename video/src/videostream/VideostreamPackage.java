/**
 */
package videostream;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see VideoStreamAPITest.VideostreamFactory
 * @model kind="package"
 * @generated
 */
public interface VideostreamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VideoStreamAPITest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://videostream/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "videostream";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VideostreamPackage eINSTANCE = videostream.impl.VideostreamPackageImpl.init();

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.VideoAPITestImpl <em>Video API Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.VideoAPITestImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideoAPITest()
	 * @generated
	 */
	int VIDEO_API_TEST = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_API_TEST__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_API_TEST__BASE_URL = 1;

	/**
	 * The feature id for the '<em><b>Test Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_API_TEST__TEST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Auth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_API_TEST__AUTH = 3;

	/**
	 * The number of structural features of the '<em>Video API Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_API_TEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Video API Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_API_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.APIAuthImpl <em>API Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.APIAuthImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getAPIAuth()
	 * @generated
	 */
	int API_AUTH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_AUTH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_AUTH__KEY = 1;

	/**
	 * The number of structural features of the '<em>API Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_AUTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>API Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_AUTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.VideoOperationImpl <em>Video Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.VideoOperationImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideoOperation()
	 * @generated
	 */
	int VIDEO_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION__PATH = 0;

	/**
	 * The number of structural features of the '<em>Video Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Video Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.UploadVideoImpl <em>Upload Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.UploadVideoImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getUploadVideo()
	 * @generated
	 */
	int UPLOAD_VIDEO = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_VIDEO__PATH = VIDEO_OPERATION__PATH;

	/**
	 * The feature id for the '<em><b>Video</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_VIDEO__VIDEO = VIDEO_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_VIDEO__LOCAL_PATH = VIDEO_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Upload Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_VIDEO_FEATURE_COUNT = VIDEO_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Upload Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPLOAD_VIDEO_OPERATION_COUNT = VIDEO_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.VideoImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__ID = 2;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__STATISTICS = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TAGS = 4;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.UpdateVideoImpl <em>Update Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.UpdateVideoImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getUpdateVideo()
	 * @generated
	 */
	int UPDATE_VIDEO = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIDEO__PATH = VIDEO_OPERATION__PATH;

	/**
	 * The feature id for the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIDEO__VIDEO = VIDEO_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIDEO_FEATURE_COUNT = VIDEO_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_VIDEO_OPERATION_COUNT = VIDEO_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.SearchVideoImpl <em>Search Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.SearchVideoImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getSearchVideo()
	 * @generated
	 */
	int SEARCH_VIDEO = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO__PATH = VIDEO_OPERATION__PATH;

	/**
	 * The feature id for the '<em><b>Max Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO__MAX_RESULTS = VIDEO_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Results Per Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO__RESULTS_PER_PAGE = VIDEO_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO__ORDER_TYPE = VIDEO_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO__DURATION = VIDEO_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO__QUERY = VIDEO_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Search Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO_FEATURE_COUNT = VIDEO_OPERATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Search Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_VIDEO_OPERATION_COUNT = VIDEO_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.VideoStatisticsImpl <em>Video Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.VideoStatisticsImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideoStatistics()
	 * @generated
	 */
	int VIDEO_STATISTICS = 7;

	/**
	 * The feature id for the '<em><b>View Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_STATISTICS__VIEW_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Like Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_STATISTICS__LIKE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Favorite Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_STATISTICS__FAVORITE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Comment Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_STATISTICS__COMMENT_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Video Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_STATISTICS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Video Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.impl.OperationResultImpl <em>Operation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.impl.OperationResultImpl
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getOperationResult()
	 * @generated
	 */
	int OPERATION_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Total Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__TOTAL_RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__VIDEOS = 2;

	/**
	 * The number of structural features of the '<em>Operation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link VideoStreamAPITest.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see VideoStreamAPITest.Order
	 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 9;


	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.VideoAPITest <em>Video API Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video API Test</em>'.
	 * @see VideoStreamAPITest.VideoAPITest
	 * @generated
	 */
	EClass getVideoAPITest();

	/**
	 * Returns the meta object for the containment reference '{@link VideoStreamAPITest.VideoAPITest#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see VideoStreamAPITest.VideoAPITest#getRequest()
	 * @see #getVideoAPITest()
	 * @generated
	 */
	EReference getVideoAPITest_Request();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoAPITest#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see VideoStreamAPITest.VideoAPITest#getBaseURL()
	 * @see #getVideoAPITest()
	 * @generated
	 */
	EAttribute getVideoAPITest_BaseURL();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoAPITest#getTestName <em>Test Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Name</em>'.
	 * @see VideoStreamAPITest.VideoAPITest#getTestName()
	 * @see #getVideoAPITest()
	 * @generated
	 */
	EAttribute getVideoAPITest_TestName();

	/**
	 * Returns the meta object for the containment reference '{@link VideoStreamAPITest.VideoAPITest#getAuth <em>Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auth</em>'.
	 * @see VideoStreamAPITest.VideoAPITest#getAuth()
	 * @see #getVideoAPITest()
	 * @generated
	 */
	EReference getVideoAPITest_Auth();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.APIAuth <em>API Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Auth</em>'.
	 * @see VideoStreamAPITest.APIAuth
	 * @generated
	 */
	EClass getAPIAuth();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.APIAuth#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see VideoStreamAPITest.APIAuth#getName()
	 * @see #getAPIAuth()
	 * @generated
	 */
	EAttribute getAPIAuth_Name();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.APIAuth#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see VideoStreamAPITest.APIAuth#getKey()
	 * @see #getAPIAuth()
	 * @generated
	 */
	EAttribute getAPIAuth_Key();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.VideoOperation <em>Video Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Operation</em>'.
	 * @see VideoStreamAPITest.VideoOperation
	 * @generated
	 */
	EClass getVideoOperation();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoOperation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see VideoStreamAPITest.VideoOperation#getPath()
	 * @see #getVideoOperation()
	 * @generated
	 */
	EAttribute getVideoOperation_Path();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.UploadVideo <em>Upload Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upload Video</em>'.
	 * @see VideoStreamAPITest.UploadVideo
	 * @generated
	 */
	EClass getUploadVideo();

	/**
	 * Returns the meta object for the containment reference '{@link VideoStreamAPITest.UploadVideo#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Video</em>'.
	 * @see VideoStreamAPITest.UploadVideo#getVideo()
	 * @see #getUploadVideo()
	 * @generated
	 */
	EReference getUploadVideo_Video();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.UploadVideo#getLocalPath <em>Local Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Path</em>'.
	 * @see VideoStreamAPITest.UploadVideo#getLocalPath()
	 * @see #getUploadVideo()
	 * @generated
	 */
	EAttribute getUploadVideo_LocalPath();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see VideoStreamAPITest.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.Video#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see VideoStreamAPITest.Video#getTitle()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Title();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.Video#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see VideoStreamAPITest.Video#getDescription()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Description();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.Video#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see VideoStreamAPITest.Video#getId()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Id();

	/**
	 * Returns the meta object for the containment reference '{@link VideoStreamAPITest.Video#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see VideoStreamAPITest.Video#getStatistics()
	 * @see #getVideo()
	 * @generated
	 */
	EReference getVideo_Statistics();

	/**
	 * Returns the meta object for the attribute list '{@link VideoStreamAPITest.Video#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see VideoStreamAPITest.Video#getTags()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Tags();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.UpdateVideo <em>Update Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Video</em>'.
	 * @see VideoStreamAPITest.UpdateVideo
	 * @generated
	 */
	EClass getUpdateVideo();

	/**
	 * Returns the meta object for the reference '{@link VideoStreamAPITest.UpdateVideo#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video</em>'.
	 * @see VideoStreamAPITest.UpdateVideo#getVideo()
	 * @see #getUpdateVideo()
	 * @generated
	 */
	EReference getUpdateVideo_Video();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.SearchVideo <em>Search Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Video</em>'.
	 * @see VideoStreamAPITest.SearchVideo
	 * @generated
	 */
	EClass getSearchVideo();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.SearchVideo#getMaxResults <em>Max Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Results</em>'.
	 * @see VideoStreamAPITest.SearchVideo#getMaxResults()
	 * @see #getSearchVideo()
	 * @generated
	 */
	EAttribute getSearchVideo_MaxResults();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.SearchVideo#getResultsPerPage <em>Results Per Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results Per Page</em>'.
	 * @see VideoStreamAPITest.SearchVideo#getResultsPerPage()
	 * @see #getSearchVideo()
	 * @generated
	 */
	EAttribute getSearchVideo_ResultsPerPage();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.SearchVideo#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see VideoStreamAPITest.SearchVideo#getOrderType()
	 * @see #getSearchVideo()
	 * @generated
	 */
	EAttribute getSearchVideo_OrderType();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.SearchVideo#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see VideoStreamAPITest.SearchVideo#getDuration()
	 * @see #getSearchVideo()
	 * @generated
	 */
	EAttribute getSearchVideo_Duration();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.SearchVideo#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see VideoStreamAPITest.SearchVideo#getQuery()
	 * @see #getSearchVideo()
	 * @generated
	 */
	EAttribute getSearchVideo_Query();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.VideoStatistics <em>Video Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Statistics</em>'.
	 * @see VideoStreamAPITest.VideoStatistics
	 * @generated
	 */
	EClass getVideoStatistics();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoStatistics#getViewCount <em>View Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Count</em>'.
	 * @see VideoStreamAPITest.VideoStatistics#getViewCount()
	 * @see #getVideoStatistics()
	 * @generated
	 */
	EAttribute getVideoStatistics_ViewCount();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoStatistics#getLikeCount <em>Like Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Like Count</em>'.
	 * @see VideoStreamAPITest.VideoStatistics#getLikeCount()
	 * @see #getVideoStatistics()
	 * @generated
	 */
	EAttribute getVideoStatistics_LikeCount();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoStatistics#getFavoriteCount <em>Favorite Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Favorite Count</em>'.
	 * @see VideoStreamAPITest.VideoStatistics#getFavoriteCount()
	 * @see #getVideoStatistics()
	 * @generated
	 */
	EAttribute getVideoStatistics_FavoriteCount();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.VideoStatistics#getCommentCount <em>Comment Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Count</em>'.
	 * @see VideoStreamAPITest.VideoStatistics#getCommentCount()
	 * @see #getVideoStatistics()
	 * @generated
	 */
	EAttribute getVideoStatistics_CommentCount();

	/**
	 * Returns the meta object for class '{@link VideoStreamAPITest.OperationResult <em>Operation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Result</em>'.
	 * @see VideoStreamAPITest.OperationResult
	 * @generated
	 */
	EClass getOperationResult();

	/**
	 * Returns the meta object for the attribute '{@link VideoStreamAPITest.OperationResult#getTotalResults <em>Total Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Results</em>'.
	 * @see VideoStreamAPITest.OperationResult#getTotalResults()
	 * @see #getOperationResult()
	 * @generated
	 */
	EAttribute getOperationResult_TotalResults();

	/**
	 * Returns the meta object for the containment reference '{@link VideoStreamAPITest.OperationResult#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see VideoStreamAPITest.OperationResult#getOperation()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link VideoStreamAPITest.OperationResult#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Videos</em>'.
	 * @see VideoStreamAPITest.OperationResult#getVideos()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_Videos();

	/**
	 * Returns the meta object for enum '{@link VideoStreamAPITest.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see VideoStreamAPITest.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VideostreamFactory getVideostreamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.VideoAPITestImpl <em>Video API Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.VideoAPITestImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideoAPITest()
		 * @generated
		 */
		EClass VIDEO_API_TEST = eINSTANCE.getVideoAPITest();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_API_TEST__REQUEST = eINSTANCE.getVideoAPITest_Request();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_API_TEST__BASE_URL = eINSTANCE.getVideoAPITest_BaseURL();

		/**
		 * The meta object literal for the '<em><b>Test Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_API_TEST__TEST_NAME = eINSTANCE.getVideoAPITest_TestName();

		/**
		 * The meta object literal for the '<em><b>Auth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO_API_TEST__AUTH = eINSTANCE.getVideoAPITest_Auth();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.APIAuthImpl <em>API Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.APIAuthImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getAPIAuth()
		 * @generated
		 */
		EClass API_AUTH = eINSTANCE.getAPIAuth();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_AUTH__NAME = eINSTANCE.getAPIAuth_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_AUTH__KEY = eINSTANCE.getAPIAuth_Key();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.VideoOperationImpl <em>Video Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.VideoOperationImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideoOperation()
		 * @generated
		 */
		EClass VIDEO_OPERATION = eINSTANCE.getVideoOperation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_OPERATION__PATH = eINSTANCE.getVideoOperation_Path();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.UploadVideoImpl <em>Upload Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.UploadVideoImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getUploadVideo()
		 * @generated
		 */
		EClass UPLOAD_VIDEO = eINSTANCE.getUploadVideo();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPLOAD_VIDEO__VIDEO = eINSTANCE.getUploadVideo_Video();

		/**
		 * The meta object literal for the '<em><b>Local Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPLOAD_VIDEO__LOCAL_PATH = eINSTANCE.getUploadVideo_LocalPath();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.VideoImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__TITLE = eINSTANCE.getVideo_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DESCRIPTION = eINSTANCE.getVideo_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__ID = eINSTANCE.getVideo_Id();

		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIDEO__STATISTICS = eINSTANCE.getVideo_Statistics();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__TAGS = eINSTANCE.getVideo_Tags();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.UpdateVideoImpl <em>Update Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.UpdateVideoImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getUpdateVideo()
		 * @generated
		 */
		EClass UPDATE_VIDEO = eINSTANCE.getUpdateVideo();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_VIDEO__VIDEO = eINSTANCE.getUpdateVideo_Video();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.SearchVideoImpl <em>Search Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.SearchVideoImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getSearchVideo()
		 * @generated
		 */
		EClass SEARCH_VIDEO = eINSTANCE.getSearchVideo();

		/**
		 * The meta object literal for the '<em><b>Max Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_VIDEO__MAX_RESULTS = eINSTANCE.getSearchVideo_MaxResults();

		/**
		 * The meta object literal for the '<em><b>Results Per Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_VIDEO__RESULTS_PER_PAGE = eINSTANCE.getSearchVideo_ResultsPerPage();

		/**
		 * The meta object literal for the '<em><b>Order Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_VIDEO__ORDER_TYPE = eINSTANCE.getSearchVideo_OrderType();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_VIDEO__DURATION = eINSTANCE.getSearchVideo_Duration();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_VIDEO__QUERY = eINSTANCE.getSearchVideo_Query();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.VideoStatisticsImpl <em>Video Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.VideoStatisticsImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getVideoStatistics()
		 * @generated
		 */
		EClass VIDEO_STATISTICS = eINSTANCE.getVideoStatistics();

		/**
		 * The meta object literal for the '<em><b>View Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_STATISTICS__VIEW_COUNT = eINSTANCE.getVideoStatistics_ViewCount();

		/**
		 * The meta object literal for the '<em><b>Like Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_STATISTICS__LIKE_COUNT = eINSTANCE.getVideoStatistics_LikeCount();

		/**
		 * The meta object literal for the '<em><b>Favorite Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_STATISTICS__FAVORITE_COUNT = eINSTANCE.getVideoStatistics_FavoriteCount();

		/**
		 * The meta object literal for the '<em><b>Comment Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_STATISTICS__COMMENT_COUNT = eINSTANCE.getVideoStatistics_CommentCount();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.impl.OperationResultImpl <em>Operation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.impl.OperationResultImpl
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getOperationResult()
		 * @generated
		 */
		EClass OPERATION_RESULT = eINSTANCE.getOperationResult();

		/**
		 * The meta object literal for the '<em><b>Total Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULT__TOTAL_RESULTS = eINSTANCE.getOperationResult_TotalResults();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__OPERATION = eINSTANCE.getOperationResult_Operation();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__VIDEOS = eINSTANCE.getOperationResult_Videos();

		/**
		 * The meta object literal for the '{@link VideoStreamAPITest.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see VideoStreamAPITest.Order
		 * @see VideoStreamAPITest.impl.VideostreamPackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

	}

} //VideostreamPackage
