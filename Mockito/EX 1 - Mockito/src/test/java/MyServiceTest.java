import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // Create Mock
        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);

        // Stub Method
        when(mockApi.getData())
                .thenReturn("Mock Data");

        // Inject Mock
        MyService service =
                new MyService(mockApi);

        // Call Method
        String result =
                service.fetchData();

        // Check Result
        assertEquals("Mock Data", result);
    }
}

