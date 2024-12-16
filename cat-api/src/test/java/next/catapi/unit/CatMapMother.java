package next.catapi.unit;

import java.util.List;
import java.util.Map;

public class CatMapMother {

    public static List<Map<String, Object>> getAbyssinianCatMap() {
        return List.of(Map.of(
                "id", "abys",
                "name", "Abyssinian",
                "weight", Map.of("metric", "4 - 6"),
                "life_span", "14 - 15 years",
                "intelligence", "5"
        ));
    }

}
