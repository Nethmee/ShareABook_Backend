package tk.shareabook.backend.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Dilini Peiris on 7/3/2019
 */
@Entity
@Table(name = "search_hit")
public class SearchHit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "search_keyword")
    private String search_key;
    @Column(name = "searched_datetime")
    private LocalDateTime localDateTime;
    @Column(name = "location")
    private String location;

    public SearchHit() {
    }

    public SearchHit(String search_key, LocalDateTime localDateTime, String location) {
        this.search_key = search_key;
        this.localDateTime = localDateTime;
        this.location = location;
    }

    public SearchHit(String search_key, LocalDateTime localDateTime) {
        this.search_key = search_key;
        this.localDateTime = localDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSearch_key() {
        return search_key;
    }

    public void setSearch_key(String search_key) {
        this.search_key = search_key;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
