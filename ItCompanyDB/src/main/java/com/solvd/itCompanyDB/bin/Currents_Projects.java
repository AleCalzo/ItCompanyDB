package com.solvd.itCompanyDB.bin;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

public class Currents_Projects {

    private Long id = null;
    private String name;
    private Date start_date;
    private Date end_date;

    public Currents_Projects(Long id, String name, Date start_date, Date end_date) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Currents_Projects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currents_Projects that = (Currents_Projects) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(start_date, that.start_date) && Objects.equals(end_date, that.end_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, start_date, end_date);
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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Collection<Developers_Area> getDevelopers() {
        return null;
    }
}
