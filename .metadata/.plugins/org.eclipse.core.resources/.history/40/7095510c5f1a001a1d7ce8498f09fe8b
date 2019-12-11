package schoolweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import schoolweb.data.Student;
import schoolweb.service.StudentWebService;


@Controller
public class StudentWebController {
	
	@Autowired
	private StudentWebService studentWebService;
	
	@RequestMapping(value="/createStudent", method = RequestMethod.POST)
	public String createStudent(ModelMap model, @RequestParam String sName, @RequestParam String sLName, @RequestParam String rollno, @RequestParam String grade, @RequestParam String section, @RequestParam String emailId){
	     Student newstudent=new Student();
		newstudent.setSName(sName);
		newstudent.setSLName(sLName);
		newstudent.setRollno(Integer.parseInt(rollno));
    	newstudent.setGrade(Integer.parseInt(grade));
		newstudent.setSection(section);
		newstudent.setEmailId(emailId);
		if (newstudent.isEmailValid(newstudent.getEmailId()))
		{
			studentWebService.createStudent(newstudent);
			model.put("errorMessage", "Student Created");
			 return "welcome";
		}
		else
		{
	         model.put("errorMessage", "Invalid Email Id");
	         return "createStudent";
	    }
       
    }


}
