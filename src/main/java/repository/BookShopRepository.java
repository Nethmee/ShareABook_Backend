package repository;

import entity.BookShop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dilini Peiris on 7/2/2019
 */
public interface BookShopRepository extends JpaRepository<BookShop,Integer> {
}
