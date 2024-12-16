package next.catapi.application;

import next.catapi.domain.Cat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatService {

    private static final Logger log = LoggerFactory.getLogger(CatService.class);
    private final CatClient catClient;

    public CatService(CatClient catClient) {
        this.catClient = catClient;
    }

    public List<Cat> getCats() {
        log.info("Retrieving cats with " + this.catClient.getClass().getSimpleName() + " implementation");
        return this.catClient.getCats().stream().map(Cat::new).collect(Collectors.toList());
    }
}
