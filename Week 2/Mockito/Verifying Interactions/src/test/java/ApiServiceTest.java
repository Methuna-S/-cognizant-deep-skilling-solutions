import org.junit.jupiter.api.Test;

import com.example.ApiService;
import com.example.ExternalApi;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApiServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        ApiService service = new ApiService(mockApi);
        String result = service.fetchData();
        assertEquals("Mock Data", result);
        verify(mockApi).getData();
    }

    @Test
    public void testExternalApiWithArgument() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getDataById(42)).thenReturn("Data for 42");
        ApiService service = new ApiService(mockApi);
        String result = service.fetchDataById(42);
        assertEquals("Data for 42", result);
        verify(mockApi).getDataById(42);
    }
}
