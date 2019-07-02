package entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Entity
@Table(name = "student_purchase")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.tuitionProvider",
                joinColumns = @JoinColumn(name = "student_id")),
        @AssociationOverride(name = "primaryKey.studyMaterial",
                joinColumns = @JoinColumn(name = "study_material_id"))
})
public class TuitionProviderUpload extends SuperEntity {

    @EmbeddedId
    private TuitionProviderUploadID primaryKey;

    @Column(name = "uploaded_date")
    private LocalDate uploadDate;

    public TuitionProviderUpload(TuitionProviderUploadID primaryKey, LocalDate uploadDate) {
        this.primaryKey = primaryKey;
        this.uploadDate = uploadDate;
    }

    public TuitionProviderUpload() {
    }

    public TuitionProviderUploadID getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(TuitionProviderUploadID primaryKey) {
        this.primaryKey = primaryKey;
    }

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }
}
