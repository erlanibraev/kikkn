package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "PreCostMemos" )
public class PreCostMemosEntity {
    private Long id;
    private String code;
    private Date date;
    private String regNumber;
    private Date regDate;
    private String regName;
    private String requestPurpose;
    private String actualUsage;
    private String possibleCommercialUsage;
    private Double uzoMarketPrice;
    private Double uzoMarketPricePerSquareMeter;
    private Long objectsId;
    private Long doerId;
    private Long approverId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "reg_number", nullable = true, length = 50)
    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Basic
    @Column(name = "reg_date", nullable = true)
    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "reg_name", nullable = true, length = 200)
    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    @Basic
    @Column(name = "requestPurpose", nullable = true, length = 2147483647)
    public String getRequestPurpose() {
        return requestPurpose;
    }

    public void setRequestPurpose(String requestPurpose) {
        this.requestPurpose = requestPurpose;
    }

    @Basic
    @Column(name = "actualUsage", nullable = true, length = 2147483647)
    public String getActualUsage() {
        return actualUsage;
    }

    public void setActualUsage(String actualUsage) {
        this.actualUsage = actualUsage;
    }

    @Basic
    @Column(name = "possibleCommercialUsage", nullable = true, length = 2147483647)
    public String getPossibleCommercialUsage() {
        return possibleCommercialUsage;
    }

    public void setPossibleCommercialUsage(String possibleCommercialUsage) {
        this.possibleCommercialUsage = possibleCommercialUsage;
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
    @Column(name = "uzoMarketPricePerSquareMeter", nullable = true, precision = 0)
    public Double getUzoMarketPricePerSquareMeter() {
        return uzoMarketPricePerSquareMeter;
    }

    public void setUzoMarketPricePerSquareMeter(Double uzoMarketPricePerSquareMeter) {
        this.uzoMarketPricePerSquareMeter = uzoMarketPricePerSquareMeter;
    }

    @Basic
    @Column(name = "objectsId", nullable = true)
    public Long getObjectsId() {
        return objectsId;
    }

    public void setObjectsId(Long objectsId) {
        this.objectsId = objectsId;
    }

    @Basic
    @Column(name = "doerId", nullable = true)
    public Long getDoerId() {
        return doerId;
    }

    public void setDoerId(Long doerId) {
        this.doerId = doerId;
    }

    @Basic
    @Column(name = "approverId", nullable = true)
    public Long getApproverId() {
        return approverId;
    }

    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreCostMemosEntity that = (PreCostMemosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (regNumber != null ? !regNumber.equals(that.regNumber) : that.regNumber != null) return false;
        if (regDate != null ? !regDate.equals(that.regDate) : that.regDate != null) return false;
        if (regName != null ? !regName.equals(that.regName) : that.regName != null) return false;
        if (requestPurpose != null ? !requestPurpose.equals(that.requestPurpose) : that.requestPurpose != null)
            return false;
        if (actualUsage != null ? !actualUsage.equals(that.actualUsage) : that.actualUsage != null) return false;
        if (possibleCommercialUsage != null ? !possibleCommercialUsage.equals(that.possibleCommercialUsage) : that.possibleCommercialUsage != null)
            return false;
        if (uzoMarketPrice != null ? !uzoMarketPrice.equals(that.uzoMarketPrice) : that.uzoMarketPrice != null)
            return false;
        if (uzoMarketPricePerSquareMeter != null ? !uzoMarketPricePerSquareMeter.equals(that.uzoMarketPricePerSquareMeter) : that.uzoMarketPricePerSquareMeter != null)
            return false;
        if (objectsId != null ? !objectsId.equals(that.objectsId) : that.objectsId != null) return false;
        if (doerId != null ? !doerId.equals(that.doerId) : that.doerId != null) return false;
        if (approverId != null ? !approverId.equals(that.approverId) : that.approverId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (regNumber != null ? regNumber.hashCode() : 0);
        result = 31 * result + (regDate != null ? regDate.hashCode() : 0);
        result = 31 * result + (regName != null ? regName.hashCode() : 0);
        result = 31 * result + (requestPurpose != null ? requestPurpose.hashCode() : 0);
        result = 31 * result + (actualUsage != null ? actualUsage.hashCode() : 0);
        result = 31 * result + (possibleCommercialUsage != null ? possibleCommercialUsage.hashCode() : 0);
        result = 31 * result + (uzoMarketPrice != null ? uzoMarketPrice.hashCode() : 0);
        result = 31 * result + (uzoMarketPricePerSquareMeter != null ? uzoMarketPricePerSquareMeter.hashCode() : 0);
        result = 31 * result + (objectsId != null ? objectsId.hashCode() : 0);
        result = 31 * result + (doerId != null ? doerId.hashCode() : 0);
        result = 31 * result + (approverId != null ? approverId.hashCode() : 0);
        return result;
    }
}
