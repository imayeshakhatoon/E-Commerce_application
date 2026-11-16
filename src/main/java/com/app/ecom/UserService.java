package com.app.ecom;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final List<User> userList = new ArrayList<>();
    private Long nextId = 1L;

    public  List<User> fetchAllUsers()
    {
        return userList;
    }

    public void addUser(User user)
    {   user.setId(nextId++);
        userList.add(user);

    }

    public Optional<User> fetchUser(Long id) {
//        for(User user : userList){
//            if(user.getId().equals(id)){
//                return user;
//            }
        return userList.stream()
                .filter(user -> user.getId().equals(id)).findFirst();

    }

    public boolean updateUser(Long id, User updatedUser) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .isPresent()
                .map(existingUser ->{
                    existingUser.set
                })

    }

    }

}
