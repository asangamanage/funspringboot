package fun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FunController {

    @RequestMapping("/")
    public String index(@RequestParam("funUrl") String funUrl, Model model) {
        model.addAttribute("funUrl", funUrl);
        return "index";
    }

}
