/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhanifudin.example.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dhanifudin
 */
public class Data {

    private static Data INSTANCE = null;

    private Map<String, User> users;

    private Data() {
        this.users = new HashMap<>();
        initUsers();
    }

    public static Data getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Data();
        }
        return INSTANCE;
    }

    private void initUsers() {
        User user1 = new User("admin", "admin", "Malang");
        User user2 = new User("pegawai", "pegawai", "Malang");
        User user3 = new User("mahasiswa", "mahasiswa", "Malang");

        users.put(user1.getUsername(), user1);
        users.put(user2.getUsername(), user2);
        users.put(user3.getUsername(), user3);
    }

    public Map<String, User> getUsers() {
        return users;
    }

}
