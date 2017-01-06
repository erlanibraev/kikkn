package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "CorrectionCoefs", schema = "dbo", catalog = "oris_kik")
public class CorrectionCoefsEntity {
    private Long id;
    private Long conclusionId;
    private Long apartmentAdsId;
    private Double sellingConditionCorrection;
    private Double placementCorrection;
    private Double techConditionCorrection;
    private Double facingCorrection;
    private Double areaCorrection;
    private Double storeyCorrection;
    private Double designCorrection;
    private Double engineeringSupplyCorrection;
    private Long actId;
    private Long houseAdsId;
    private Long commercialEstateAdsId;
    private Long landAdsId;
    private Long calculationMethodType;
    private Double beautificationCorrection;
    private Long claimsPurchaseMemosId;
    private Long preCostMemosId;
    private Double purposeCorrection;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "conclusionId", nullable = true)
    public Long getConclusionId() {
        return conclusionId;
    }

    public void setConclusionId(Long conclusionId) {
        this.conclusionId = conclusionId;
    }

    @Basic
    @Column(name = "apartmentAdsId", nullable = true)
    public Long getApartmentAdsId() {
        return apartmentAdsId;
    }

    public void setApartmentAdsId(Long apartmentAdsId) {
        this.apartmentAdsId = apartmentAdsId;
    }

    @Basic
    @Column(name = "sellingConditionCorrection", nullable = true, precision = 0)
    public Double getSellingConditionCorrection() {
        return sellingConditionCorrection;
    }

    public void setSellingConditionCorrection(Double sellingConditionCorrection) {
        this.sellingConditionCorrection = sellingConditionCorrection;
    }

    @Basic
    @Column(name = "placementCorrection", nullable = true, precision = 0)
    public Double getPlacementCorrection() {
        return placementCorrection;
    }

    public void setPlacementCorrection(Double placementCorrection) {
        this.placementCorrection = placementCorrection;
    }

    @Basic
    @Column(name = "techConditionCorrection", nullable = true, precision = 0)
    public Double getTechConditionCorrection() {
        return techConditionCorrection;
    }

    public void setTechConditionCorrection(Double techConditionCorrection) {
        this.techConditionCorrection = techConditionCorrection;
    }

    @Basic
    @Column(name = "facingCorrection", nullable = true, precision = 0)
    public Double getFacingCorrection() {
        return facingCorrection;
    }

    public void setFacingCorrection(Double facingCorrection) {
        this.facingCorrection = facingCorrection;
    }

    @Basic
    @Column(name = "areaCorrection", nullable = true, precision = 0)
    public Double getAreaCorrection() {
        return areaCorrection;
    }

    public void setAreaCorrection(Double areaCorrection) {
        this.areaCorrection = areaCorrection;
    }

    @Basic
    @Column(name = "storeyCorrection", nullable = true, precision = 0)
    public Double getStoreyCorrection() {
        return storeyCorrection;
    }

    public void setStoreyCorrection(Double storeyCorrection) {
        this.storeyCorrection = storeyCorrection;
    }

    @Basic
    @Column(name = "designCorrection", nullable = true, precision = 0)
    public Double getDesignCorrection() {
        return designCorrection;
    }

    public void setDesignCorrection(Double designCorrection) {
        this.designCorrection = designCorrection;
    }

    @Basic
    @Column(name = "engineeringSupplyCorrection", nullable = true, precision = 0)
    public Double getEngineeringSupplyCorrection() {
        return engineeringSupplyCorrection;
    }

    public void setEngineeringSupplyCorrection(Double engineeringSupplyCorrection) {
        this.engineeringSupplyCorrection = engineeringSupplyCorrection;
    }

    @Basic
    @Column(name = "actId", nullable = true)
    public Long getActId() {
        return actId;
    }

    public void setActId(Long actId) {
        this.actId = actId;
    }

    @Basic
    @Column(name = "houseAdsId", nullable = true)
    public Long getHouseAdsId() {
        return houseAdsId;
    }

    public void setHouseAdsId(Long houseAdsId) {
        this.houseAdsId = houseAdsId;
    }

    @Basic
    @Column(name = "commercialEstateAdsId", nullable = true)
    public Long getCommercialEstateAdsId() {
        return commercialEstateAdsId;
    }

    public void setCommercialEstateAdsId(Long commercialEstateAdsId) {
        this.commercialEstateAdsId = commercialEstateAdsId;
    }

    @Basic
    @Column(name = "landAdsId", nullable = true)
    public Long getLandAdsId() {
        return landAdsId;
    }

    public void setLandAdsId(Long landAdsId) {
        this.landAdsId = landAdsId;
    }

    @Basic
    @Column(name = "calculationMethodType", nullable = true)
    public Long getCalculationMethodType() {
        return calculationMethodType;
    }

    public void setCalculationMethodType(Long calculationMethodType) {
        this.calculationMethodType = calculationMethodType;
    }

    @Basic
    @Column(name = "beautificationCorrection", nullable = true, precision = 0)
    public Double getBeautificationCorrection() {
        return beautificationCorrection;
    }

    public void setBeautificationCorrection(Double beautificationCorrection) {
        this.beautificationCorrection = beautificationCorrection;
    }

    @Basic
    @Column(name = "claimsPurchaseMemosId", nullable = true)
    public Long getClaimsPurchaseMemosId() {
        return claimsPurchaseMemosId;
    }

    public void setClaimsPurchaseMemosId(Long claimsPurchaseMemosId) {
        this.claimsPurchaseMemosId = claimsPurchaseMemosId;
    }

    @Basic
    @Column(name = "preCostMemosId", nullable = true)
    public Long getPreCostMemosId() {
        return preCostMemosId;
    }

    public void setPreCostMemosId(Long preCostMemosId) {
        this.preCostMemosId = preCostMemosId;
    }

    @Basic
    @Column(name = "purposeCorrection", nullable = true, precision = 0)
    public Double getPurposeCorrection() {
        return purposeCorrection;
    }

    public void setPurposeCorrection(Double purposeCorrection) {
        this.purposeCorrection = purposeCorrection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CorrectionCoefsEntity that = (CorrectionCoefsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (conclusionId != null ? !conclusionId.equals(that.conclusionId) : that.conclusionId != null) return false;
        if (apartmentAdsId != null ? !apartmentAdsId.equals(that.apartmentAdsId) : that.apartmentAdsId != null)
            return false;
        if (sellingConditionCorrection != null ? !sellingConditionCorrection.equals(that.sellingConditionCorrection) : that.sellingConditionCorrection != null)
            return false;
        if (placementCorrection != null ? !placementCorrection.equals(that.placementCorrection) : that.placementCorrection != null)
            return false;
        if (techConditionCorrection != null ? !techConditionCorrection.equals(that.techConditionCorrection) : that.techConditionCorrection != null)
            return false;
        if (facingCorrection != null ? !facingCorrection.equals(that.facingCorrection) : that.facingCorrection != null)
            return false;
        if (areaCorrection != null ? !areaCorrection.equals(that.areaCorrection) : that.areaCorrection != null)
            return false;
        if (storeyCorrection != null ? !storeyCorrection.equals(that.storeyCorrection) : that.storeyCorrection != null)
            return false;
        if (designCorrection != null ? !designCorrection.equals(that.designCorrection) : that.designCorrection != null)
            return false;
        if (engineeringSupplyCorrection != null ? !engineeringSupplyCorrection.equals(that.engineeringSupplyCorrection) : that.engineeringSupplyCorrection != null)
            return false;
        if (actId != null ? !actId.equals(that.actId) : that.actId != null) return false;
        if (houseAdsId != null ? !houseAdsId.equals(that.houseAdsId) : that.houseAdsId != null) return false;
        if (commercialEstateAdsId != null ? !commercialEstateAdsId.equals(that.commercialEstateAdsId) : that.commercialEstateAdsId != null)
            return false;
        if (landAdsId != null ? !landAdsId.equals(that.landAdsId) : that.landAdsId != null) return false;
        if (calculationMethodType != null ? !calculationMethodType.equals(that.calculationMethodType) : that.calculationMethodType != null)
            return false;
        if (beautificationCorrection != null ? !beautificationCorrection.equals(that.beautificationCorrection) : that.beautificationCorrection != null)
            return false;
        if (claimsPurchaseMemosId != null ? !claimsPurchaseMemosId.equals(that.claimsPurchaseMemosId) : that.claimsPurchaseMemosId != null)
            return false;
        if (preCostMemosId != null ? !preCostMemosId.equals(that.preCostMemosId) : that.preCostMemosId != null)
            return false;
        if (purposeCorrection != null ? !purposeCorrection.equals(that.purposeCorrection) : that.purposeCorrection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (conclusionId != null ? conclusionId.hashCode() : 0);
        result = 31 * result + (apartmentAdsId != null ? apartmentAdsId.hashCode() : 0);
        result = 31 * result + (sellingConditionCorrection != null ? sellingConditionCorrection.hashCode() : 0);
        result = 31 * result + (placementCorrection != null ? placementCorrection.hashCode() : 0);
        result = 31 * result + (techConditionCorrection != null ? techConditionCorrection.hashCode() : 0);
        result = 31 * result + (facingCorrection != null ? facingCorrection.hashCode() : 0);
        result = 31 * result + (areaCorrection != null ? areaCorrection.hashCode() : 0);
        result = 31 * result + (storeyCorrection != null ? storeyCorrection.hashCode() : 0);
        result = 31 * result + (designCorrection != null ? designCorrection.hashCode() : 0);
        result = 31 * result + (engineeringSupplyCorrection != null ? engineeringSupplyCorrection.hashCode() : 0);
        result = 31 * result + (actId != null ? actId.hashCode() : 0);
        result = 31 * result + (houseAdsId != null ? houseAdsId.hashCode() : 0);
        result = 31 * result + (commercialEstateAdsId != null ? commercialEstateAdsId.hashCode() : 0);
        result = 31 * result + (landAdsId != null ? landAdsId.hashCode() : 0);
        result = 31 * result + (calculationMethodType != null ? calculationMethodType.hashCode() : 0);
        result = 31 * result + (beautificationCorrection != null ? beautificationCorrection.hashCode() : 0);
        result = 31 * result + (claimsPurchaseMemosId != null ? claimsPurchaseMemosId.hashCode() : 0);
        result = 31 * result + (preCostMemosId != null ? preCostMemosId.hashCode() : 0);
        result = 31 * result + (purposeCorrection != null ? purposeCorrection.hashCode() : 0);
        return result;
    }
}
