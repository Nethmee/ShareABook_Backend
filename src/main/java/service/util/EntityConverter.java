package service.util;

import dto.*;
import entity.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilini Peiris on 7/1/2019
 */
@Component
public class EntityConverter {

    public SuperEntity convertToEntity(SuperDTO superDTO){
            if(superDTO instanceof AdminDTO){
                AdminDTO a=(AdminDTO)superDTO;
                return new Admin( a.getAdminId(),a.getName(),a.getContactNum());
            }

            else if(superDTO instanceof BookShopDTO ){
                BookShopDTO b=(BookShopDTO)superDTO;
                return new BookShop(b.getRegisterId(),b.getName(),b.getLocation(),b.getContactNo(),b.getNameOfManager(),b.getNICofManager(),b.getConectedBranchURL(),b.getPackageName());
            }

            else if(superDTO instanceof CategoryDTO){
                CategoryDTO c=(CategoryDTO)superDTO;
                return new Category(c.getId(),c.getType(),c.getSubject(),c.getExamType().toString());
            }
            else if(superDTO instanceof LoginDTO){
                    LoginDTO l=(LoginDTO)superDTO;
                    return new Login(l.getUserName(),l.getType(),l.getPassword());
            }
            else if(superDTO instanceof StudentDTO){
                   StudentDTO s=(StudentDTO)superDTO;
                   return new Student(s.getStudentId(),s.getName(),s.getContactNum(),s.getProfilePicURL());

            }
            else if(superDTO instanceof StudyMaterialDTO){
                StudyMaterialDTO m=(StudyMaterialDTO)superDTO;
                return new StudyMaterial(m.getMaterialID(),m.getISBMNumber(),m.getNumberOFCopies(),m.getType().toString(),m.getTitle(),m.getAuthor());

            }
            else if(superDTO instanceof TuitionProviderDTO){
                TuitionProviderDTO t=(TuitionProviderDTO)superDTO;
                //return new TuitionProvider(t.getId(),t.getNIC(),t.getContactNumber(),t.getSkilledSubjects.toString(), t.getAddress(),t.getPayment());
            }
            else if(superDTO instanceof UserDTO){
                UserDTO  u=(UserDTO)superDTO;
                return null;
            }

        return null;
    }

    public List convertToEntityList(List list) {

        if (0 == list.size()) {
            System.out.println("------------------------------------------------------nothing in the list ->" + list);
            return null;
        }
        if (list.get(0) instanceof AdminDTO) {
            ArrayList<Admin> admin = new ArrayList<>();
            for (Object e : list) {
                Admin a= (Admin) convertToEntity((SuperDTO) e);
                admin.add(a);
            }
            return admin;
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
        } else if (list.get(0) instanceof StudentDTO) {
            ArrayList<Student> student = new ArrayList<>();
            for (Object e : list) {
                Student s = (Student) convertToEntity((SuperDTO) e);
                student.add(s);
            }
            return student;
        } else if (list.get(0) instanceof StudyMaterialDTO) {
            ArrayList<StudyMaterial> studyMaterial = new ArrayList<>();
            for (Object e : list) {
                StudyMaterial m = (StudyMaterial) convertToEntity((SuperDTO) e);
                studyMaterial.add(m);
            }
            return studyMaterial;
        } else if (list.get(0) instanceof TuitionProviderDTO) {
            ArrayList<TuitionProvider> tuitionProvider = new ArrayList<>();
            for (Object e : list) {
                TuitionProvider t = (TuitionProvider) convertToEntity((SuperDTO) e);
                tuitionProvider.add(t);
            }
            return tuitionProvider;
        }

        System.out.println("--------------------------------------------------list doesnt match anything ->" + list);
        return null;
    }
    }
