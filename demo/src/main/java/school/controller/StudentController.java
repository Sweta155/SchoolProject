package school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import school.data.Student;
import school.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping("/student/{gr}/{sec}")
	public List<Student> getStudentByGradeNSec(@PathVariable(value = "gr") String gr,
			@PathVariable(value = "sec") String sec) {
		return studentService.getStudentByGradeNSec(gr, sec);
	}

	@RequestMapping("/student/{reg}")
	public Student getStudentByRegId(@PathVariable(value = "reg") String reg) {
		return studentService.getStudentByRegId(reg);
	}

	@RequestMapping("/student")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@RequestMapping(method = RequestMethod.POST, path = "/student")
	public void createStudent(@RequestBody Student student) {
		if (student.isEmailValid(student.getEmailId()));
			studentService.createStudent(student);
			
	}

}
