package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "CommercialEstateAds", schema = "dbo", catalog = "oris_kik")
public class CommercialEstateAdsEntity {
    private Long id;
    private Long commercialEstateType;
    private Integer roomCount;
    private Double price;
    private Long priceUnit;
    private Boolean isPledged;
    private Long buildingType;
    private String bussinessCenterName;
    private Double area;
    private Double hallArea;
    private Double productionRoomArea;
    private Double warehouseSpaceArea;
    private Double officeSpaceArea;
    private Integer storeysNumber;
    private Integer storey;
    private Double landArea;
    private Integer yearBuilt;
    private Long condition;
    private Long wallType;
    private Double ceilingHeight;
    private Long heatingType;
    private Long waterSupplyType;
    private String communications;
    private String description;
    private String security;
    private String otherProp;
    private Date createDate;
    private Long pageId;
    private String link;
    private String phoneNumber;
    private Boolean isAnalog;
    private Long advertType;
    private Long region;
    private Double lat;
    private Double lon;
    private String addressName;
    private Long source;
    private Long internetType;
    private Long rentPeriodType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "commercialEstateType", nullable = true)
    public Long getCommercialEstateType() {
        return commercialEstateType;
    }

    public void setCommercialEstateType(Long commercialEstateType) {
        this.commercialEstateType = commercialEstateType;
    }

    @Basic
    @Column(name = "roomCount", nullable = true)
    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "priceUnit", nullable = true)
    public Long getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Long priceUnit) {
        this.priceUnit = priceUnit;
    }

    @Basic
    @Column(name = "isPledged", nullable = true)
    public Boolean getPledged() {
        return isPledged;
    }

    public void setPledged(Boolean pledged) {
        isPledged = pledged;
    }

    @Basic
    @Column(name = "buildingType", nullable = true)
    public Long getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Long buildingType) {
        this.buildingType = buildingType;
    }

    @Basic
    @Column(name = "bussinessCenterName", nullable = true, length = 2147483647)
    public String getBussinessCenterName() {
        return bussinessCenterName;
    }

    public void setBussinessCenterName(String bussinessCenterName) {
        this.bussinessCenterName = bussinessCenterName;
    }

    @Basic
    @Column(name = "area", nullable = true, precision = 0)
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Basic
    @Column(name = "hallArea", nullable = true, precision = 0)
    public Double getHallArea() {
        return hallArea;
    }

    public void setHallArea(Double hallArea) {
        this.hallArea = hallArea;
    }

    @Basic
    @Column(name = "productionRoomArea", nullable = true, precision = 0)
    public Double getProductionRoomArea() {
        return productionRoomArea;
    }

    public void setProductionRoomArea(Double productionRoomArea) {
        this.productionRoomArea = productionRoomArea;
    }

    @Basic
    @Column(name = "warehouseSpaceArea", nullable = true, precision = 0)
    public Double getWarehouseSpaceArea() {
        return warehouseSpaceArea;
    }

    public void setWarehouseSpaceArea(Double warehouseSpaceArea) {
        this.warehouseSpaceArea = warehouseSpaceArea;
    }

    @Basic
    @Column(name = "officeSpaceArea", nullable = true, precision = 0)
    public Double getOfficeSpaceArea() {
        return officeSpaceArea;
    }

    public void setOfficeSpaceArea(Double officeSpaceArea) {
        this.officeSpaceArea = officeSpaceArea;
    }

    @Basic
    @Column(name = "storeysNumber", nullable = true)
    public Integer getStoreysNumber() {
        return storeysNumber;
    }

    public void setStoreysNumber(Integer storeysNumber) {
        this.storeysNumber = storeysNumber;
    }

    @Basic
    @Column(name = "storey", nullable = true)
    public Integer getStorey() {
        return storey;
    }

    public void setStorey(Integer storey) {
        this.storey = storey;
    }

    @Basic
    @Column(name = "landArea", nullable = true, precision = 0)
    public Double getLandArea() {
        return landArea;
    }

    public void setLandArea(Double landArea) {
        this.landArea = landArea;
    }

    @Basic
    @Column(name = "yearBuilt", nullable = true)
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Basic
    @Column(name = "condition", nullable = true)
    public Long getCondition() {
        return condition;
    }

    public void setCondition(Long condition) {
        this.condition = condition;
    }

    @Basic
    @Column(name = "wallType", nullable = true)
    public Long getWallType() {
        return wallType;
    }

    public void setWallType(Long wallType) {
        this.wallType = wallType;
    }

    @Basic
    @Column(name = "ceilingHeight", nullable = true, precision = 0)
    public Double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    @Basic
    @Column(name = "heatingType", nullable = true)
    public Long getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(Long heatingType) {
        this.heatingType = heatingType;
    }

    @Basic
    @Column(name = "waterSupplyType", nullable = true)
    public Long getWaterSupplyType() {
        return waterSupplyType;
    }

    public void setWaterSupplyType(Long waterSupplyType) {
        this.waterSupplyType = waterSupplyType;
    }

    @Basic
    @Column(name = "communications", nullable = true, length = 2147483647)
    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 2147483647)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "security", nullable = true, length = 2147483647)
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    @Basic
    @Column(name = "otherProp", nullable = true, length = 2147483647)
    public String getOtherProp() {
        return otherProp;
    }

    public void setOtherProp(String otherProp) {
        this.otherProp = otherProp;
    }

    @Basic
    @Column(name = "createDate", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "pageId", nullable = true)
    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    @Basic
    @Column(name = "link", nullable = true, length = 2147483647)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Basic
    @Column(name = "phoneNumber", nullable = true, length = 50)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "isAnalog", nullable = true)
    public Boolean getAnalog() {
        return isAnalog;
    }

    public void setAnalog(Boolean analog) {
        isAnalog = analog;
    }

    @Basic
    @Column(name = "advertType", nullable = true)
    public Long getAdvertType() {
        return advertType;
    }

    public void setAdvertType(Long advertType) {
        this.advertType = advertType;
    }

    @Basic
    @Column(name = "region", nullable = true)
    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    @Basic
    @Column(name = "lat", nullable = true, precision = 0)
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "lon", nullable = true, precision = 0)
    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Basic
    @Column(name = "addressName", nullable = true, length = 2147483647)
    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Basic
    @Column(name = "source", nullable = true)
    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    @Basic
    @Column(name = "internetType", nullable = true)
    public Long getInternetType() {
        return internetType;
    }

    public void setInternetType(Long internetType) {
        this.internetType = internetType;
    }

    @Basic
    @Column(name = "rentPeriodType", nullable = true)
    public Long getRentPeriodType() {
        return rentPeriodType;
    }

    public void setRentPeriodType(Long rentPeriodType) {
        this.rentPeriodType = rentPeriodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommercialEstateAdsEntity that = (CommercialEstateAdsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (commercialEstateType != null ? !commercialEstateType.equals(that.commercialEstateType) : that.commercialEstateType != null)
            return false;
        if (roomCount != null ? !roomCount.equals(that.roomCount) : that.roomCount != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (priceUnit != null ? !priceUnit.equals(that.priceUnit) : that.priceUnit != null) return false;
        if (isPledged != null ? !isPledged.equals(that.isPledged) : that.isPledged != null) return false;
        if (buildingType != null ? !buildingType.equals(that.buildingType) : that.buildingType != null) return false;
        if (bussinessCenterName != null ? !bussinessCenterName.equals(that.bussinessCenterName) : that.bussinessCenterName != null)
            return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (hallArea != null ? !hallArea.equals(that.hallArea) : that.hallArea != null) return false;
        if (productionRoomArea != null ? !productionRoomArea.equals(that.productionRoomArea) : that.productionRoomArea != null)
            return false;
        if (warehouseSpaceArea != null ? !warehouseSpaceArea.equals(that.warehouseSpaceArea) : that.warehouseSpaceArea != null)
            return false;
        if (officeSpaceArea != null ? !officeSpaceArea.equals(that.officeSpaceArea) : that.officeSpaceArea != null)
            return false;
        if (storeysNumber != null ? !storeysNumber.equals(that.storeysNumber) : that.storeysNumber != null)
            return false;
        if (storey != null ? !storey.equals(that.storey) : that.storey != null) return false;
        if (landArea != null ? !landArea.equals(that.landArea) : that.landArea != null) return false;
        if (yearBuilt != null ? !yearBuilt.equals(that.yearBuilt) : that.yearBuilt != null) return false;
        if (condition != null ? !condition.equals(that.condition) : that.condition != null) return false;
        if (wallType != null ? !wallType.equals(that.wallType) : that.wallType != null) return false;
        if (ceilingHeight != null ? !ceilingHeight.equals(that.ceilingHeight) : that.ceilingHeight != null)
            return false;
        if (heatingType != null ? !heatingType.equals(that.heatingType) : that.heatingType != null) return false;
        if (waterSupplyType != null ? !waterSupplyType.equals(that.waterSupplyType) : that.waterSupplyType != null)
            return false;
        if (communications != null ? !communications.equals(that.communications) : that.communications != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (security != null ? !security.equals(that.security) : that.security != null) return false;
        if (otherProp != null ? !otherProp.equals(that.otherProp) : that.otherProp != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (pageId != null ? !pageId.equals(that.pageId) : that.pageId != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (isAnalog != null ? !isAnalog.equals(that.isAnalog) : that.isAnalog != null) return false;
        if (advertType != null ? !advertType.equals(that.advertType) : that.advertType != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (addressName != null ? !addressName.equals(that.addressName) : that.addressName != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (internetType != null ? !internetType.equals(that.internetType) : that.internetType != null) return false;
        if (rentPeriodType != null ? !rentPeriodType.equals(that.rentPeriodType) : that.rentPeriodType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (commercialEstateType != null ? commercialEstateType.hashCode() : 0);
        result = 31 * result + (roomCount != null ? roomCount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (priceUnit != null ? priceUnit.hashCode() : 0);
        result = 31 * result + (isPledged != null ? isPledged.hashCode() : 0);
        result = 31 * result + (buildingType != null ? buildingType.hashCode() : 0);
        result = 31 * result + (bussinessCenterName != null ? bussinessCenterName.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (hallArea != null ? hallArea.hashCode() : 0);
        result = 31 * result + (productionRoomArea != null ? productionRoomArea.hashCode() : 0);
        result = 31 * result + (warehouseSpaceArea != null ? warehouseSpaceArea.hashCode() : 0);
        result = 31 * result + (officeSpaceArea != null ? officeSpaceArea.hashCode() : 0);
        result = 31 * result + (storeysNumber != null ? storeysNumber.hashCode() : 0);
        result = 31 * result + (storey != null ? storey.hashCode() : 0);
        result = 31 * result + (landArea != null ? landArea.hashCode() : 0);
        result = 31 * result + (yearBuilt != null ? yearBuilt.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (wallType != null ? wallType.hashCode() : 0);
        result = 31 * result + (ceilingHeight != null ? ceilingHeight.hashCode() : 0);
        result = 31 * result + (heatingType != null ? heatingType.hashCode() : 0);
        result = 31 * result + (waterSupplyType != null ? waterSupplyType.hashCode() : 0);
        result = 31 * result + (communications != null ? communications.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (security != null ? security.hashCode() : 0);
        result = 31 * result + (otherProp != null ? otherProp.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (pageId != null ? pageId.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (isAnalog != null ? isAnalog.hashCode() : 0);
        result = 31 * result + (advertType != null ? advertType.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (internetType != null ? internetType.hashCode() : 0);
        result = 31 * result + (rentPeriodType != null ? rentPeriodType.hashCode() : 0);
        return result;
    }
}
