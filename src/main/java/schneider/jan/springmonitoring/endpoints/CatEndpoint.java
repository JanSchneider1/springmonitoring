package schneider.jan.springmonitoring.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import schneider.jan.springmonitoring.cats.CatService;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Endpoint(id = "cats")
public class CatEndpoint {

    private final CatService catService;

    @Autowired
    public CatEndpoint(CatService catService) {
        this.catService = catService;
    }

    @ReadOperation
    public Map<String, Object> get() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("count", catService.getAllCats().size());
        return map;
    }
}
