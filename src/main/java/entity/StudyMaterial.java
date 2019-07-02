/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "study_material")
public class StudyMaterial extends SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int materialID;
    @Column(name = "isbn")
    private  String ISBMNumber;
    @Column(name = "qty")
    private int numberOFCopies;
    @Column(name = "type")
    private String type;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "price")
    private float price;

    @OneToMany(mappedBy = "primaryKey.studyMaterial")
    private List<StudentUpload> studentUploads = new ArrayList<>();

    @OneToMany(mappedBy = "primaryKey.studyMaterial")
    private List<StudentPurchase> studentPurchases = new ArrayList<>();

    @OneToMany(mappedBy = "primaryKey.studyMaterial")
    private List<BookShopUpload> bookShopUploads = new ArrayList<>();

    @OneToMany(mappedBy = "primaryKey.studyMaterial")
    private List<TuitionProviderUpload> tuitionProviderUploads = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public StudyMaterial(int materialID, String ISBMNumber, int numberOFCopies, String type, String title, String author, float price) {
        this.materialID = materialID;
        this.ISBMNumber = ISBMNumber;
        this.numberOFCopies = numberOFCopies;
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public StudyMaterial(String ISBMNumber, int numberOFCopies, String type, String title, String author, float price) {
        this.ISBMNumber = ISBMNumber;
        this.numberOFCopies = numberOFCopies;
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getMaterialID() {
        return materialID;
    }

    public String getISBMNumber() {
        return ISBMNumber;
    }

    public int getNumberOFCopies() {
        return numberOFCopies;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public void setISBMNumber(String ISBMNumber) {
        this.ISBMNumber = ISBMNumber;
    }

    public void setNumberOFCopies(int numberOFCopies) {
        this.numberOFCopies = numberOFCopies;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<StudentUpload> getStudentUploads() {
        return studentUploads;
    }

    public void setStudentUploads(List<StudentUpload> studentUploads) {
        this.studentUploads = studentUploads;
    }

    public List<StudentPurchase> getStudentPurchases() {
        return studentPurchases;
    }

    public void setStudentPurchases(List<StudentPurchase> studentPurchases) {
        this.studentPurchases = studentPurchases;
    }

    public List<BookShopUpload> getBookShopUploads() {
        return bookShopUploads;
    }

    public void setBookShopUploads(List<BookShopUpload> bookShopUploads) {
        this.bookShopUploads = bookShopUploads;
    }
}
