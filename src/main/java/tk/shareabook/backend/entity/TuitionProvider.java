/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.entity;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "tuition_provider")
public class TuitionProvider extends SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "nic")
    private String NIC;
    @Column(name = "contact")
    private String contactNumber;
    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "primaryKey.tuitionProvider")
    private List<TuitionProviderUpload> tuitionProviderUploads;


    public TuitionProvider(int id, String NIC, String contactNumber, String address) {
        this.id = id;
        this.NIC = NIC;
        this.contactNumber = contactNumber;
        this.address = address;
//        this.payment = payment;
    }

    public TuitionProvider(String NIC, String contactNumber, String Address) {
        this.NIC = NIC;
        this.contactNumber = contactNumber;
        this.address = Address;
//        this.payment = payment;
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

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

//    public void setPayment(String payment) {
//        this.payment = payment;
//    }

    public String getNIC() {
        return NIC;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

//    public String getPayment() {
//        return payment;
//    }


    public List<TuitionProviderUpload> getTuitionProviderUploads() {
        return tuitionProviderUploads;
    }

    public void setTuitionProviderUploads(List<TuitionProviderUpload> tuitionProviderUploads) {
        this.tuitionProviderUploads = tuitionProviderUploads;
    }
}