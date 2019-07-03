package tk.shareabook.backend.service.custom.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.shareabook.backend.dto.LoginDTO;
import tk.shareabook.backend.dto.UserDTO;
import tk.shareabook.backend.entity.Login;
import tk.shareabook.backend.entity.SuperEntity;
import tk.shareabook.backend.repository.*;
import tk.shareabook.backend.service.custom.UserService;
import tk.shareabook.backend.service.types.UserType;
import tk.shareabook.backend.service.util.DtoConverter;
import tk.shareabook.backend.service.util.EntityConverter;

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
            UserDTO userDTO = null;
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
                    superEntity = bookShopRepository.findById(login.getId()).get();
                }
            }
            userDTO = (UserDTO) dtoConverter.convertToDTO(superEntity);
            return userDTO;
        }
        return null;
    }
}
