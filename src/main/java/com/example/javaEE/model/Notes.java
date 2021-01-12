package com.example.javaEE.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "notes")
@NamedQuery(name = "Notes.byUser", query = "select qual from notes qual where qual.user.id = :userId")
public class Notes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idnote;

    @ManyToOne
    @JoinColumn(name = "iduser", referencedColumnName = "iduser", nullable = false)
    User user;

    @Column(name = "title", length = 15)
    private String title;

    @Column(name = "content")
    private String content;

    public Notes() {
    }

    public Notes(User user, String title, String content) {
        this.user = user;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "idnote=" + idnote +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getIdnote() {
        return idnote;
    }

    public void setIdnote(int idnote) {
        this.idnote = idnote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes = (Notes) o;
        return idnote == notes.idnote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idnote);
    }
}
