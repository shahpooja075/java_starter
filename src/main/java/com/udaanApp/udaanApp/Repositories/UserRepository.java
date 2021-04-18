package com.udaanApp.udaanApp.Repositories;

import com.udaanApp.udaanApp.Models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static List<User> usersList;
    private static int userCount=0;

    static{
        usersList = new ArrayList<>();
        usersList.add(new User(1,"Pooja","D1111"));
        userCount++;
    }

    public void saveUser(User user){
        if(user.getUserId()==null)
            user.setUserId(++userCount);
        usersList.add(user);
    }
    public List<User> getAllUsers(){
        return usersList;
    }
}
