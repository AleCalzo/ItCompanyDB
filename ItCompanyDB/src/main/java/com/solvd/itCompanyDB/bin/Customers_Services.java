package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Customers_Services {
    private Long id= null;
    private int case_number;
    private String state;
    private String employee_name;

    public Customers_Services(Long id, int case_number, String state, String employee_name) {
        this.id = id;
        this.case_number = case_number;
        this.state = state;
        this.employee_name = employee_name;
    }

    @Override
    public String toString() {
        return "Customers_Services{" +
                "id=" + id +
                ", case_number=" + case_number +
                ", state='" + state + '\'' +
                ", employee_name='" + employee_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers_Services that = (Customers_Services) o;
        return case_number == that.case_number && Objects.equals(id, that.id) && Objects.equals(state, that.state) && Objects.equals(employee_name, that.employee_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, case_number, state, employee_name);
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
}
