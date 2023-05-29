package com.company.service;

import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserServiceinter userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email);
        if (user != null) {
            org.springframework.security.core.userdetails.User.UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(email);
            builder.disabled(false);
            builder.password(user.getPassword());
//            builder.authorities(user.getAuth);

            String[] autArr = new String[]{"ROLE_USER"};
            builder.authorities(autArr);
            return builder.build();
        } else {
            throw new UsernameNotFoundException("user not found");
        }
    }

}
