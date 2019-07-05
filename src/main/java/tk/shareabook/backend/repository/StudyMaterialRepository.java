package tk.shareabook.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.shareabook.backend.entity.StudyMaterial;

import java.util.List;

public interface StudyMaterialRepository extends JpaRepository<StudyMaterial, Integer> {

    List<StudyMaterial> findAllByTitleContainingOrAuthorContainingOrTypeContaining(String title, String author, String type);

    List<StudyMaterial> findAllByAuthorContaining(String keyword);
}
