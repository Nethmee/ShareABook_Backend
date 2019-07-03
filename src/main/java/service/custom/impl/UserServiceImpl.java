package service.custom.impl;

import dto.LoginDTO;
import dto.UserDTO;
import entity.Login;
import entity.SuperEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.*;
import service.custom.UserService;
import service.types.UserType;
import service.util.DtoConverter;
import service.util.EntityConverter;

/**
 * @author Dilini Peiris on 7/1/2019
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private EntityConverter entityConverter;

    @Autowired
    private DtoConverter dtoConverter;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    TuitionProviderRepository tuitionProviderRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BookShopRepository bookShopRepository;

    @Override
    public UserDTO login(LoginDTO loginDTO) {
        Login login = loginRepository.findLoginByUserNameAndPasswordEquals(loginDTO.getUserName(), loginDTO.getPassword());
        if(null!=login){
            UserDTO userDTO = new UserDTO();
            SuperEntity superEntity = null;
            switch (UserType.valueOf(login.getType())){
                case ADMIN: {
                    superEntity = adminRepository.findById(login.getId()).get();
                    break;
                }
                case STUDENT:{
                    superEntity = studentRepository.findById(login.getId()).get();
                    break;
                }
                case BOOKSHOP_OWNER:{

                }
            }
        }
        return null;
    }
}
