package dto;

import service.types.UserType;

/**
 * @author Dilini Peiris on 7/1/2019
 */
public class UserDTO extends SuperDTO{
    private String userName;
    private UserType type;
    private int id;
    private String contactNo;
    private String name;

    public UserDTO() {
    }

    public UserDTO(String userName, UserType type, int id, String contactNo, String name) {
        this.userName = userName;
        this.type = type;
        this.id = id;
        this.contactNo = contactNo;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
