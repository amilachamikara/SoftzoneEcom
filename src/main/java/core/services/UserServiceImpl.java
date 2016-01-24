package core.services;

import core.domain.User;
import core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Amila on 1/15/16.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    public User getUserByUsername(String username) {
        return repository.getByUsername(username);
    }
}
