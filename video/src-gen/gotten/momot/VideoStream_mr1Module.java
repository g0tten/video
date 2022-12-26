package gotten.momot;

public interface VideoStream_mr1Module {
	public static interface DecMaxResults {
		static interface Parameter {
			String X = DecMaxResults.NAME + VideoStream_mr1Module.SEPARATOR + "x";
		}

		static String NAME = VideoStream_mr1Module.MODULE + VideoStream_mr1Module.SEPARATOR + "decMaxResults";
	}

	static String SEPARATOR = "::";
	static String FILE_NAME = "VideoStream_mr1";
	static String MODULE_NAME = "videostream";
	static String MODULE = FILE_NAME + SEPARATOR + MODULE_NAME;
}
