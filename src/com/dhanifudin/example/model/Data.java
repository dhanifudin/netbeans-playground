/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhanifudin.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dhanifudin
 */
public class Data {

    private static Data INSTANCE = null;

    private Map<String, User> users;
    private List<Item> items;

    private Data() {
        this.users = new HashMap<>();
        this.items = new ArrayList<>();
        this.initUsers();
        this.initItems();
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

    public void initItems() {
        items.add(new Item("Item 1", 1000));
        items.add(new Item("Item 2", 2000));
        items.add(new Item("Item 3", 3000));
        items.add(new Item("Item 4", 4000));
        items.add(new Item("Item 5", 5000));
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public List<Item> getItems() {
        return items;
    }
}
