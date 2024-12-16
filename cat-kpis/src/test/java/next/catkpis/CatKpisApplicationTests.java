package next.catkpis;

import next.catapi.application.CatService;
import next.catapi.domain.Cat;
import next.catkpis.application.KpiService;
import next.catkpis.domain.Kpi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@ActiveProfiles("test-double")
@SpringBootTest
class CatKpisApplicationTests {

	@Autowired
	private CatService catService;

	@Autowired
	private KpiService kpiService;

	@Disabled
	@Test
	void givenKpiService_whenGetKpisAverageIntelligence_thenObtain2_5() {

	}

	@Disabled
	@Test
	void givenKpiService_whenGetLifeSpan_thenObtain2_5() {

	}

	@Disabled
	@Test
	void givenKpiService_whenGetWeight_thenObtainX_X() {

	}

}
