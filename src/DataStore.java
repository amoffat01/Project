public interface DataStore {
	Iterable<Integer> read(Input input);
	WriteResult appendSingleResult(Output output, String result);
}
