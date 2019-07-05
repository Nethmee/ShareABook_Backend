package tk.shareabook.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.shareabook.backend.dto.StudyMaterialDTO;
import tk.shareabook.backend.service.custom.StudyMaterialSearchService;

import java.util.List;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/book")
public class StudyMaterialController {

    @Autowired
    StudyMaterialSearchService studyMaterialSearchService;

    @GetMapping(path = "/search/all", consumes = "application/json", produces = "application/json")
    public List<StudyMaterialDTO> search(@RequestParam(name = "keyword") String search) {
        return studyMaterialSearchService.search(search);
    }

    @GetMapping(path = "/search/author", consumes = "application/json", produces = "application/json")
    public List<StudyMaterialDTO> searchByAuthor(@RequestParam(name = "searchTerm") String search) {
        return studyMaterialSearchService.searchByAuthor(search);
    }

}

