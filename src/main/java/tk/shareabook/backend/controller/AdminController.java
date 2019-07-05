package tk.shareabook.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.shareabook.backend.dto.BookShopDTO;
import tk.shareabook.backend.service.custom.BookshopService;

/**
 * @author Dilini Peiris on 7/3/2019
 */
@RestController
@RequestMapping("/api/v1/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    BookshopService bookshopService;

    @PostMapping(path = "/bookshop/register", consumes = "application/json", produces = "application/json")
    public void registerBookshop(BookShopDTO bookShopDTO) {
        bookshopService.save(bookShopDTO);
    }
}
