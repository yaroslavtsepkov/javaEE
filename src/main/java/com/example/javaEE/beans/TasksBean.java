package com.example.javaEE.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

// javabean class tasks
@Entity
@Table(name = "tasks")
public class TasksBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtask;
    private int iduser;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private boolean status;
    @Column(name = "deadline")
    private Date deadline;

    public TasksBean() {
    }

    public int getIdtask() {
        return idtask;
    }

    public void setIdtask(int idtask) {
        this.idtask = idtask;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksBean tasksBean = (TasksBean) o;
        return idtask == tasksBean.idtask && iduser == tasksBean.iduser && Objects.equals(title, tasksBean.title) && Objects.equals(description, tasksBean.description) && Objects.equals(status, tasksBean.status) && Objects.equals(deadline, tasksBean.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtask, iduser, title, description, status, deadline);
    }

    @Override
    public String toString() {
        return "TasksBean{" +
                "idtask=" + idtask +
                ", iduser=" + iduser +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
