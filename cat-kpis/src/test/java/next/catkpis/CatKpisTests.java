package next.catkpis;

import next.catapi.application.CatService;
import next.catkpis.application.KpiService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test-double")
@SpringBootTest
class CatKpisTests {

	@Autowired
	private CatService catService;

	@Autowired
	private KpiService kpiService;

	@Disabled
	@Test
	void givenKpiService_whenGetAverageIntelligenceKpi_thenObtain2_5() {

	}

	@Disabled
	@Test
	void givenKpiService_whenGetAverageGetLifeSpanKpi_thenObtain2_5() {

	}

	@Disabled
	@Test
	void givenKpiService_whenGetAverageWeightKpi_thenObtainX_X() {

	}

}
