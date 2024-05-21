package dotnt.spring.studentmanagement2.repository;


import dotnt.spring.studentmanagement2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
