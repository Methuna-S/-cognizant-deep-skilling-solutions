import org.junit.jupiter.api.Test;

import com.example.ApiService;
import com.example.ExternalApi;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        ApiService service = new ApiService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
