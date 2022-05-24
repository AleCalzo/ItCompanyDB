package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Salary {
    private Long id= null;
    private Double amount;

    public Salary(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return Objects.equals(id, salary.id) && Objects.equals(amount, salary.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
