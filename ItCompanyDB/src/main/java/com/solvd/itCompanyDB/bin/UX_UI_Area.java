package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class UX_UI_Area {
    private Long id= null;
    private String proyect_name;

    public UX_UI_Area(Long id, String proyect_name) {
        this.id = id;
        this.proyect_name = proyect_name;
    }

    @Override
    public String toString() {
        return "UX_UI_Area{" +
                "id=" + id +
                ", proyect_name='" + proyect_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UX_UI_Area that = (UX_UI_Area) o;
        return Objects.equals(id, that.id) && Objects.equals(proyect_name, that.proyect_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, proyect_name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProyect_name() {
        return proyect_name;
    }

    public void setProyect_name(String proyect_name) {
        this.proyect_name = proyect_name;
    }
}
