package tk.shareabook.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.shareabook.backend.entity.SearchHit;

/**
 * @author Dilini Peiris on 7/3/2019
 */
public interface SearchHitRepository extends JpaRepository<SearchHit, Integer> {
}
