package tk.shareabook.backend.service.custom.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.shareabook.backend.dto.StudyMaterialDTO;
import tk.shareabook.backend.entity.SearchHit;
import tk.shareabook.backend.entity.StudyMaterial;
import tk.shareabook.backend.repository.SearchHitRepository;
import tk.shareabook.backend.repository.StudyMaterialRepository;
import tk.shareabook.backend.service.custom.StudyMaterialSearchService;
import tk.shareabook.backend.service.util.DtoConverter;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudyMaterialSearchServiceImpl implements StudyMaterialSearchService {

    @Autowired
    StudyMaterialRepository studyMaterialRepository;

    @Autowired
    DtoConverter dtoConverter;

    @Autowired
    SearchHitRepository searchHitRepository;

    @Override
    public List<StudyMaterialDTO> search(String keyword) {
        List<StudyMaterial> searchResults = studyMaterialRepository.findAllByTitleContainingOrAuthorContainingOrTypeContaining(keyword, keyword, keyword);
        List<StudyMaterialDTO> results = dtoConverter.convertToDtoList(searchResults);
        recordSearch(new SearchHit(keyword, LocalDateTime.now()));
        return results;
    }

    @Override
    public List<StudyMaterialDTO> searchByAuthor(String keyword) {
        List<StudyMaterial> searchResults = studyMaterialRepository.findAllByAuthorContaining(keyword);
        List<StudyMaterialDTO> results = dtoConverter.convertToDtoList(searchResults);
        recordSearch(new SearchHit(keyword, LocalDateTime.now()));
        return results;
    }

    private void recordSearch(SearchHit searchHit) {
        searchHitRepository.save(searchHit);
    }

}
