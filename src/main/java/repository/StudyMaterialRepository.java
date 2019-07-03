package repository;

import entity.StudyMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudyMaterialRepository extends JpaRepository<StudyMaterial, Integer> {

    List<StudyMaterial> findAllByTitleContainingOrAuthorContainingOrTypeContaining(String keyword);

    List<StudyMaterial> findAllByAuthorContaining(String keyword);
}
