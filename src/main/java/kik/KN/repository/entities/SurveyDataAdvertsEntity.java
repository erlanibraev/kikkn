package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "SurveyDataAdverts", schema = "dbo", catalog = "oris_kik")
public class SurveyDataAdvertsEntity {
    private Long id;
    private Long surveysDataPriceId;
    private Long apartmentAdsId;
    private Long houseAdsId;
    private Long commercialEstateAdsId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surveysDataPriceId", nullable = true)
    public Long getSurveysDataPriceId() {
        return surveysDataPriceId;
    }

    public void setSurveysDataPriceId(Long surveysDataPriceId) {
        this.surveysDataPriceId = surveysDataPriceId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveyDataAdvertsEntity that = (SurveyDataAdvertsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (surveysDataPriceId != null ? !surveysDataPriceId.equals(that.surveysDataPriceId) : that.surveysDataPriceId != null)
            return false;
        if (apartmentAdsId != null ? !apartmentAdsId.equals(that.apartmentAdsId) : that.apartmentAdsId != null)
            return false;
        if (houseAdsId != null ? !houseAdsId.equals(that.houseAdsId) : that.houseAdsId != null) return false;
        if (commercialEstateAdsId != null ? !commercialEstateAdsId.equals(that.commercialEstateAdsId) : that.commercialEstateAdsId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surveysDataPriceId != null ? surveysDataPriceId.hashCode() : 0);
        result = 31 * result + (apartmentAdsId != null ? apartmentAdsId.hashCode() : 0);
        result = 31 * result + (houseAdsId != null ? houseAdsId.hashCode() : 0);
        result = 31 * result + (commercialEstateAdsId != null ? commercialEstateAdsId.hashCode() : 0);
        return result;
    }
}
