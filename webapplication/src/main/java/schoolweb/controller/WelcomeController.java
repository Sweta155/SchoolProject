package schoolweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import schoolweb.service.WelcomeService;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @RequestMapping(value="/createStudent", method = RequestMethod.GET)
    public String createStudent(ModelMap model){
        return "createStudent";
    }
    
    @RequestMapping(value="/displayAllStudents", method = RequestMethod.GET)
    public String displayAllStudents(ModelMap model){
        return "displayAllStudents";
    }
}