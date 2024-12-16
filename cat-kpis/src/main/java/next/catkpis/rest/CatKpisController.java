package next.catkpis.rest;

import next.catkpis.application.KpiService;
import next.catkpis.domain.Kpi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatKpisController {

    private final KpiService kpiService;

    public CatKpisController(KpiService kpiService) {
        this.kpiService = kpiService;
    }
    @GetMapping("/")
    public List<Kpi> getKpis() {
        return kpiService.getKpis();
    }

}