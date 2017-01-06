package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "ObjectsLevels", schema = "dbo", catalog = "oris_kik")
public class ObjectsLevelsEntity {
    private Long id;
    private Long objectId;
    private String constructionName;
    private String roomsName;
    private String levelName;
    private Double area;
    private Double livingArea;
    private Double priceCorrection;
    private Integer levelNumber;
    private String spacesDescription;
    private Double underloadCoeff;
    private Double noVatCosts;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "objectId", nullable = true)
    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "constructionName", nullable = true, length = 2147483647)
    public String getConstructionName() {
        return constructionName;
    }

    public void setConstructionName(String constructionName) {
        this.constructionName = constructionName;
    }

    @Basic
    @Column(name = "roomsName", nullable = true, length = 2147483647)
    public String getRoomsName() {
        return roomsName;
    }

    public void setRoomsName(String roomsName) {
        this.roomsName = roomsName;
    }

    @Basic
    @Column(name = "levelName", nullable = true, length = 2147483647)
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
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
    @Column(name = "priceCorrection", nullable = true, precision = 0)
    public Double getPriceCorrection() {
        return priceCorrection;
    }

    public void setPriceCorrection(Double priceCorrection) {
        this.priceCorrection = priceCorrection;
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
    @Column(name = "spacesDescription", nullable = true, length = 2147483647)
    public String getSpacesDescription() {
        return spacesDescription;
    }

    public void setSpacesDescription(String spacesDescription) {
        this.spacesDescription = spacesDescription;
    }

    @Basic
    @Column(name = "underloadCoeff", nullable = true, precision = 0)
    public Double getUnderloadCoeff() {
        return underloadCoeff;
    }

    public void setUnderloadCoeff(Double underloadCoeff) {
        this.underloadCoeff = underloadCoeff;
    }

    @Basic
    @Column(name = "noVATCosts", nullable = true, precision = 0)
    public Double getNoVatCosts() {
        return noVatCosts;
    }

    public void setNoVatCosts(Double noVatCosts) {
        this.noVatCosts = noVatCosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectsLevelsEntity that = (ObjectsLevelsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (constructionName != null ? !constructionName.equals(that.constructionName) : that.constructionName != null)
            return false;
        if (roomsName != null ? !roomsName.equals(that.roomsName) : that.roomsName != null) return false;
        if (levelName != null ? !levelName.equals(that.levelName) : that.levelName != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (livingArea != null ? !livingArea.equals(that.livingArea) : that.livingArea != null) return false;
        if (priceCorrection != null ? !priceCorrection.equals(that.priceCorrection) : that.priceCorrection != null)
            return false;
        if (levelNumber != null ? !levelNumber.equals(that.levelNumber) : that.levelNumber != null) return false;
        if (spacesDescription != null ? !spacesDescription.equals(that.spacesDescription) : that.spacesDescription != null)
            return false;
        if (underloadCoeff != null ? !underloadCoeff.equals(that.underloadCoeff) : that.underloadCoeff != null)
            return false;
        if (noVatCosts != null ? !noVatCosts.equals(that.noVatCosts) : that.noVatCosts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (constructionName != null ? constructionName.hashCode() : 0);
        result = 31 * result + (roomsName != null ? roomsName.hashCode() : 0);
        result = 31 * result + (levelName != null ? levelName.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (livingArea != null ? livingArea.hashCode() : 0);
        result = 31 * result + (priceCorrection != null ? priceCorrection.hashCode() : 0);
        result = 31 * result + (levelNumber != null ? levelNumber.hashCode() : 0);
        result = 31 * result + (spacesDescription != null ? spacesDescription.hashCode() : 0);
        result = 31 * result + (underloadCoeff != null ? underloadCoeff.hashCode() : 0);
        result = 31 * result + (noVatCosts != null ? noVatCosts.hashCode() : 0);
        return result;
    }
}
