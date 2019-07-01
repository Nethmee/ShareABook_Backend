package repository;

import entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dilini Peiris on 7/1/2019
 */

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
