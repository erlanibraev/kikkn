package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "LandAds", schema = "dbo", catalog = "oris_kik")
public class LandAdsEntity {
    private Long id;
    private Long source;
    private Long advertType;
    private Long ownershipType;
    private Boolean isPledged;
    private Double area;
    private Long divisibilityType;
    private String communications;
    private String placement;
    private String purpose;
    private Double price;
    private String phoneNumber;
    private String description;
    private String otherProp;
    private Date createDate;
    private Long pageId;
    private String link;
    private Long priceUnit;
    private Long relievoType;
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
    @Column(name = "source", nullable = true)
    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
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
    @Column(name = "ownershipType", nullable = true)
    public Long getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(Long ownershipType) {
        this.ownershipType = ownershipType;
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
    @Column(name = "area", nullable = true, precision = 0)
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Basic
    @Column(name = "divisibilityType", nullable = true)
    public Long getDivisibilityType() {
        return divisibilityType;
    }

    public void setDivisibilityType(Long divisibilityType) {
        this.divisibilityType = divisibilityType;
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
    @Column(name = "placement", nullable = true, length = 2147483647)
    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
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
    @Column(name = "price", nullable = false, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
    @Column(name = "description", nullable = true, length = 2147483647)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "priceUnit", nullable = true)
    public Long getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Long priceUnit) {
        this.priceUnit = priceUnit;
    }

    @Basic
    @Column(name = "relievoType", nullable = true)
    public Long getRelievoType() {
        return relievoType;
    }

    public void setRelievoType(Long relievoType) {
        this.relievoType = relievoType;
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

        LandAdsEntity that = (LandAdsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (advertType != null ? !advertType.equals(that.advertType) : that.advertType != null) return false;
        if (ownershipType != null ? !ownershipType.equals(that.ownershipType) : that.ownershipType != null)
            return false;
        if (isPledged != null ? !isPledged.equals(that.isPledged) : that.isPledged != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (divisibilityType != null ? !divisibilityType.equals(that.divisibilityType) : that.divisibilityType != null)
            return false;
        if (communications != null ? !communications.equals(that.communications) : that.communications != null)
            return false;
        if (placement != null ? !placement.equals(that.placement) : that.placement != null) return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (otherProp != null ? !otherProp.equals(that.otherProp) : that.otherProp != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (pageId != null ? !pageId.equals(that.pageId) : that.pageId != null) return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
        if (priceUnit != null ? !priceUnit.equals(that.priceUnit) : that.priceUnit != null) return false;
        if (relievoType != null ? !relievoType.equals(that.relievoType) : that.relievoType != null) return false;
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
        result = 31 * result + (isPledged != null ? isPledged.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (divisibilityType != null ? divisibilityType.hashCode() : 0);
        result = 31 * result + (communications != null ? communications.hashCode() : 0);
        result = 31 * result + (placement != null ? placement.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (otherProp != null ? otherProp.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (pageId != null ? pageId.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (priceUnit != null ? priceUnit.hashCode() : 0);
        result = 31 * result + (relievoType != null ? relievoType.hashCode() : 0);
        result = 31 * result + (isAnalog != null ? isAnalog.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        return result;
    }
}
