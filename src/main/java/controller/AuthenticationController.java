package controller;

import dto.LoginDTO;
import dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.custom.UserService;

/**
 * @author Dilini Peiris on 7/1/2019
 */
@RestController
public class AuthenticationController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginDTO loginDTO) {
//        System.out.println(loginDTO);
//        System.out.println(loginDTO.getUserName()+loginDTO.getPassword());
        return userService.login(loginDTO);

    }
}
