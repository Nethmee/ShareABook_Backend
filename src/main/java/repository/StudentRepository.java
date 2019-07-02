package repository;

import entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dilini Peiris on 7/2/2019
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
