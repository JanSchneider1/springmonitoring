package schneider.jan.springmonitoring.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Endpoint(id = "hello")
public class MyEndpoint {

    @ReadOperation
    public Map<String, String> get() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Hello", "Jan");
        return map;
    }
}
