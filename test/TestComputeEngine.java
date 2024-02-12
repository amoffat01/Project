import static org.mockito.Mockito.*;

public class ComputeEngineSmokeTest {

    public static void main(String[] args) {
        int inputValue = 5;
        ComputeEngine computeEngineMock = mock(ComputeEngine.class);
        when(computeEngineMock.compute(inputValue)).thenReturn("mockedResult");
      
        String result = computeEngineMock.compute(inputValue);
      
        verifySmokeTestResult(result);
    }
