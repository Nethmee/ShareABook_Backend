/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.dto;

import tk.shareabook.backend.service.types.BookShopType;

/**
 * @author DELL
 */
public class BookShopDTO extends SuperDTO {
    private int registerId;
    private String name;
    private String businessRegNo;
    private String email;
    private String contactNo;
    private String nameOfManager;
    private String NICofManager;
    private String city;
    private String username;
    private String password;

    private String connectedBranchURL;
    private BookShopType bookShopType;

    public BookShopDTO(int registerId, String name, String businessRegNo, String email, String contactNo, String nameOfManager, String NICofManager, String city, String username, String password, String connectedBranchURL, BookShopType bookShopType) {
        this.registerId = registerId;
        this.name = name;
        this.businessRegNo = businessRegNo;
        this.email = email;
        this.contactNo = contactNo;
        this.nameOfManager = nameOfManager;
        this.NICofManager = NICofManager;
        this.city = city;
        this.username = username;
        this.password = password;
        this.connectedBranchURL = connectedBranchURL;
        this.bookShopType = bookShopType;
    }

    public BookShopDTO(int registerId, String name, String businessRegNo, String email, String contactNo, String nameOfManager, String NICofManager, String city, String username, String password) {
        this.registerId = registerId;
        this.name = name;
        this.businessRegNo = businessRegNo;
        this.email = email;
        this.contactNo = contactNo;
        this.nameOfManager = nameOfManager;
        this.NICofManager = NICofManager;
        this.city = city;
        this.username = username;
        this.password = password;
    }

    public BookShopDTO(int registerId, String name, String businessRegNo, String email, String contactNo, String nameOfManager, String NICofManager, String city) {
        this.registerId = registerId;
        this.name = name;
        this.businessRegNo = businessRegNo;
        this.email = email;
        this.contactNo = contactNo;
        this.nameOfManager = nameOfManager;
        this.NICofManager = NICofManager;
        this.city = city;
    }

    public BookShopDTO() {
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
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

    public String getConnectedBranchURL() {
        return connectedBranchURL;
    }

    public void setBookShopType(BookShopType bookShopType) {
        this.bookShopType = bookShopType;
    }

    public int getRegisterId() {
        return registerId;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
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

    public void setConnectedBranchURL(String connectedBranchURL) {
        this.connectedBranchURL = connectedBranchURL;
    }

    public BookShopType getBookShopType() {
        return bookShopType;
    }

    public String getBusinessRegNo() {
        return businessRegNo;
    }

    public void setBusinessRegNo(String businessRegNo) {
        this.businessRegNo = businessRegNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
