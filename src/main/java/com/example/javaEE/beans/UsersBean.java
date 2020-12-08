package com.example.javaEE.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

// javabean class users
@Entity
@Table(name = "users")
public class UsersBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public UsersBean() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersBean usersBean = (UsersBean) o;
        return idUser == usersBean.idUser && username.equals(usersBean.username) && password.equals(usersBean.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, username, password);
    }

    @Override
    public String toString() {
        return "UsersBean{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
