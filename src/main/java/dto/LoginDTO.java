/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author DELL
 */
public class LoginDTO extends SuperDTO{
    private String userName;
    private String  password;
    private String type;

    public LoginDTO(String userName, String password, String type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }
    

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }
}
