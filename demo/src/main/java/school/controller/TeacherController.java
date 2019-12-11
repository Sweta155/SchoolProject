package school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import school.data.Message;
import school.data.Student;
import school.data.Teacher;
import school.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping(method = RequestMethod.POST, path = "/teacher")
	public void createStudent(@RequestBody Teacher teacher) {
		teacherService.createTeacherDetails(teacher);
	}

	@RequestMapping("/teacher/{tn}")
	public List<Student> getStudentsByTeacherName(@PathVariable(value = "tn") String teacherName) {
		return teacherService.getStudentsByTeacherName(teacherName);
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/teacherSendMessage/{tn}")
	public void sendMessageToStudentsByTeacherName(@PathVariable(value = "tn") String teacherName,@RequestBody Message message) {
		teacherService.sendMessageToStudentsByTeacherName(teacherName,message);
	}
	
}
