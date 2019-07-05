package tk.shareabook.backend.dto;

import tk.shareabook.backend.service.types.UserType;

/**
 * @author Dilini Peiris on 7/1/2019
 */
public class UserDTO extends SuperDTO {
    private String userName;
    private String password;
    private String city;
    private String email;
    private String type;
    private UserType userType;
    private int id;
    private String phone;
    private String name;

    public UserDTO() {
    }

    public UserDTO(int id, String phone, String name) {
        this.id = id;
        this.phone = phone;
        this.name = name;
    }

    public UserDTO(String userName, String password, String city, String email, String type, String phone, String name) {
        this.userName = userName;
        this.password = password;
        this.city = city;
        this.email = email;
        this.type = type;
        this.phone = phone;
        this.name = name;
    }

    public UserDTO(String userName, UserType userType, int id, String phone, String name) {
        this.userName = userName;
        this.userType = userType;
        this.id = id;
        this.phone = phone;
        this.name = name;
    }

    public UserDTO(String userName, String type, String phone, String name) {
        this.userName = userName;
        this.type = type;
        this.phone = phone;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
