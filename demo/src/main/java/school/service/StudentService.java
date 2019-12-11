package school.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import school.data.Student;
import school.repository.StudentRepository;

@Component
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	    
	public Student getStudentByRegId(String regId) {
		return studentRepository.findByRegId(Integer.valueOf(regId));
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
	public List<Student> getStudentByGradeNSec(String gr, String sec) {
		
		return studentRepository.findByGradeNSection(Integer.valueOf(gr),sec);
	}
	
	public void createStudent(Student student) {
		studentRepository.save(student);
	}

}
