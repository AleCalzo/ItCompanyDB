package com.solvd.itCompanyDB.bin;

import java.util.Objects;

public class Services_Provide {
    private Long id= null;
    private String service_name;

    public Services_Provide(Long id, String service_name) {
        this.id = id;
        this.service_name = service_name;
    }

    @Override
    public String toString() {
        return "Services_Provide{" +
                "id=" + id +
                ", service_name='" + service_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Services_Provide that = (Services_Provide) o;
        return Objects.equals(id, that.id) && Objects.equals(service_name, that.service_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, service_name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
