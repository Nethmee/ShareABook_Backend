package service.custom;

import dto.StudyMaterialDTO;

import java.util.List;

public interface StudyMaterialSearchService {

    List<StudyMaterialDTO> search(String keyword);

    List<StudyMaterialDTO> searchByAuthor(String keyword);
}
