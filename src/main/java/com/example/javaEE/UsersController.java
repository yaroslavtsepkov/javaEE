package com.example.javaEE;

import com.example.javaEE.dao.DataService;
import com.example.javaEE.model.User;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@RequestScoped
@Named
public class UsersController {

    @Inject
    DataService dataService;

    private List<User> allUsers;

    @PostConstruct
    public void initialize(){
        this.allUsers = dataService.getAllUsers();
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

}