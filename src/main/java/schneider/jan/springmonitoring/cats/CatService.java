package schneider.jan.springmonitoring.cats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private final CatRepository catRepository;

    @Autowired
    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    public Cat save(Cat cat) {
        return catRepository.save(cat);
    }
}
