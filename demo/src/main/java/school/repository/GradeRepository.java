package school.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import school.data.Grade;

@RepositoryRestResource(collectionResourceRel = "grade", path = "grade")
public interface GradeRepository extends PagingAndSortingRepository<Grade, Long> {

	@Query("SELECT g FROM Grade g where teacherId = ?1 and isClassTeacher='Y'")
	Grade getGradeByClassTeacherId(@Param("teachId") Integer teachId);

}
