package schneider.jan.springmonitoring.cats;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatController {

    @GetMapping("/")
    public ModelAndView getIndex(ModelAndView modelAndView) {
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}
