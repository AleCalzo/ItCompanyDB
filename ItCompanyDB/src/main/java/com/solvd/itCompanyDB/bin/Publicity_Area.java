package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Publicity_Area {
    private Long id=null;
    private Double budget;
    private String campaigns;

    public Publicity_Area(Long id, Double budget, String campaigns) {
        this.id = id;
        this.budget = budget;
        this.campaigns = campaigns;
    }

    @Override
    public String toString() {
        return "Publicity_Area{" +
                "id=" + id +
                ", budget=" + budget +
                ", campaigns='" + campaigns + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicity_Area that = (Publicity_Area) o;
        return Objects.equals(id, that.id) && Objects.equals(budget, that.budget) && Objects.equals(campaigns, that.campaigns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, budget, campaigns);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(String campaigns) {
        this.campaigns = campaigns;
    }
}
