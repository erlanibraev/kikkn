package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "Acts" )
public class ActsEntity {
    private Long id;
    private String code;
    private Date date;
    private Date surveyDate;
    private String purpose;
    private String docsList;
    private String actualUsage;
    private String possibleCommercialUsage;
    private Double uzoMarketPrice;
    private Double uzoMarketPricePerSquareMeter;
    private Long objectsId;
    private String regionName;
    private Double riskFreeInterestRate;
    private Double productionInvestmentRiskCorrection;
    private Double inefficientManagementCorrection;
    private Double lowLiquidityCorrection;
    private Double capitalReturnRate;
    private Double vat;
    private Double roomMaintainingCostMin;
    private Double roomMaintainingCostMax;
    private Double cit;
    private Boolean simplifiedTaxSystem;
    private Double uzoIncomeMethodPrice;
    private Double uzoIncomeMethodPriceReliability;
    private Double uzoMarketPriceReliability;
    private Long approverId;
    private Long doerId;

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
    @Column(name = "surveyDate", nullable = true)
    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    @Basic
    @Column(name = "purpose", nullable = true, length = 2147483647)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "docsList", nullable = true, length = 2147483647)
    public String getDocsList() {
        return docsList;
    }

    public void setDocsList(String docsList) {
        this.docsList = docsList;
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
    @Column(name = "regionName", nullable = true, length = 2147483647)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Basic
    @Column(name = "riskFreeInterestRate", nullable = true, precision = 0)
    public Double getRiskFreeInterestRate() {
        return riskFreeInterestRate;
    }

    public void setRiskFreeInterestRate(Double riskFreeInterestRate) {
        this.riskFreeInterestRate = riskFreeInterestRate;
    }

    @Basic
    @Column(name = "productionInvestmentRiskCorrection", nullable = true, precision = 0)
    public Double getProductionInvestmentRiskCorrection() {
        return productionInvestmentRiskCorrection;
    }

    public void setProductionInvestmentRiskCorrection(Double productionInvestmentRiskCorrection) {
        this.productionInvestmentRiskCorrection = productionInvestmentRiskCorrection;
    }

    @Basic
    @Column(name = "inefficientManagementCorrection", nullable = true, precision = 0)
    public Double getInefficientManagementCorrection() {
        return inefficientManagementCorrection;
    }

    public void setInefficientManagementCorrection(Double inefficientManagementCorrection) {
        this.inefficientManagementCorrection = inefficientManagementCorrection;
    }

    @Basic
    @Column(name = "lowLiquidityCorrection", nullable = true, precision = 0)
    public Double getLowLiquidityCorrection() {
        return lowLiquidityCorrection;
    }

    public void setLowLiquidityCorrection(Double lowLiquidityCorrection) {
        this.lowLiquidityCorrection = lowLiquidityCorrection;
    }

    @Basic
    @Column(name = "capitalReturnRate", nullable = true, precision = 0)
    public Double getCapitalReturnRate() {
        return capitalReturnRate;
    }

    public void setCapitalReturnRate(Double capitalReturnRate) {
        this.capitalReturnRate = capitalReturnRate;
    }

    @Basic
    @Column(name = "VAT", nullable = true, precision = 0)
    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    @Basic
    @Column(name = "roomMaintainingCostMin", nullable = true, precision = 0)
    public Double getRoomMaintainingCostMin() {
        return roomMaintainingCostMin;
    }

    public void setRoomMaintainingCostMin(Double roomMaintainingCostMin) {
        this.roomMaintainingCostMin = roomMaintainingCostMin;
    }

    @Basic
    @Column(name = "roomMaintainingCostMax", nullable = true, precision = 0)
    public Double getRoomMaintainingCostMax() {
        return roomMaintainingCostMax;
    }

    public void setRoomMaintainingCostMax(Double roomMaintainingCostMax) {
        this.roomMaintainingCostMax = roomMaintainingCostMax;
    }

    @Basic
    @Column(name = "CIT", nullable = true, precision = 0)
    public Double getCit() {
        return cit;
    }

    public void setCit(Double cit) {
        this.cit = cit;
    }

    @Basic
    @Column(name = "simplifiedTaxSystem", nullable = true)
    public Boolean getSimplifiedTaxSystem() {
        return simplifiedTaxSystem;
    }

    public void setSimplifiedTaxSystem(Boolean simplifiedTaxSystem) {
        this.simplifiedTaxSystem = simplifiedTaxSystem;
    }

    @Basic
    @Column(name = "uzoIncomeMethodPrice", nullable = true, precision = 0)
    public Double getUzoIncomeMethodPrice() {
        return uzoIncomeMethodPrice;
    }

    public void setUzoIncomeMethodPrice(Double uzoIncomeMethodPrice) {
        this.uzoIncomeMethodPrice = uzoIncomeMethodPrice;
    }

    @Basic
    @Column(name = "uzoIncomeMethodPriceReliability", nullable = true, precision = 0)
    public Double getUzoIncomeMethodPriceReliability() {
        return uzoIncomeMethodPriceReliability;
    }

    public void setUzoIncomeMethodPriceReliability(Double uzoIncomeMethodPriceReliability) {
        this.uzoIncomeMethodPriceReliability = uzoIncomeMethodPriceReliability;
    }

    @Basic
    @Column(name = "uzoMarketPriceReliability", nullable = true, precision = 0)
    public Double getUzoMarketPriceReliability() {
        return uzoMarketPriceReliability;
    }

    public void setUzoMarketPriceReliability(Double uzoMarketPriceReliability) {
        this.uzoMarketPriceReliability = uzoMarketPriceReliability;
    }

    @Basic
    @Column(name = "approverId", nullable = true)
    public Long getApproverId() {
        return approverId;
    }

    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }

    @Basic
    @Column(name = "doerId", nullable = true)
    public Long getDoerId() {
        return doerId;
    }

    public void setDoerId(Long doerId) {
        this.doerId = doerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActsEntity that = (ActsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (surveyDate != null ? !surveyDate.equals(that.surveyDate) : that.surveyDate != null) return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;
        if (docsList != null ? !docsList.equals(that.docsList) : that.docsList != null) return false;
        if (actualUsage != null ? !actualUsage.equals(that.actualUsage) : that.actualUsage != null) return false;
        if (possibleCommercialUsage != null ? !possibleCommercialUsage.equals(that.possibleCommercialUsage) : that.possibleCommercialUsage != null)
            return false;
        if (uzoMarketPrice != null ? !uzoMarketPrice.equals(that.uzoMarketPrice) : that.uzoMarketPrice != null)
            return false;
        if (uzoMarketPricePerSquareMeter != null ? !uzoMarketPricePerSquareMeter.equals(that.uzoMarketPricePerSquareMeter) : that.uzoMarketPricePerSquareMeter != null)
            return false;
        if (objectsId != null ? !objectsId.equals(that.objectsId) : that.objectsId != null) return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;
        if (riskFreeInterestRate != null ? !riskFreeInterestRate.equals(that.riskFreeInterestRate) : that.riskFreeInterestRate != null)
            return false;
        if (productionInvestmentRiskCorrection != null ? !productionInvestmentRiskCorrection.equals(that.productionInvestmentRiskCorrection) : that.productionInvestmentRiskCorrection != null)
            return false;
        if (inefficientManagementCorrection != null ? !inefficientManagementCorrection.equals(that.inefficientManagementCorrection) : that.inefficientManagementCorrection != null)
            return false;
        if (lowLiquidityCorrection != null ? !lowLiquidityCorrection.equals(that.lowLiquidityCorrection) : that.lowLiquidityCorrection != null)
            return false;
        if (capitalReturnRate != null ? !capitalReturnRate.equals(that.capitalReturnRate) : that.capitalReturnRate != null)
            return false;
        if (vat != null ? !vat.equals(that.vat) : that.vat != null) return false;
        if (roomMaintainingCostMin != null ? !roomMaintainingCostMin.equals(that.roomMaintainingCostMin) : that.roomMaintainingCostMin != null)
            return false;
        if (roomMaintainingCostMax != null ? !roomMaintainingCostMax.equals(that.roomMaintainingCostMax) : that.roomMaintainingCostMax != null)
            return false;
        if (cit != null ? !cit.equals(that.cit) : that.cit != null) return false;
        if (simplifiedTaxSystem != null ? !simplifiedTaxSystem.equals(that.simplifiedTaxSystem) : that.simplifiedTaxSystem != null)
            return false;
        if (uzoIncomeMethodPrice != null ? !uzoIncomeMethodPrice.equals(that.uzoIncomeMethodPrice) : that.uzoIncomeMethodPrice != null)
            return false;
        if (uzoIncomeMethodPriceReliability != null ? !uzoIncomeMethodPriceReliability.equals(that.uzoIncomeMethodPriceReliability) : that.uzoIncomeMethodPriceReliability != null)
            return false;
        if (uzoMarketPriceReliability != null ? !uzoMarketPriceReliability.equals(that.uzoMarketPriceReliability) : that.uzoMarketPriceReliability != null)
            return false;
        if (approverId != null ? !approverId.equals(that.approverId) : that.approverId != null) return false;
        if (doerId != null ? !doerId.equals(that.doerId) : that.doerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (surveyDate != null ? surveyDate.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (docsList != null ? docsList.hashCode() : 0);
        result = 31 * result + (actualUsage != null ? actualUsage.hashCode() : 0);
        result = 31 * result + (possibleCommercialUsage != null ? possibleCommercialUsage.hashCode() : 0);
        result = 31 * result + (uzoMarketPrice != null ? uzoMarketPrice.hashCode() : 0);
        result = 31 * result + (uzoMarketPricePerSquareMeter != null ? uzoMarketPricePerSquareMeter.hashCode() : 0);
        result = 31 * result + (objectsId != null ? objectsId.hashCode() : 0);
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        result = 31 * result + (riskFreeInterestRate != null ? riskFreeInterestRate.hashCode() : 0);
        result = 31 * result + (productionInvestmentRiskCorrection != null ? productionInvestmentRiskCorrection.hashCode() : 0);
        result = 31 * result + (inefficientManagementCorrection != null ? inefficientManagementCorrection.hashCode() : 0);
        result = 31 * result + (lowLiquidityCorrection != null ? lowLiquidityCorrection.hashCode() : 0);
        result = 31 * result + (capitalReturnRate != null ? capitalReturnRate.hashCode() : 0);
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        result = 31 * result + (roomMaintainingCostMin != null ? roomMaintainingCostMin.hashCode() : 0);
        result = 31 * result + (roomMaintainingCostMax != null ? roomMaintainingCostMax.hashCode() : 0);
        result = 31 * result + (cit != null ? cit.hashCode() : 0);
        result = 31 * result + (simplifiedTaxSystem != null ? simplifiedTaxSystem.hashCode() : 0);
        result = 31 * result + (uzoIncomeMethodPrice != null ? uzoIncomeMethodPrice.hashCode() : 0);
        result = 31 * result + (uzoIncomeMethodPriceReliability != null ? uzoIncomeMethodPriceReliability.hashCode() : 0);
        result = 31 * result + (uzoMarketPriceReliability != null ? uzoMarketPriceReliability.hashCode() : 0);
        result = 31 * result + (approverId != null ? approverId.hashCode() : 0);
        result = 31 * result + (doerId != null ? doerId.hashCode() : 0);
        return result;
    }
}
