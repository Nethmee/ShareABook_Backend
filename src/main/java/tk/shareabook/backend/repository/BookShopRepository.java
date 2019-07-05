package tk.shareabook.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.shareabook.backend.entity.BookShop;

/**
 * @author Dilini Peiris on 7/2/2019
 */
public interface BookShopRepository extends JpaRepository<BookShop,Integer> {
}
