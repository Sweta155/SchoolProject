package com.school.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
    @Autowired
    public JavaMailSender emailSender;
	
	public void sendSingleEmailMessage(Message message) {
		SimpleMailMessage mailMessage = new SimpleMailMessage(); 
		mailMessage.setTo(message.getMessageTo().split(",")); 
		mailMessage.setSubject(message.getMessageSubject()); 
		mailMessage.setText(message.getMessageBody());
        emailSender.send(mailMessage);
		
	}
	
	public void sendMultipleMessage(Message message) {
		//gradeRepository.save(grade);
	}
	
	/*public void sendMessageToClassStudents(Message message, String teachername) {
		
		TeacherService teacherservice;
		List<Student> teacherservice.getStudentsByTeacherName(teachername);
		SimpleMailMessage mailMessage = new SimpleMailMessage(); 
		mailMessage.setTo(message.getMessageTo()); 
		mailMessage.setSubject(message.getMessageSubject()); 
		mailMessage.setText(message.getMessageBody());
        emailSender.send(mailMessage);
		
	}*/

}
