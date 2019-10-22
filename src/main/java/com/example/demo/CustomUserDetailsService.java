package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Bauka on 22-Oct-19
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (!s.equals("test")) return new UserPrincipal(null);
        com.example.demo.User user = new com.example.demo.User("test", "$2a$11$1W59zKfESRYNv2AaHRPkpeW48YZdcY.QNw3GC/tV2KVmq4fGERmAK");
        return new UserPrincipal(user);
    }
}