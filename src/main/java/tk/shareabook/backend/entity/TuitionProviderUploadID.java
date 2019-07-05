package tk.shareabook.backend.entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Embeddable
public class TuitionProviderUploadID implements Serializable {

    @ManyToOne
    private TuitionProvider tuitionProvider;

    @ManyToOne
    private StudyMaterial studyMaterial;

    public TuitionProviderUploadID(TuitionProvider tuitionProvider, StudyMaterial studyMaterial) {
        this.tuitionProvider = tuitionProvider;
        this.studyMaterial = studyMaterial;
    }

    public TuitionProviderUploadID() {
    }

    public TuitionProvider getTuitionProvider() {
        return tuitionProvider;
    }

    public void setTuitionProvider(TuitionProvider tuitionProvider) {
        this.tuitionProvider = tuitionProvider;
    }

    public StudyMaterial getStudyMaterial() {
        return studyMaterial;
    }

    public void setStudyMaterial(StudyMaterial studyMaterial) {
        this.studyMaterial = studyMaterial;
    }
}