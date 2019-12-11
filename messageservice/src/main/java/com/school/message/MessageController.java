package com.school.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@Autowired
    private MessageService messageService;
 
	 @RequestMapping(method = RequestMethod.POST, path = "/message1")
	    public void sendSingleMessage(@RequestBody Message message) {
		 messageService.sendSingleEmailMessage(message);
	    }
	 
	 @RequestMapping(method = RequestMethod.POST, path = "/message2")
	    public void sendMultipleMessage(@RequestBody Message message) {
		 messageService.sendMultipleMessage(message);
	    }

	// @RequestMapping(method = RequestMethod.POST, path = "/sendMessage/{tn}")
	//    public void sendMessageToClassStudents(@PathVariable(value = "tn") String teacherName,@RequestBody Message message) {
		// messageService.sendMessageToClassStudents(message,teacherName);
	    //	}
}
