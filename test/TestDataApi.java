import java.util.ArrayList;
import java.util.List;
public class TestDataApi implements DataStore{

    public List<Integer> readData(Input input) {
        if (input instanceof TestInputConfig) {
            return new ArrayList<>(((Input) input).getIntegers());
        }
    }
    public void clearOutputConfig(Output output) {
        if (output instanceof TestOutputConfig) {
            ((TestOutputConfig) output).getWritableStrings().clear();
        }
    }

}
