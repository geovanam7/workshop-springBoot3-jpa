package com.project.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User  implements Serializable {
    private Long id;
    private String Name;
    private String Email;
    private String Phone;
    private String Password;

    public User() {
    }

    public User(Long id, String Name, String Email, String Phone, String Password) {
        super();
        this.id = id;
        this.Name=Name;
        this.Email = Email;
        this.Phone=Phone;
        this.Password = Password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
