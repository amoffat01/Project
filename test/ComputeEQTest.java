import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestComputeEngine {

    
    public void smokeTest() {
       
        int inputValue = 5;
        ComputeEngine computeEngineMock = mock(ComputeEngine.class);
        when(computeEngineMock.compute(inputValue)).thenReturn("mockedResult");

      
        String result = computeEngineMock.compute(inputValue);

       
        assertNotNull(result);
        assertEquals("mockedResult", result);
       

    
        verify(computeEngineMock).compute(inputValue);
    }
}