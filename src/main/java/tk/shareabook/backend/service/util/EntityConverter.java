package tk.shareabook.backend.service.util;

import org.springframework.stereotype.Component;
import tk.shareabook.backend.dto.*;
import tk.shareabook.backend.entity.*;
import tk.shareabook.backend.service.types.UserType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilini Peiris on 7/1/2019
 */
@Component
public class EntityConverter {

    public SuperEntity convertToEntity(SuperDTO superDTO) {
        if (superDTO instanceof BookShopDTO) {
            BookShopDTO b = (BookShopDTO) superDTO;
            return new BookShop(b.getName(), b.getCity(), b.getContactNo(), b.getNameOfManager(), b.getNICofManager(), b.getBusinessRegNo(), b.getEmail());
        } else if (superDTO instanceof CategoryDTO) {
            CategoryDTO c = (CategoryDTO) superDTO;
            return new Category(c.getId(), c.getSubject(), c.getExamType().toString());
        } else if (superDTO instanceof StudyMaterialDTO) {
            StudyMaterialDTO m = (StudyMaterialDTO) superDTO;
            return new StudyMaterial(m.getMaterialID(), m.getIsbnNumber(), m.getNumberOFCopies(), m.getType().toString(), m.getTitle(), m.getAuthor(), m.getPrice());

        } else if (superDTO instanceof UserDTO) {
            UserDTO u = (UserDTO) superDTO;
            UserType userType = u.getUserType();
            switch (userType) {
                case STUDENT:
                    return new Student(u.getId(), u.getCity(), u.getPhone(), u.getName(), u.getEmail());
                case TUITION_PROVIDER:
                    return new TuitionProvider(u.getId(), u.getCity(), u.getPhone(), u.getName(), u.getEmail());
                case ADMIN:
                    return new Admin(u.getId(), u.getName(), u.getPhone());
            }
            return null;
        }

        return null;
    }

    public List convertToEntityList(List list) {

        if (0 == list.size()) {
            System.out.println("------------------------------------------------------nothing in the list ->" + list);
            return null;
        } else if (list.get(0) instanceof BookShopDTO) {
            ArrayList<BookShop> bookshops = new ArrayList<>();
            for (Object e : list) {
                BookShop b = (BookShop) convertToEntity((SuperDTO) e);
                bookshops.add(b);
            }
            return bookshops;
        } else if (list.get(0) instanceof CategoryDTO) {
            ArrayList<Category> category = new ArrayList<>();
            for (Object e : list) {
                Category c = (Category) convertToEntity((SuperDTO) e);
                category.add(c);
            }
            return category;
        } else if (list.get(0) instanceof LoginDTO) {
            ArrayList<Login> login = new ArrayList<>();
            for (Object e : list) {
                Login l = (Login) convertToEntity((SuperDTO) e);
                login.add(l);
            }
            return login;
        } else if (list.get(0) instanceof StudyMaterialDTO) {
            ArrayList<StudyMaterial> studyMaterial = new ArrayList<>();
            for (Object e : list) {
                StudyMaterial m = (StudyMaterial) convertToEntity((SuperDTO) e);
                studyMaterial.add(m);
            }
            return studyMaterial;
        }

        System.out.println("--------------------------------------------------list doesnt match anything ->" + list);
        return null;
    }
}
