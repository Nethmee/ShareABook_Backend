package entity;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@Embeddable
public class BookShopUploadID {

    @ManyToOne
    private BookShop bookShop;

    @ManyToOne
    private StudyMaterial studyMaterial;

    public BookShopUploadID(BookShop bookShop, StudyMaterial studyMaterial) {
        this.bookShop = bookShop;
        this.studyMaterial = studyMaterial;
    }

    public BookShopUploadID() {
    }

    public BookShop getBookShop() {
        return bookShop;
    }

    public void setBookShop(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    public StudyMaterial getStudyMaterial() {
        return studyMaterial;
    }

    public void setStudyMaterial(StudyMaterial studyMaterial) {
        this.studyMaterial = studyMaterial;
    }
}
