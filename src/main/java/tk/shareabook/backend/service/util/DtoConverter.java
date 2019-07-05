package tk.shareabook.backend.service.util;

import org.springframework.stereotype.Component;
import tk.shareabook.backend.dto.*;
import tk.shareabook.backend.entity.*;
import tk.shareabook.backend.service.types.ExamType;
import tk.shareabook.backend.service.types.StudyMaterialType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilini Peiris on 7/1/2019
 */
@Component
public class DtoConverter {


    public SuperDTO convertToDTO(SuperEntity superEntity) {

        if (superEntity instanceof BookShop) {
            BookShop bookShop = (BookShop) superEntity;
            return new BookShopDTO(bookShop.getRegisterId(), bookShop.getName(), bookShop.getBusinessRegistration(),
                    bookShop.getEmail(), bookShop.getContactNo(),
                    bookShop.getNameOfManager(), bookShop.getNICofManager(), bookShop.getLocation());
        } else if (superEntity instanceof Category) {
            Category category = (Category) superEntity;
            return new CategoryDTO(category.getId(), category.getSubject(), ExamType.valueOf(category.getExamType()));
        } else if (superEntity instanceof Login) {
            Login login = (Login) superEntity;
            return new LoginDTO(login.getUserName(), login.getPassword(), login.getType());
        } else if (superEntity instanceof StudyMaterial) {
            StudyMaterial studyMaterial = (StudyMaterial) superEntity;
            return new StudyMaterialDTO(studyMaterial.getMaterialID(), studyMaterial.getIsbnNumber(), studyMaterial.getNumberOFCopies(),
                    StudyMaterialType.valueOf(studyMaterial.getType()), studyMaterial.getTitle(), studyMaterial.getAuthor());
        }
        return null;

    }

    public List convertToDtoList(List list) {

        if (0 == list.size()) {
            System.out.println("------------------------------------------------------nothing in the list ->" + list);
            return null;

        } else if (list.get(0) instanceof BookShop) {
            ArrayList<BookShopDTO> bookshop = new ArrayList<>();
            for (Object e : list) {
                BookShopDTO b = (BookShopDTO) convertToDTO((SuperEntity) e);
                bookshop.add(b);
            }
            return bookshop;
        } else if (list.get(0) instanceof Category) {
            ArrayList<CategoryDTO> category = new ArrayList<>();
            for (Object e : list) {
                CategoryDTO c = (CategoryDTO) convertToDTO((SuperEntity) e);
                category.add(c);
            }
            return category;
        } else if (list.get(0) instanceof Login) {
            ArrayList<LoginDTO> login = new ArrayList<>();
            for (Object e : list) {
                LoginDTO l = (LoginDTO) convertToDTO((SuperEntity) e);
                login.add(l);
            }
            return login;
        } else if (list.get(0) instanceof StudyMaterial) {
            ArrayList<StudyMaterialDTO> studyMaterial = new ArrayList<>();
            for (Object e : list) {
                StudyMaterialDTO sm = (StudyMaterialDTO) convertToDTO((SuperEntity) e);
                studyMaterial.add(sm);
            }
            return studyMaterial;
        }
        System.out.println("--------------------------------------------------list doesnt match anything ->" + list);
        return null;
    }


}
