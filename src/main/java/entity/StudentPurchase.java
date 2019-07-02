package entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Entity
@Table(name = "student_purchase")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.student",
                joinColumns = @JoinColumn(name = "student_id")),
        @AssociationOverride(name = "primaryKey.studyMaterial",
                joinColumns = @JoinColumn(name = "study_material_id"))
})
public class StudentPurchase extends SuperEntity {

    @EmbeddedId
    private StudentPurchaseID primaryKey;

    @Column(name = "amount_paid")
    private float amountPaid;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    public StudentPurchase() {
    }

    public StudentPurchase(StudentPurchaseID primaryKey, float amountPaid, LocalDate purchaseDate) {
        this.primaryKey = primaryKey;
        this.amountPaid = amountPaid;
        this.purchaseDate = purchaseDate;
    }

    public StudentPurchaseID getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(StudentPurchaseID primaryKey) {
        this.primaryKey = primaryKey;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


}
