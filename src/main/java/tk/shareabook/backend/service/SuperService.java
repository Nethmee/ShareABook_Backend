package tk.shareabook.backend.service;

import tk.shareabook.backend.dto.SuperDTO;

import java.util.List;

/**
 * @author Dilini Peiris on 7/3/2019
 */
public interface SuperService<T extends SuperDTO> {

    boolean save(T dto);

    void update(int id, T dto);

    void delete(int id);

    T findByID(int id);

    T findByName(String name);

    List<T> findAll();

    long getCount();
}