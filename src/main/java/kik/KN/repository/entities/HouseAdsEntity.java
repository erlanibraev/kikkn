package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "HouseAds" )
public class HouseAdsEntity {
    private Long id;
    private Long source;
    private Long advertType;
    private Long ownershipType;
    private Long wallType;
    private Long houseType;
    private Integer yearBuilt;
    private Integer levelNumber;
    private Double area;
    private Double livingArea;
    private Double kitchenArea;
    private Double landAreaHundredthHa;
    private Long condition;
    private Long telephoneFacility;
    private Long internetType;
    private Long bathroomType;
    private Long canalizationType;
    private Long waterSupplyType;
    private Long electricityType;
    private Long heatingType;
    private Long gasSupplyType;
    private Double ceilingHeight;
    private Integer roomCount;
    private Double price;
    private Boolean isPledged;
    private String description;
    private String security;
    private String otherProp;
    private Date createDate;
    private Long pageId;
    private String link;
    private String phoneNumber;
    private Long priceUnit;
    private Boolean isAnalog;
    private Long region;
    private Double lat;
    private Double lon;
    private String addressName;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "source", nullable = false)
    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    @Basic
    @Column(name = "advertType", nullable = false)
    public Long getAdvertType() {
        return advertType;
    }

    public void setAdvertType(Long advertType) {
        this.advertType = advertType;
    }

    @Basic
    @Column(name = "ownershipType", nullable = true)
    public Long getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(Long ownershipType) {
        this.ownershipType = ownershipType;
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
    @Column(name = "houseType", nullable = true)
    public Long getHouseType() {
        return houseType;
    }

    public void setHouseType(Long houseType) {
        this.houseType = houseType;
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
    @Column(name = "levelNumber", nullable = true)
    public Integer getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(Integer levelNumber) {
        this.levelNumber = levelNumber;
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
    @Column(name = "livingArea", nullable = true, precision = 0)
    public Double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(Double livingArea) {
        this.livingArea = livingArea;
    }

    @Basic
    @Column(name = "kitchenArea", nullable = true, precision = 0)
    public Double getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Double kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    @Basic
    @Column(name = "landAreaHundredthHa", nullable = true, precision = 0)
    public Double getLandAreaHundredthHa() {
        return landAreaHundredthHa;
    }

    public void setLandAreaHundredthHa(Double landAreaHundredthHa) {
        this.landAreaHundredthHa = landAreaHundredthHa;
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
    @Column(name = "telephoneFacility", nullable = true)
    public Long getTelephoneFacility() {
        return telephoneFacility;
    }

    public void setTelephoneFacility(Long telephoneFacility) {
        this.telephoneFacility = telephoneFacility;
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
    @Column(name = "bathroomType", nullable = true)
    public Long getBathroomType() {
        return bathroomType;
    }

    public void setBathroomType(Long bathroomType) {
        this.bathroomType = bathroomType;
    }

    @Basic
    @Column(name = "canalizationType", nullable = true)
    public Long getCanalizationType() {
        return canalizationType;
    }

    public void setCanalizationType(Long canalizationType) {
        this.canalizationType = canalizationType;
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
    @Column(name = "electricityType", nullable = true)
    public Long getElectricityType() {
        return electricityType;
    }

    public void setElectricityType(Long electricityType) {
        this.electricityType = electricityType;
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
    @Column(name = "gasSupplyType", nullable = true)
    public Long getGasSupplyType() {
        return gasSupplyType;
    }

    public void setGasSupplyType(Long gasSupplyType) {
        this.gasSupplyType = gasSupplyType;
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
    @Column(name = "roomCount", nullable = true)
    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
    @Column(name = "priceUnit", nullable = true)
    public Long getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Long priceUnit) {
        this.priceUnit = priceUnit;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseAdsEntity that = (HouseAdsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (advertType != null ? !advertType.equals(that.advertType) : that.advertType != null) return false;
        if (ownershipType != null ? !ownershipType.equals(that.ownershipType) : that.ownershipType != null)
            return false;
        if (wallType != null ? !wallType.equals(that.wallType) : that.wallType != null) return false;
        if (houseType != null ? !houseType.equals(that.houseType) : that.houseType != null) return false;
        if (yearBuilt != null ? !yearBuilt.equals(that.yearBuilt) : that.yearBuilt != null) return false;
        if (levelNumber != null ? !levelNumber.equals(that.levelNumber) : that.levelNumber != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (livingArea != null ? !livingArea.equals(that.livingArea) : that.livingArea != null) return false;
        if (kitchenArea != null ? !kitchenArea.equals(that.kitchenArea) : that.kitchenArea != null) return false;
        if (landAreaHundredthHa != null ? !landAreaHundredthHa.equals(that.landAreaHundredthHa) : that.landAreaHundredthHa != null)
            return false;
        if (condition != null ? !condition.equals(that.condition) : that.condition != null) return false;
        if (telephoneFacility != null ? !telephoneFacility.equals(that.telephoneFacility) : that.telephoneFacility != null)
            return false;
        if (internetType != null ? !internetType.equals(that.internetType) : that.internetType != null) return false;
        if (bathroomType != null ? !bathroomType.equals(that.bathroomType) : that.bathroomType != null) return false;
        if (canalizationType != null ? !canalizationType.equals(that.canalizationType) : that.canalizationType != null)
            return false;
        if (waterSupplyType != null ? !waterSupplyType.equals(that.waterSupplyType) : that.waterSupplyType != null)
            return false;
        if (electricityType != null ? !electricityType.equals(that.electricityType) : that.electricityType != null)
            return false;
        if (heatingType != null ? !heatingType.equals(that.heatingType) : that.heatingType != null) return false;
        if (gasSupplyType != null ? !gasSupplyType.equals(that.gasSupplyType) : that.gasSupplyType != null)
            return false;
        if (ceilingHeight != null ? !ceilingHeight.equals(that.ceilingHeight) : that.ceilingHeight != null)
            return false;
        if (roomCount != null ? !roomCount.equals(that.roomCount) : that.roomCount != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (isPledged != null ? !isPledged.equals(that.isPledged) : that.isPledged != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (security != null ? !security.equals(that.security) : that.security != null) return false;
        if (otherProp != null ? !otherProp.equals(that.otherProp) : that.otherProp != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (pageId != null ? !pageId.equals(that.pageId) : that.pageId != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (priceUnit != null ? !priceUnit.equals(that.priceUnit) : that.priceUnit != null) return false;
        if (isAnalog != null ? !isAnalog.equals(that.isAnalog) : that.isAnalog != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (addressName != null ? !addressName.equals(that.addressName) : that.addressName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (advertType != null ? advertType.hashCode() : 0);
        result = 31 * result + (ownershipType != null ? ownershipType.hashCode() : 0);
        result = 31 * result + (wallType != null ? wallType.hashCode() : 0);
        result = 31 * result + (houseType != null ? houseType.hashCode() : 0);
        result = 31 * result + (yearBuilt != null ? yearBuilt.hashCode() : 0);
        result = 31 * result + (levelNumber != null ? levelNumber.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (livingArea != null ? livingArea.hashCode() : 0);
        result = 31 * result + (kitchenArea != null ? kitchenArea.hashCode() : 0);
        result = 31 * result + (landAreaHundredthHa != null ? landAreaHundredthHa.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (telephoneFacility != null ? telephoneFacility.hashCode() : 0);
        result = 31 * result + (internetType != null ? internetType.hashCode() : 0);
        result = 31 * result + (bathroomType != null ? bathroomType.hashCode() : 0);
        result = 31 * result + (canalizationType != null ? canalizationType.hashCode() : 0);
        result = 31 * result + (waterSupplyType != null ? waterSupplyType.hashCode() : 0);
        result = 31 * result + (electricityType != null ? electricityType.hashCode() : 0);
        result = 31 * result + (heatingType != null ? heatingType.hashCode() : 0);
        result = 31 * result + (gasSupplyType != null ? gasSupplyType.hashCode() : 0);
        result = 31 * result + (ceilingHeight != null ? ceilingHeight.hashCode() : 0);
        result = 31 * result + (roomCount != null ? roomCount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (isPledged != null ? isPledged.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (security != null ? security.hashCode() : 0);
        result = 31 * result + (otherProp != null ? otherProp.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (pageId != null ? pageId.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (priceUnit != null ? priceUnit.hashCode() : 0);
        result = 31 * result + (isAnalog != null ? isAnalog.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        return result;
    }
}
