package repository;

import entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dilini Peiris on 7/2/2019
 */
public interface LoginRepository extends JpaRepository<Login,String> {

    Login findLoginByUserNameAndPasswordEquals(String username,String password);

}