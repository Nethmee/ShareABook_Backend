package tk.shareabook.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.shareabook.backend.entity.Student;

/**
 * @author Dilini Peiris on 7/2/2019
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
