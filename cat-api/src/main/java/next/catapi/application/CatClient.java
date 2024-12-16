package next.catapi.application;

import java.util.List;
import java.util.Map;

public interface CatClient {
    List<Map<String, Object>> getCats();
}
