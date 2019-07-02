package entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Entity
@Table(name = "student_purchase")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.bookShop",
                joinColumns = @JoinColumn(name = "bookshop_id")),
        @AssociationOverride(name = "primaryKey.studyMaterial",
                joinColumns = @JoinColumn(name = "study_material_id"))
})
public class BookShopUpload extends SuperEntity {

    @EmbeddedId
    private BookShopUploadID primaryKey;

    @Column(name = "price")
    private float price;

    @Column(name = "qty")
    private int qty;

    @Column(name = "upload_date")
    private LocalDate uploadDate;

    public BookShopUpload(BookShopUploadID primaryKey, float price, int qty, LocalDate uploadDate) {
        this.primaryKey = primaryKey;
        this.price = price;
        this.qty = qty;
        this.uploadDate = uploadDate;
    }

    public BookShopUpload() {
    }

    public BookShopUploadID getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(BookShopUploadID primaryKey) {
        this.primaryKey = primaryKey;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }
}
