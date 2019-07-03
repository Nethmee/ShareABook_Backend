package service.custom.impl;

import dto.StudyMaterialDTO;
import entity.StudyMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import repository.StudyMaterialRepository;
import service.custom.StudyMaterialSearchService;
import service.util.DtoConverter;

import java.util.List;

public class StudyMaterialSearchServiceImpl implements StudyMaterialSearchService {

    @Autowired
    StudyMaterialRepository studyMaterialRepository;

    @Autowired
    DtoConverter dtoConverter;

    @Override
    public List<StudyMaterialDTO> search(String keyword) {
        List<StudyMaterial> searchResults = studyMaterialRepository.findAllByTitleContainingOrAuthorContainingOrTypeContaining(keyword);
        List<StudyMaterialDTO> results = dtoConverter.convertToDtoList(searchResults);
        return results;
    }

    @Override
    public List<StudyMaterialDTO> searchByAuthor(String keyword) {
        List<StudyMaterial> searchResults = studyMaterialRepository.findAllByAuthorContaining(keyword);
        List<StudyMaterialDTO> results = dtoConverter.convertToDtoList(searchResults);
        return results;

    }
}
