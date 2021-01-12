package com.example.javaEE.dao;

import com.example.javaEE.model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class DataService {

    @PersistenceContext(unitName = "esa_l1")
    EntityManager entityManager;

//    @Transactional
//    public User createUser(String username, String password){
//        User user = new User(username, password);
//        entityManager.persist(user);
//        entityManager.flush();
//        return user;
//    }
//
//    @Transactional
//    public Notes createNotes(User user, String title, String content){
//        Notes notes = new Notes(user, title, content);
//        entityManager.persist(notes);
//        entityManager.flush();
//        return notes;
//    }

    public List<User> getAllUsers(){
        return entityManager.createNamedQuery("User.all", User.class).getResultList();
    }

//    public Optional<User> getUser(String username){
//        return entityManager.createNamedQuery("User.byUsername", User.class)
//                .setParameter("username", username)
//                .getResultList()
//                .stream()
//                .findFirst();
//    }
//
//    public List<Notes> getNotes(User user){
//        return entityManager.createNamedQuery("Notes.byUser", Notes.class)
//                .setParameter("userId", user.getIduser())
//                .getResultList();
//    }
}
