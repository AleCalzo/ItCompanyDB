package com.solvd.itCompanyDB.bin;

import java.util.Date;
import java.util.Objects;

public class Employees {
    private Long id=null;
    private String name;
    private String last_name;
    private Date birth_date;

    public Employees(Long id, String name, String last_name, Date birth_date) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(id, employees.id) && Objects.equals(name, employees.name) && Objects.equals(last_name, employees.last_name) && Objects.equals(birth_date, employees.birth_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, last_name, birth_date);
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

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
}
