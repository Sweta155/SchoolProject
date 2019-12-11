package schoolweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import schoolweb.data.Student;

@Component
public class StudentWebService {

	@Autowired
	private RestTemplate restTemplate;
	static final String STUDENT_SERVICE__URL = "http://localhost:8080/student";

	public void createStudent(Student student) {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON);
		// Data attached to the request.
		HttpEntity<Student> requestBody = new HttpEntity<>(student, headers);

		restTemplate.postForObject(STUDENT_SERVICE__URL, requestBody, Student.class);
	}
}
