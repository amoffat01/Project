import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DataAPItest {

    
    public void smokeTest() {
       
        inputConfig inputValue = 5;
        outputConfig outputVal = 12;
        String strVal = "real";
        DataAPI dataAPIMock = mock(DataAPI.class);
        when(dataAPIMock.read(inputValue)).thenReturn("mockedResult");
        String result = dataAPIMock.read(inputValue);
        assertNotNull(result);
        assertEquals("mockedResult", result);
        verify(dataAPIMock).read(inputValue);

        when(dataAPIMock.appendSingleResult(outputVal, strVal)).thenReturn("mockedResult");
        result = dataAPIMock.appendSingleResult(outputVal, strVal);
        assertNotNull(result);
        assertEquals("mockedResult", result);
        verify(dataAPIMock).appendSingleResult(outputVal, strVal);
    }
}
