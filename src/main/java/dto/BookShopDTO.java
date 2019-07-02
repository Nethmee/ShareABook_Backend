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
public class BookShopDTO extends SuperDTO{
    private int registerId;
    private String name;
    private String location;
    private String contactNo;
    private String nameOfManager;
    private String NICofManager;
    private String conectedBranchURL;
    private String packageName;

    public BookShopDTO(int registerId, String name, String location, String contactNo, String nameOfManager, String NICofManager, String conectedBranchURL, String packageName) {
        this.registerId = registerId;
        this.name = name;
        this.location = location;
        this.contactNo = contactNo;
        this.nameOfManager = nameOfManager;
        this.NICofManager = NICofManager;
        this.conectedBranchURL = conectedBranchURL;
        this.packageName = packageName;
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

    public void setConectedBranchURL(String conectedBranchURL) {
        this.conectedBranchURL = conectedBranchURL;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
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

    public String getConectedBranchURL() {
        return conectedBranchURL;
    }

    public String getPackageName() {
        return packageName;
    }
    
}
