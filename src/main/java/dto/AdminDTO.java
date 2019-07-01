/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 * @author DELL
 */
public class AdminDTO {
    private int adminId;
    private String name;
    private int contactNum;

    public AdminDTO(int adminId, String name, int contactNum) {
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

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }

    public int getContactNum() {
        return contactNum;
    }


}
