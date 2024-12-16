package next.catapi.unit;

import next.catapi.application.CatService;
import next.catapi.domain.Cat;
import next.catapi.infrastructure.CatTestDouble;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CatServiceUnitTests {

	private CatService catService;

	@BeforeEach
	void setUp() {
		this.catService = new CatService(new CatTestDouble());
	}

	@Test
	void whenGETCats_thenObtainAListOfCats() {
		List<Cat> cats = this.catService.getCats();

        Assertions.assertFalse(cats.isEmpty());
	}

}
