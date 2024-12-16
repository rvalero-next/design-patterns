package next.catkpis.application;

import next.catapi.application.CatService;
import next.catapi.domain.Cat;
import next.catkpis.domain.Kpi;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiService {

    CatService catService;

    public KpiService(CatService catService) {
        this.catService = catService;
    }

    public List<Kpi> getKpis() {
        return List.of(
                new Kpi("Average Intelligence", String.valueOf(
                        this.catService.getCats().stream()
                                .mapToDouble(Cat::getIntelligence)
                                .sum()
                )), new Kpi("Average Life Span", String.valueOf(
                        this.catService.getCats().stream()
                                        .mapToDouble(Cat::getLifeSpan)
                                        .sum()
                        )
                )
        );
    }
}
