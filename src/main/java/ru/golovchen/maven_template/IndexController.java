package ru.golovchen.maven_template;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/")
    public String index(ModelMap map, @RequestParam(required = false) String query) {
        if (query != null) {
            List<String> words = searchService.find(query);
            map.addAttribute("words", words);
        }
        return "index";
    }
}