package service;

import dto.LoginDTO;
import dto.UserDTO;

/**
 * @author Dilini Peiris on 7/1/2019
 */
public interface UserService {

    UserDTO login(LoginDTO loginDTO);

}
