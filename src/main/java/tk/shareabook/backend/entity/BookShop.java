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

@Table(name = "bookshop")
@Entity
public class BookShop extends SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int registerId;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "contact")
    private String contactNo;
    @Column(name = "manager_name")
    private String nameOfManager;
    @Column(name = "manager_nic")
    private String NICofManager;
    @Column(name = "business_registration")
    private String businessRegistration;
    @Column(name = "email")
    private String email;
    @Column(name = "webpage")
    private String connectedBranchURL;
    @Column(name = "type")
    private String bookshopType;

    @OneToMany(mappedBy = "primaryKey.bookShop")
    List<BookShopUpload> bookShopUploads;

    @ManyToOne
    @JoinColumn(name = "registered_by")
    private Admin admin;

    public BookShop() {
    }

    public BookShop(String name, String location, String contactNo, String nameOfManager, String NICofManager, String businessRegistration, String email) {
        this.name = name;
        this.location = location;
        this.contactNo = contactNo;
        this.nameOfManager = nameOfManager;
        this.NICofManager = NICofManager;
        this.businessRegistration = businessRegistration;
        this.email = email;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setNameOfManager(String nameOfManager) {
        this.nameOfManager = nameOfManager;
    }

    public void setNICofManager(String NICofManager) {
        this.NICofManager = NICofManager;
    }

    public void setConnectedBranchURL(String connectedBranchURL) {
        this.connectedBranchURL = connectedBranchURL;
    }

    public void setBookshopType(String bookshopType) {
        this.bookshopType = bookshopType;
    }

    public int getRegisterId() {
        return registerId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getNameOfManager() {
        return nameOfManager;
    }

    public String getNICofManager() {
        return NICofManager;
    }

    public String getConnectedBranchURL() {
        return connectedBranchURL;
    }

    public String getBookshopType() {
        return bookshopType;
    }

    public String getBusinessRegistration() {
        return businessRegistration;
    }

    public void setBusinessRegistration(String businessRegistration) {
        this.businessRegistration = businessRegistration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BookShopUpload> getBookShopUploads() {
        return bookShopUploads;
    }

    public void setBookShopUploads(List<BookShopUpload> bookShopUploads) {
        this.bookShopUploads = bookShopUploads;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
