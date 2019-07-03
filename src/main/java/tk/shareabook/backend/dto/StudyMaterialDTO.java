/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.shareabook.backend.dto;

import tk.shareabook.backend.service.types.StudyMaterialType;

/**
 *
 * @author DELL
 */
public class StudyMaterialDTO extends SuperDTO{
    private int materialID;
    private String isbnNumber;
    private int numberOFCopies;
    private StudyMaterialType type;
    private String title;
    private String author;
    private float price;

    public StudyMaterialDTO(int materialID, String isbnNumber, int numberOFCopies, StudyMaterialType type, String title, String author) {
        this.materialID = materialID;
        this.isbnNumber = isbnNumber;
        this.numberOFCopies = numberOFCopies;
        this.type = type;
        this.title = title;
        this.author = author;
    }

    public StudyMaterialDTO(int materialID, String isbnNumber, int numberOFCopies, StudyMaterialType type, String title, String author, float price) {
        this.materialID = materialID;
        this.isbnNumber = isbnNumber;
        this.numberOFCopies = numberOFCopies;
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getMaterialID() {
        return materialID;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public int getNumberOFCopies() {
        return numberOFCopies;
    }

    public StudyMaterialType getType() {
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

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setNumberOFCopies(int numberOFCopies) {
        this.numberOFCopies = numberOFCopies;
    }

    public void setType(StudyMaterialType type) {
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
}
