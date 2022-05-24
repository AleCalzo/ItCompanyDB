package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Bill_has_Custumers {
    private Long idBills= null;
    private Long idCustumers= null;

    public Bill_has_Custumers(Long idBills, Long idCustumers) {
        this.idBills = idBills;
        this.idCustumers = idCustumers;
    }

    @Override
    public String toString() {
        return "Bill_has_Custumers{" +
                "idBills=" + idBills +
                ", idCustumers=" + idCustumers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill_has_Custumers that = (Bill_has_Custumers) o;
        return Objects.equals(idBills, that.idBills) && Objects.equals(idCustumers, that.idCustumers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBills, idCustumers);
    }

    public Long getIdBills() {
        return idBills;
    }

    public void setIdBills(Long idBills) {
        this.idBills = idBills;
    }

    public Long getIdCustumers() {
        return idCustumers;
    }

    public void setIdCustumers(Long idCustumers) {
        this.idCustumers = idCustumers;
    }
}
