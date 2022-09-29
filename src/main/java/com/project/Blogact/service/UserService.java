package com.project.Blogact.service;

import com.project.Blogact.model.User;
import com.project.Blogact.repo.UserRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author mehul jain
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

}
