package core.repository;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Amila on 1/15/16.
 */
@Transactional
public interface CrudRepository<T> {
    public T getById(int id);
    public List<T> list();
    public void delete(int id);
    public void save(T obj);
    public void delete(T obj);
}
