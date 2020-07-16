package schneider.jan.springmonitoring.cats;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.FunctionCounter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;

@Service
public class CatService {

    private final CatRepository catRepository;

    private Counter catsAddedCounter = Metrics.counter("cats.added");
    private Counter catsQueryCallsCounter = Metrics.counter("cats.query.calls");
    private Counter catsQueriedCounter = Metrics.counter("cats.queried");

    @Autowired
    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAllCats() {
        catsQueryCallsCounter.increment();
        List<Cat> cats = catRepository.findAll();
        catsQueriedCounter.increment(cats.size());
        return cats;
    }

    public Cat save(Cat cat) {
        catsAddedCounter.increment();
        return catRepository.save(cat);
    }
}
