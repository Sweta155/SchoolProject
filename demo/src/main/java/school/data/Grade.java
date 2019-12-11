package school.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity 
@Data
@NoArgsConstructor
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gradeId;
	@NonNull
	private Integer gr;
	@NonNull
	private String section;
	@NonNull
	private Integer teacherId;
	private String subject;
	@NonNull
	private String isClassTeacher; 
	
}
