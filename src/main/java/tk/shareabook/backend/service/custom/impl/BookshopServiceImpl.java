package tk.shareabook.backend.service.custom.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.shareabook.backend.dto.BookShopDTO;
import tk.shareabook.backend.entity.BookShop;
import tk.shareabook.backend.entity.Login;
import tk.shareabook.backend.repository.BookShopRepository;
import tk.shareabook.backend.repository.LoginRepository;
import tk.shareabook.backend.service.custom.BookshopService;
import tk.shareabook.backend.service.types.UserType;
import tk.shareabook.backend.service.util.EntityConverter;

import java.util.List;

/**
 * @author Dilini Peiris on 7/3/2019
 */
@Service
public class BookshopServiceImpl implements BookshopService {

    @Autowired
    BookShopRepository bookShopRepository;

    @Autowired
    EntityConverter entityConverter;

    @Autowired
    LoginRepository loginRepository;

    @Override
    public boolean save(BookShopDTO dto) {
        BookShop bookShop = (BookShop) entityConverter.convertToEntity(dto);
        BookShop save = bookShopRepository.save(bookShop);
        loginRepository.save(new Login(dto.getUsername(), dto.getPassword(), UserType.BOOKSHOP_OWNER.toString(), save.getRegisterId()));
        return true;
    }

    @Override
    public void update(int id, BookShopDTO dto) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public BookShopDTO findByID(int id) {
        return null;
    }

    @Override
    public BookShopDTO findByName(String name) {
        return null;
    }

    @Override
    public List<BookShopDTO> findAll() {
        return null;
    }

    @Override
    public long getCount() {
        return 0;
    }

    @Override
    public boolean saveCatalog() {
        return false;
    }
}
