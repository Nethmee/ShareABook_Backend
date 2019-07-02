package entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Entity
@Table(name = "student_upload")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.student",
                joinColumns = @JoinColumn(name = "student_id")),
        @AssociationOverride(name = "primaryKey.studyMaterial",
                joinColumns = @JoinColumn(name = "study_material_id"))
})
public class StudentUpload extends SuperEntity{

    @EmbeddedId
    private StudentUploadID primaryKey = new StudentUploadID();

    @Column(name = "secondhand_price")
    private float secondHandPrice;

    @Column
    private LocalDate uploadDate;

    public StudentUpload(StudentUploadID primaryKey, float secondHandPrice, LocalDate uploadDate) {
        this.primaryKey = primaryKey;
        this.secondHandPrice = secondHandPrice;
        this.uploadDate = uploadDate;
    }

    public StudentUpload() {
    }

    public StudentUploadID getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(StudentUploadID primaryKey) {
        this.primaryKey = primaryKey;
    }

    public float getSecondHandPrice() {
        return secondHandPrice;
    }

    public void setSecondHandPrice(float secondHandPrice) {
        this.secondHandPrice = secondHandPrice;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }
}
