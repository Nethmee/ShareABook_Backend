package dto;

/**
 * @author Dilini Peiris on 7/1/2019
 */
public class UserDTO {
    private String userName;
    private String  password;
    private String type;
    private int id;
    private String contactNo;
    private String name;

    public UserDTO() {
    }

    public UserDTO(String userName, String password, String type, int id, String contactNo, String name) {
        this.userName = userName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
