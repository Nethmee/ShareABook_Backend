package tk.shareabook.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.shareabook.backend.dto.StudyMaterialDTO;
import tk.shareabook.backend.service.custom.StudyMaterialSearchService;

import java.util.List;

/**
 * @author Dilini Peiris on 7/2/2019
 */
@RestController
@RequestMapping("/api/v1/search")
public class StudyMaterialController {

    @Autowired
    StudyMaterialSearchService studyMaterialSearchService;

    @GetMapping("/all")
    public List<StudyMaterialDTO> search(@RequestParam(name = "keyword") String search) {
        return studyMaterialSearchService.search(search);
    }

    @GetMapping("/author")
    public List<StudyMaterialDTO> searchByAuthor(@RequestParam(name = "keyword") String search) {
        return studyMaterialSearchService.searchByAuthor(search);
    }

}

