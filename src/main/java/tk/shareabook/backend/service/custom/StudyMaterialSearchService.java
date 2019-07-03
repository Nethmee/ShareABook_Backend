package tk.shareabook.backend.service.custom;

import tk.shareabook.backend.dto.StudyMaterialDTO;

import java.util.List;

public interface StudyMaterialSearchService {

    List<StudyMaterialDTO> search(String keyword);

    List<StudyMaterialDTO> searchByAuthor(String keyword);
}
