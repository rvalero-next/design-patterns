package next.catkpis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"next.catapi", "next.catkpis"})
public class CatKpisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatKpisApplication.class, args);
	}

}
