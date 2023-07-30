package com.example.tacocloud.user;

import java.util.*;

public class Users {
    public List<User> usersList = new LinkedList<>();
    public void addUser(User user){
        usersList.add(user);
        Collections.reverse(usersList);
    }
    public List<User> getUsersList(User user) {
        return usersList;
    }
}
