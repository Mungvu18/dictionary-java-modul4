package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    DictionaryService dictionaryService = new DictionaryService();
    @GetMapping("")
    public ModelAndView ShowTranslate(){
        ModelAndView modelAndView = new ModelAndView("display");
        return modelAndView;
    }
@PostMapping("")
    public ModelAndView translate(@RequestParam String search){
    ModelAndView modelAndView = new ModelAndView("display");
    String result = dictionaryService.findByInput(search);
    if (result==null)result="not found";
    modelAndView.addObject("result",result);
    return modelAndView;
}
}
