package school.data;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity 
@Data
@NoArgsConstructor
public class Teacher {
	@Id
	private Integer teachEmpId;
	@NonNull
	private String teacherName;	
	private String Qualification;
	
}
