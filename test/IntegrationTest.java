import java.util.Arrays;
import java.util.List;

public class IntegrationTest {
    public void integrationTest(){
        List<Integer> initialInput = Arrays.asList(1, 10, 25);
        TestInputConfig inputConfig = new TestInputConfig(initialInput);
        TestOutputConfig outputConfig = new TestOutputConfig();
        TestDataApi dataStore = new TestDataApi();

        ComputeEngine computeEngine = new ComputeEngine();
    }
}
