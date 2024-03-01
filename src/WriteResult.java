public interface WriteResult {
	static void add(int factorial) {
	}

	WriteResultStatus getStatus();


	public static enum WriteResultStatus {
		SUCCESS,
		FAILURE;
	}
}
