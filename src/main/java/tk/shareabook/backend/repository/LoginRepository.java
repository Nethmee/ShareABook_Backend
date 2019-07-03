package tk.shareabook.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.shareabook.backend.entity.Login;

/**
 * @author Dilini Peiris on 7/2/2019
 */
public interface LoginRepository extends JpaRepository<Login,String> {

    Login findLoginByUserNameAndPasswordEquals(String username,String password);

}
