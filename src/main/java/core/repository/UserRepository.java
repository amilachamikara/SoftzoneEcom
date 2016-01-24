package core.repository;

import core.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Amila on 1/15/16.
 */
@Transactional
public interface UserRepository extends CrudRepository<User>{
    public User getByUsername(String username);
}
