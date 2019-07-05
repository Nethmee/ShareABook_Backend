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
@CrossOrigin
@RequestMapping("/api/v1/authentication")
public class AuthenticationController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
    public UserDTO login(@RequestBody LoginDTO loginDTO) {
        System.out.println(loginDTO);
        System.out.println(loginDTO.getUserName() + loginDTO.getPassword());
        return userService.login(loginDTO);
    }

    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    public boolean register(@RequestBody UserDTO userDTO) {
        System.out.println("registering user================");
        return userService.registerUser(userDTO);
    }


    @GetMapping(path = "/test", produces = "application/json")
    public String test() {
        return "its working!!!";
    }
}
