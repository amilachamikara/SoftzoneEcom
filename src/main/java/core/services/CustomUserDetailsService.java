package core.services;

import core.domain.User;
import core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amila on 1/15/16.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.getUserByUsername(username);

        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        ArrayList<GrantedAuthority> list = new ArrayList<>();

        List<String> roleList = userService.getUserByUsername(username).getRoles();

        for(String s: roleList) {
            list.add(new SimpleGrantedAuthority(s));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), list);
    }
}
