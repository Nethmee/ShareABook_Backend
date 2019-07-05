/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author DELL
 */

@Entity
@Table(name = "admin")
public class Admin extends SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int adminId;

    @Column(name = "name")
    private String name;

    @Column(name = "contact")
    private String contactNum;

    @OneToMany(mappedBy = "admin")
    private List<BookShop> registeredBookShops;

    public Admin(int adminId, String name, String contactNum) {
        this.adminId = adminId;
        this.name = name;
        this.contactNum = contactNum;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNum() {
        return contactNum;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }


}
