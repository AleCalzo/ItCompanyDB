package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class RRHH_Area {
    private Long id= null;
    private int employee_hollydays;

    public RRHH_Area(Long id, int employee_hollydays) {
        this.id = id;
        this.employee_hollydays = employee_hollydays;
    }

    @Override
    public String toString() {
        return "RRHH_Area{" +
                "id=" + id +
                ", employee_hollydays=" + employee_hollydays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RRHH_Area rrhh_area = (RRHH_Area) o;
        return employee_hollydays == rrhh_area.employee_hollydays && Objects.equals(id, rrhh_area.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employee_hollydays);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEmployee_hollydays() {
        return employee_hollydays;
    }

    public void setEmployee_hollydays(int employee_hollydays) {
        this.employee_hollydays = employee_hollydays;
    }
}
