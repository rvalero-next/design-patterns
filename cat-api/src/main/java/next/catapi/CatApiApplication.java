package next.catapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CatApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatApiApplication.class, args);
	}

}
