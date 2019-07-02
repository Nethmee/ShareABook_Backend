package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Embeddable
public class StudentPurchaseID {

    @ManyToOne
    private Student student;

    @ManyToOne
    private StudyMaterial studyMaterial;


    public StudentPurchaseID() {
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
