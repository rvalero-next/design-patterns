package next.catapi.integration;

import next.catapi.application.CatService;
import next.catapi.domain.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@ActiveProfiles("test-double")
@SpringBootTest
class CatServiceIntegrationTests {

	@Autowired
	private CatService catService;

	@Test
	void whenGETCats_thenObtainAListOfCats() {
		List<Cat> cats = this.catService.getCats();

        Assertions.assertFalse(cats.isEmpty());
	}

}
