package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "OuterEstateType" )
public class OuterEstateTypeEntity {
    private Long id;
    private String name;
    private Double sellingCorrection;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sellingCorrection", nullable = true, precision = 0)
    public Double getSellingCorrection() {
        return sellingCorrection;
    }

    public void setSellingCorrection(Double sellingCorrection) {
        this.sellingCorrection = sellingCorrection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OuterEstateTypeEntity that = (OuterEstateTypeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sellingCorrection != null ? !sellingCorrection.equals(that.sellingCorrection) : that.sellingCorrection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sellingCorrection != null ? sellingCorrection.hashCode() : 0);
        return result;
    }
}
