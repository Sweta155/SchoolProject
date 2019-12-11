package school.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import school.data.Teacher;

@RepositoryRestResource(collectionResourceRel = "teacher", path = "teacher")
public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long>{

	@Query("SELECT t.teachEmpId FROM Teacher t where teacherName = ?1")
	Integer getIDByTeacherName(@Param("teacherName") String teacherName);

}