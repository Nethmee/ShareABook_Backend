package entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Embeddable
public class StudentUploadID implements Serializable {

    @ManyToOne
    private Student student;

    @ManyToOne
    private StudyMaterial studyMaterial;

    public StudentUploadID(Student student, StudyMaterial studyMaterial) {
        this.student = student;
        this.studyMaterial = studyMaterial;
    }

    public StudentUploadID() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudyMaterial getStudyMaterial() {
        return studyMaterial;
    }

    public void setStudyMaterial(StudyMaterial studyMaterial) {
        this.studyMaterial = studyMaterial;
    }
}
