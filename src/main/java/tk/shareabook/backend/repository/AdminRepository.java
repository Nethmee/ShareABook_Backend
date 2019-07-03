package tk.shareabook.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.shareabook.backend.entity.Admin;

/**
 * @author Dilini Peiris on 7/1/2019
 */

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
