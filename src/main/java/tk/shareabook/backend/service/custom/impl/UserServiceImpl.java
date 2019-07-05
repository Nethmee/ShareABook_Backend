package tk.shareabook.backend.service.custom.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.shareabook.backend.dto.LoginDTO;
import tk.shareabook.backend.dto.UserDTO;
import tk.shareabook.backend.entity.Login;
import tk.shareabook.backend.entity.Student;
import tk.shareabook.backend.entity.SuperEntity;
import tk.shareabook.backend.entity.TuitionProvider;
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
        if (null != login) {
            UserDTO userDTO = null;
            SuperEntity superEntity = null;
            switch (UserType.valueOf(login.getType())) {
                case ADMIN: {
                    superEntity = adminRepository.findById(login.getId()).get();
                    break;
                }
                case STUDENT: {
                    superEntity = studentRepository.findById(login.getId()).get();
                    break;
                }
                case BOOKSHOP_OWNER: {
                    superEntity = bookShopRepository.findById(login.getId()).get();
                }
            }
            userDTO = (UserDTO) dtoConverter.convertToDTO(superEntity);
            return userDTO;
        }
        return null;
    }

    @Override
    public boolean registerUser(UserDTO userDTO) {
        try {
            String type = userDTO.getType();
            if (type.equalsIgnoreCase("Educator")) {
                userDTO.setUserType(UserType.TUITION_PROVIDER);
                TuitionProvider tuitionProvider = (TuitionProvider) entityConverter.convertToEntity(userDTO);
                TuitionProvider save = tuitionProviderRepository.save(tuitionProvider);
                userDTO.setId(save.getId());
            } else if (type.equalsIgnoreCase("Student")) {
                userDTO.setUserType(UserType.STUDENT);
                Student student = (Student) entityConverter.convertToEntity(userDTO);
                Student save = studentRepository.save(student);
                userDTO.setId(save.getStudentId());
            }

            loginRepository.save(new Login(userDTO.getUserName(), userDTO.getPassword(), userDTO.getUserType().toString(), userDTO.getId()));

            return true;
        } catch (RuntimeException e) {
            System.out.println(e);
            return false;
        }
    }
}
