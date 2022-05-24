package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Bills {
    private Long id= null;
    private int bill_number;
    private Double amount;

    public Bills(Long id, int bill_number, Double amount) {
        this.id = id;
        this.bill_number = bill_number;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bills{" +
                "id=" + id +
                ", bill_number=" + bill_number +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bills bills = (Bills) o;
        return bill_number == bills.bill_number && Objects.equals(id, bills.id) && Objects.equals(amount, bills.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bill_number, amount);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBill_number() {
        return bill_number;
    }

    public void setBill_number(int bill_number) {
        this.bill_number = bill_number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
