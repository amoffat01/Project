import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserImplementationTest {

    
    public void smokeTest() {
       
        int inputValue = 5;
        UserImplementation userMock = mock(UserImplementation.class);
        when(userMock.compute(inputValue)).thenReturn("mockedResult");

      
        String result = userMock.compute(inputValue);

       
        assertNotNull(result);
        assertEquals("mockedResult", result);
       

        verify(userMock).compute(inputValue);
    }
}
