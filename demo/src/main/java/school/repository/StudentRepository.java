package school.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import school.data.Student;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

	Student findByRegId(@Param("regId")Integer regId);
	
	List<Student> findAll();
	
	@Query("SELECT s FROM Student s where grade = ?1 and section=?2")
	List<Student> findByGradeNSection(@Param("grade") Integer grade,@Param("section") String section);

}
