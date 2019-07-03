package tk.shareabook.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.shareabook.backend.dto.LoginDTO;
import tk.shareabook.backend.dto.UserDTO;
import tk.shareabook.backend.service.custom.UserService;

/**
 * @author Dilini Peiris on 7/1/2019
 */
@RestController
@RequestMapping("/api/v1/authentication")
public class AuthenticationController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginDTO loginDTO) {
        System.out.println(loginDTO);
        System.out.println(loginDTO.getUserName() + loginDTO.getPassword());
        return userService.login(loginDTO);
    }

    @GetMapping("/test")
    public String test() {
        return "its working!!!";
    }
}
