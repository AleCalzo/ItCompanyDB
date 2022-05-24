package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Customers {

    private Long id= null;
    private String name;
    private String last_name;
    private String email;

    public Customers(Long id, String name, String last_name, String email) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers custumers = (Customers) o;
        return Objects.equals(id, custumers.id) && Objects.equals(name, custumers.name) && Objects.equals(last_name, custumers.last_name) && Objects.equals(email, custumers.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, last_name, email);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
