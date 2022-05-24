package com.solvd.itCompanyDB.bin;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Developers_Area {
    private Long id=null;
    private String name;
    private Set<Currents_Projects> developerProjects = new HashSet<>();

    public Developers_Area(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addProject(Currents_Projects project){
        developerProjects.add(project);
        project.getDevelopers().add(this);
    }

    public void removeProject(Currents_Projects project){
        developerProjects.remove(project);
        project.getDevelopers().remove(this);
    }

    @Override
    public String toString() {
        return "Developers_Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developers_Area that = (Developers_Area) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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
}
