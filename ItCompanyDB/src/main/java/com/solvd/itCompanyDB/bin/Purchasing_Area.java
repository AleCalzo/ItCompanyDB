package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Purchasing_Area {
    private Long id= null;
    private int case_number;

    public Purchasing_Area(Long id, int case_number) {
        this.id = id;
        this.case_number = case_number;
    }

    @Override
    public String toString() {
        return "Purchasing_Area{" +
                "id=" + id +
                ", case_number=" + case_number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchasing_Area that = (Purchasing_Area) o;
        return case_number == that.case_number && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, case_number);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCase_number() {
        return case_number;
    }

    public void setCase_number(int case_number) {
        this.case_number = case_number;
    }
}
