package service.util;

import dto.*;
import entity.*;
import org.springframework.stereotype.Component;
import service.types.ExamType;
import service.types.StudyMaterialType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilini Peiris on 7/1/2019
 */
@Component
public class DtoConverter {


    public SuperDTO convertToDTO(SuperEntity superEntity) {

        if (superEntity instanceof Admin) {
            Admin superEntity1 = (Admin) superEntity;
            return new AdminDTO(superEntity1.getAdminId(), superEntity1.getName(), superEntity1.getContactNum());
        } else if (superEntity instanceof BookShop) {
            BookShop superEntity2 = (BookShop) superEntity;
            return new BookShopDTO(superEntity2.getRegisterId(), superEntity2.getName(), superEntity2.getLocation(),
                    superEntity2.getContactNo(), superEntity2.getNameOfManager(),
                    superEntity2.getNICofManager(), superEntity2.getConectedBranchURL(), superEntity2.getBookshopType());
        } else if (superEntity instanceof Category) {
            Category superEntity3 = (Category) superEntity;
            return new CategoryDTO(superEntity3.getId(), superEntity3.getType(), superEntity3.getSubject(), ExamType.valueOf(superEntity3.getExamType()));
        } else if (superEntity instanceof Login) {
            Login superEntity4 = (Login) superEntity;
            return new LoginDTO(superEntity4.getUserName(), superEntity4.getPassword(), superEntity4.getType());
        } else if (superEntity instanceof Student) {
            Student superEntity5 = (Student) superEntity;
            return new StudentDTO(superEntity5.getStudentId(), superEntity5.getName(), superEntity5.getContactNum(), superEntity5.getProfilePicURL());
        } else if (superEntity instanceof StudyMaterial) {
            StudyMaterial superEntity6 = (StudyMaterial) superEntity;
            return new StudyMaterialDTO(superEntity6.getMaterialID(), superEntity6.getISBMNumber(), superEntity6.getNumberOFCopies(),
                    StudyMaterialType.valueOf(superEntity6.getType()), superEntity6.getTitle(), superEntity6.getAuthor());
        } else if (superEntity instanceof TuitionProvider) {
            TuitionProvider superEntity7 = (TuitionProvider) superEntity;
            return new TuitionProviderDTO(superEntity7.getId(), superEntity7.getNIC(), superEntity7.getContactNumber(),
                    superEntity7.getAddress(), superEntity7.getPayment());
        }
        return null;

    }

    public List convertToDtoList(List list) {

        if (0 == list.size()) {
            System.out.println("------------------------------------------------------nothing in the list ->" + list);
            return null;
        }
        if (list.get(0) instanceof Admin) {
            ArrayList<AdminDTO> admin = new ArrayList<>();
            for (Object e : list) {
                AdminDTO a = (AdminDTO) convertToDTO((SuperEntity) e);
                admin.add(a);
            }
            return admin;
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
        } else if (list.get(0) instanceof Student) {
            ArrayList<StudentDTO> student = new ArrayList<>();
            for (Object e : list) {
                StudentDTO s = (StudentDTO) convertToDTO((SuperEntity) e);
                student.add(s);
            }
            return student;
        } else if (list.get(0) instanceof StudyMaterial) {
            ArrayList<StudyMaterialDTO> studyMaterial = new ArrayList<>();
            for (Object e : list) {
                StudyMaterialDTO sm = (StudyMaterialDTO) convertToDTO((SuperEntity) e);
                studyMaterial.add(sm);
            }
            return studyMaterial;
        } else if (list.get(0) instanceof TuitionProvider) {
            ArrayList<TuitionProviderDTO> tuitionProvider = new ArrayList<>();
            for (Object e : list) {
                TuitionProviderDTO t = (TuitionProviderDTO) convertToDTO((SuperEntity) e);
                tuitionProvider.add(t);
            }
            return tuitionProvider;
        }
        System.out.println("--------------------------------------------------list doesnt match anything ->" + list);
        return null;
    }


}
