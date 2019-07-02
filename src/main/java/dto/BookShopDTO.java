/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import service.types.BookShopType;

/**
 *
 * @author DELL
 */
public class BookShopDTO extends SuperDTO{
    private int registerId;
    private String name;
    private String location;
    private String contactNo;
    private String nameOfManager;
    private String NICofManager;
    private String connectedBranchURL;
    private BookShopType bookShopType;

    public BookShopDTO(int registerId, String name, String location, String contactNo, String nameOfManager, String NICofManager, String connectedBranchURL, BookShopType bookShopType) {
        this.registerId = registerId;
        this.name = name;
        this.location = location;
        this.contactNo = contactNo;
        this.nameOfManager = nameOfManager;
        this.NICofManager = NICofManager;
        this.connectedBranchURL = connectedBranchURL;
        this.bookShopType = bookShopType;
    }

    public BookShopDTO() {
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

    public void setConnectedBranchURL(String connectedBranchURL) {
        this.connectedBranchURL = connectedBranchURL;
    }

    public BookShopType getBookShopType() {
        return bookShopType;
    }
    
}
