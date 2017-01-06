package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "SurveysData", schema = "dbo", catalog = "oris_kik")
public class SurveysDataEntity {
    private Long id;
    private Long surveysId;
    private Long regionId;
    private Long district;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surveysId", nullable = true)
    public Long getSurveysId() {
        return surveysId;
    }

    public void setSurveysId(Long surveysId) {
        this.surveysId = surveysId;
    }

    @Basic
    @Column(name = "regionId", nullable = true)
    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    @Basic
    @Column(name = "district", nullable = true)
    public Long getDistrict() {
        return district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveysDataEntity that = (SurveysDataEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (surveysId != null ? !surveysId.equals(that.surveysId) : that.surveysId != null) return false;
        if (regionId != null ? !regionId.equals(that.regionId) : that.regionId != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surveysId != null ? surveysId.hashCode() : 0);
        result = 31 * result + (regionId != null ? regionId.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        return result;
    }
}
