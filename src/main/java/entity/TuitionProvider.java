/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DELL
 */
public class TuitionProvider {
    private int id;
    private String NIC;
    private int contactNumber;
    private String skilledSubject;
    private String Address;
    private String payment;

    public TuitionProvider(int id, String NIC, int contactNumber, String skilledSubject, String address, String payment) {
        this.id = id;
        this.NIC = NIC;
        this.contactNumber = contactNumber;
        this.skilledSubject = skilledSubject;
        Address = address;
        this.payment = payment;
    }

    public TuitionProvider(String NIC, int contactNumber, String skilledSubject, String Address, String payment) {
        this.NIC = NIC;
        this.contactNumber = contactNumber;
        this.skilledSubject = skilledSubject;
        this.Address = Address;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setSkilledSubject(String skilledSubject) {
        this.skilledSubject = skilledSubject;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getNIC() {
        return NIC;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getSkilledSubject() {
        return skilledSubject;
    }

    public String getAddress() {
        return Address;
    }

    public String getPayment() {
        return payment;
    }
    


    

}