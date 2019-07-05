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
@Table(name = "tuition_provider")
public class TuitionProvider extends SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "contact")
    private String contactNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "primaryKey.tuitionProvider")
    private List<TuitionProviderUpload> tuitionProviderUploads;

    public TuitionProvider(String city, String contactNumber, String name, String email) {
        this.city = city;
        this.contactNumber = contactNumber;
        this.name = name;
        this.email = email;
    }

    public TuitionProvider(int id, String city, String contactNumber, String name, String email) {
        this.id = id;
        this.city = city;
        this.contactNumber = contactNumber;
        this.name = name;
        this.email = email;
    }


    public TuitionProvider() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String Address) {
        this.name = Address;
    }

    public List<TuitionProviderUpload> getTuitionProviderUploads() {
        return tuitionProviderUploads;
    }

    public void setTuitionProviderUploads(List<TuitionProviderUpload> tuitionProviderUploads) {
        this.tuitionProviderUploads = tuitionProviderUploads;
    }
}
