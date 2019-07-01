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
public class TuitionProviderDTO extends SuperDTO{
    private int id;
    private String NIC;
    private int contactNumber;
    private String Address;
    private String payment;

    public TuitionProviderDTO(int id, String NIC, int contactNumber, String address, String payment) {
        this.id = id;
        this.NIC = NIC;
        this.contactNumber = contactNumber;
        Address = address;
        this.payment = payment;
    }

    public TuitionProviderDTO(String NIC, int contactNumber, String Address, String payment) {
        this.NIC = NIC;
        this.contactNumber = contactNumber;
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

    public String getAddress() {
        return Address;
    }

    public String getPayment() {
        return payment;
    }
    


    

}