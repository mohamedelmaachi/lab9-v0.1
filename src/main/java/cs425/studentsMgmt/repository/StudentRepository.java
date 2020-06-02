package cs425.studentsMgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cs425.studentsMgmt.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
