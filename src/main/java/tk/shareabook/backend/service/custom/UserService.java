package tk.shareabook.backend.service.custom;

import tk.shareabook.backend.dto.LoginDTO;
import tk.shareabook.backend.dto.UserDTO;

/**
 * @author Dilini Peiris on 7/1/2019
 */
public interface UserService {

    UserDTO login(LoginDTO loginDTO);

}


