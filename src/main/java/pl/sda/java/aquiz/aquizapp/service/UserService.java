package pl.sda.java.aquiz.aquizapp.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.java.aquiz.aquizapp.entities.RoleRepository;
import pl.sda.java.aquiz.aquizapp.entities.UserRepository;

@Service
public class UserService {

    public UserRepository userRepository;
    public RoleRepository roleRepository;
    public PasswordEncoder passwordEncoder;

    public static final String ROLE_USER = "USER_ROLE";

    public UserService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // public void registerUser(){


    }


