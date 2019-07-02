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
public class StudyMaterial extends SuperEntity{
    private int materialID;
    private  String ISBMNumber;
    private int numberOFCopies;
    private String type;
    private String title;
    private String author;
    private float price;
    
    public StudyMaterial(int materialID, String ISBMNumber, int numberOFCopies, String type, String title, String author) {
        this.materialID = materialID;
        this.ISBMNumber = ISBMNumber;
        this.numberOFCopies = numberOFCopies;
        this.type = type;
        this.title = title;
        this.author = author;
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
   
    
}
