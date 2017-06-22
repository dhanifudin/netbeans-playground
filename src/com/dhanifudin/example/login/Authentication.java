/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhanifudin.example.login;

import com.dhanifudin.example.model.Data;
import com.dhanifudin.example.model.User;

/**
 *
 * @author dhanifudin
 */
public class Authentication {

    private Data data;

    private User user;

    public Authentication() {
        this.data = Data.getInstance();
    }

    public boolean login(String username, String password) {
        user = data.getUsers().get(username);
        if (user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }

    // get Authentication User
    public User getUser() {
        return user;
    }
    
}
