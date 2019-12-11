package school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.data.Grade;
import school.data.Student;
import school.data.Teacher;
import school.service.GradeService;
import school.service.StudentService;
import school.service.TeacherService;

@RestController
public class SetUp {
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
    private GradeService gradeService;
	
	@RequestMapping("/setUpData")
	public void getAllStudent() {
		Student student= new Student();
		student.setRollno(1);
		student.setSName(new String("Sweta"));
		student.setSLName(new String("Agarwl"));
		student.setGrade(5);
		student.setSection(new String("A"));
		student.setEmailId(new String("meet2ankit@gmail.com"));
		studentService.createStudent(student);
		student=new Student();
		student.setRollno(2);
		student.setSName(new String("Sweta"));
		student.setSLName(new String("Gupta"));
		student.setGrade(5);
		student.setSection(new String("B"));
		student.setEmailId(new String("swetagupta.15@gmail.com"));
		studentService.createStudent(student);
		student=new Student();
		student.setRollno(3);
		student.setSName(new String("Ankit"));
		student.setSLName(new String("Gupta"));
		student.setGrade(5);
		student.setSection(new String("A"));
		student.setEmailId(new String("meet2gunisha@gmail.com"));
		studentService.createStudent(student);
		student=new Student();
		student.setRollno(4);
		student.setSName(new String("Ankit"));
		student.setSLName(new String("Agarwal"));
		student.setGrade(4);
		student.setSection(new String("A"));
		student.setEmailId(new String("kshitij10987@yahoo.co.in"));
		studentService.createStudent(student);
		student=new Student();
		student.setRollno(5);
		student.setSName(new String("Gunisha"));
		student.setSLName(new String("Agarwal"));
		student.setGrade(5);
		student.setSection(new String("A"));
		student.setEmailId(new String("swetagupta_15@yahoo.co.in"));
		studentService.createStudent(student);
		student=new Student();
		student.setRollno(6);
		student.setSName(new String("Gunisha"));
		student.setSLName(new String("Gupra"));
		student.setGrade(5);
		student.setSection(new String("A"));
		student.setEmailId(new String("ankitagarwal1@yahoo.co.in"));
		studentService.createStudent(student);
		student=new Student();
		student.setRollno(7);
		student.setSName(new String("Gunisha"));
		student.setSLName(new String("Gupta"));
		student.setGrade(5);
		student.setSection(new String("B"));
		student.setEmailId(new String("meet2ankit@gmail.com"));
		studentService.createStudent(student);
		
		Grade grade=new Grade();
		grade.setGr(5);
		grade.setSection(new String("A"));
		grade.setTeacherId(2);
		grade.setSubject(new String("Math"));
		grade.setIsClassTeacher(new String("Y"));
		gradeService.createGrade(grade);
		grade=new Grade();
		grade.setGr(5);
		grade.setSection(new String("A"));
		grade.setTeacherId(1);
		grade.setSubject(new String("Science"));
		grade.setIsClassTeacher(new String("N"));
		gradeService.createGrade(grade);
		grade=new Grade();
		grade.setGr(5);
		grade.setSection(new String("B"));
		grade.setTeacherId(2);
		grade.setSubject(new String("English"));
		grade.setIsClassTeacher(new String("N"));
		gradeService.createGrade(grade);
		grade=new Grade();
		grade.setGr(5);
		grade.setSection(new String("B"));
		grade.setTeacherId(3);
		grade.setSubject(new String("Science"));
		grade.setIsClassTeacher(new String("Y"));
		gradeService.createGrade(grade);
		
		Teacher teacher=new Teacher();
		teacher.setTeacherName(new String("Shubham"));
		teacher.setQualification(new String("B Ed"));
		teacherService.createTeacherDetails(teacher);
		teacher=new Teacher();
		teacher.setTeacherName(new String("Tara"));
		teacher.setQualification(new String("B Com"));
		teacherService.createTeacherDetails(teacher);
		teacher=new Teacher();
		teacher.setTeacherName(new String("Sitara"));
		teacher.setQualification(new String("M A"));
		teacherService.createTeacherDetails(teacher);
		
	}

}
