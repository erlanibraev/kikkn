package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "AnalyticalCalculations", schema = "dbo", catalog = "oris_kik")
public class AnalyticalCalculationsEntity {
    private Long id;
    private Date date;
    private String note;
    private Double uzoMarketPriceSm;
    private Double uzoMarketPrice;
    private Long creditId;
    private Double calculatedPriceSm;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 2147483647)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "uzoMarketPriceSM", nullable = true, precision = 0)
    public Double getUzoMarketPriceSm() {
        return uzoMarketPriceSm;
    }

    public void setUzoMarketPriceSm(Double uzoMarketPriceSm) {
        this.uzoMarketPriceSm = uzoMarketPriceSm;
    }

    @Basic
    @Column(name = "uzoMarketPrice", nullable = true, precision = 0)
    public Double getUzoMarketPrice() {
        return uzoMarketPrice;
    }

    public void setUzoMarketPrice(Double uzoMarketPrice) {
        this.uzoMarketPrice = uzoMarketPrice;
    }

    @Basic
    @Column(name = "creditId", nullable = true)
    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    @Basic
    @Column(name = "calculatedPriceSM", nullable = true, precision = 0)
    public Double getCalculatedPriceSm() {
        return calculatedPriceSm;
    }

    public void setCalculatedPriceSm(Double calculatedPriceSm) {
        this.calculatedPriceSm = calculatedPriceSm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnalyticalCalculationsEntity that = (AnalyticalCalculationsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (uzoMarketPriceSm != null ? !uzoMarketPriceSm.equals(that.uzoMarketPriceSm) : that.uzoMarketPriceSm != null)
            return false;
        if (uzoMarketPrice != null ? !uzoMarketPrice.equals(that.uzoMarketPrice) : that.uzoMarketPrice != null)
            return false;
        if (creditId != null ? !creditId.equals(that.creditId) : that.creditId != null) return false;
        if (calculatedPriceSm != null ? !calculatedPriceSm.equals(that.calculatedPriceSm) : that.calculatedPriceSm != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (uzoMarketPriceSm != null ? uzoMarketPriceSm.hashCode() : 0);
        result = 31 * result + (uzoMarketPrice != null ? uzoMarketPrice.hashCode() : 0);
        result = 31 * result + (creditId != null ? creditId.hashCode() : 0);
        result = 31 * result + (calculatedPriceSm != null ? calculatedPriceSm.hashCode() : 0);
        return result;
    }
}
