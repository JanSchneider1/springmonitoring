package schneider.jan.springmonitoring.cats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatController {

    private final CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/")
    public ModelAndView getIndex(ModelAndView modelAndView) {
        modelAndView.addObject("cat", new Cat());
        modelAndView.addObject("cats", catService.getAllCats());
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView postCat(@ModelAttribute Cat cat, ModelAndView modelAndView) {
        if (!(cat.getName().isEmpty() || cat.getFurColor().isEmpty() || cat.getFavoriteFood().isEmpty())){
            catService.save(cat);
        }
        modelAndView.addObject("cat", new Cat());
        modelAndView.addObject("cats", catService.getAllCats());
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}
