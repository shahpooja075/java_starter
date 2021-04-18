package com.udaanApp.udaanApp.Services;

import com.udaanApp.udaanApp.Models.User;
import com.udaanApp.udaanApp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void saveUser(User user){
        userRepository.saveUser(user);
    }
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
}
