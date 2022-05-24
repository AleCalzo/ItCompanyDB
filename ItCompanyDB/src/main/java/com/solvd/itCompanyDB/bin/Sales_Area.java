package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Sales_Area {
    private Long id= null;
    private String sales_name;

    public Sales_Area(Long id, String sales_name) {
        this.id = id;
        this.sales_name = sales_name;
    }

    @Override
    public String toString() {
        return "Sales_Area{" +
                "id=" + id +
                ", sales_name='" + sales_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales_Area that = (Sales_Area) o;
        return Objects.equals(id, that.id) && Objects.equals(sales_name, that.sales_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sales_name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSales_name() {
        return sales_name;
    }

    public void setSales_name(String sales_name) {
        this.sales_name = sales_name;
    }
}
