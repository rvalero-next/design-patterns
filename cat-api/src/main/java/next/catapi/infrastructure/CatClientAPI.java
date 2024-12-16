package next.catapi.infrastructure;

import next.catapi.application.CatClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Profile("prod")
@FeignClient(name = "cat", url = "https://api.thecatapi.com/v1")
public interface CatClientAPI extends CatClient {
    @RequestMapping(method = RequestMethod.GET, value = "/breeds")
    List<Map<String, Object>> getCats();
}
