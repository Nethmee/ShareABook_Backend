/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author DELL
 */
@Entity
@Table(name = "login")
public class Login extends SuperEntity {

    @Id
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "user_type")
    private String type;
    @Column(name = "user_id")
    private int id;

    public Login(String userName, String password, String type) {
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

    public Login(String userName, String password, String type, int id) {
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
