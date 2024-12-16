package next.catapi.unit;

import next.catapi.application.CatService;
import next.catapi.domain.Cat;
import next.catapi.infrastructure.CatTestDouble;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatDomainTests {

	private CatService catService;

	@BeforeEach
	void setUp() {
		this.catService = new CatService(new CatTestDouble(CatMapMother.getAbyssinianCatMap()));
	}

	@Test
	void givenAbyssininanCat_whenAskName_thenGetAbyssininan() {
		Cat cat = this.catService.getCats().getFirst();

        Assertions.assertEquals(cat.getName(), "Abyssinian");
	}

	@Test
	void givenAbyssininanCat_whenAskLifeSpan_thenGet15() {
		Cat cat = this.catService.getCats().getFirst();

		Assertions.assertEquals(14, cat.getLifeSpan());
	}

	@Test
	void givenAbyssininanCat_whenAskIntelligence_thenGet5() {
		Cat cat = this.catService.getCats().getFirst();

		Assertions.assertEquals(5, cat.getIntelligence());
	}

	@Test
	void givenAbyssininanCat_whenAskWeight_thenGet5() {
		Cat cat = this.catService.getCats().getFirst();

		Assertions.assertEquals(5, cat.getWeightInKgs());
	}

}
