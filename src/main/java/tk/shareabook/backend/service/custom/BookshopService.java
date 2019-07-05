package tk.shareabook.backend.service.custom;

import tk.shareabook.backend.dto.BookShopDTO;
import tk.shareabook.backend.service.SuperService;

/**
 * @author Dilini Peiris on 7/3/2019
 */
public interface BookshopService extends SuperService<BookShopDTO> {
    public boolean saveCatalog();
}
