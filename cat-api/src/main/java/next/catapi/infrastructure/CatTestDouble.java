package next.catapi.infrastructure;

import next.catapi.application.CatClient;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Profile("test-double")
@Service
public class CatTestDouble implements CatClient {

    private final List<Map<String, Object>> cats;

    public CatTestDouble() {
        this.cats = List.of(
                Map.of(
                "id", "acur",
                "name", "American Curl",
                "weight", Map.ofEntries(
                        Map.entry("imperial", "5 - 10"),
                        Map.entry("metric", "2 - 5")
                ),
                "life_span", "12 - 16 years",
                "intelligence", "3"
                ),
                Map.of(
                        "id", "aege",
                        "name", "Aegean",
                        "weight", Map.ofEntries(
                                Map.entry("imperial", "7 - 10"),
                                Map.entry("metric", "3 - 5")
                        ),
                        "life_span", "9 - 12 years",
                        "intelligence", "2"
                )
        );
    }

    public CatTestDouble(List<Map<String, Object>> cats) {
        this.cats = cats;
    }

    @Override
    public List<Map<String, Object>> getCats() {
        return this.cats;
    }
}
