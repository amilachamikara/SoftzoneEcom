package core.services;

import core.domain.User;

/**
 * Created by Amila on 1/15/16.
 */
public interface UserService {
    public User getUserByUsername(String username);
}
