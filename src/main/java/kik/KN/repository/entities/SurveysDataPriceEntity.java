package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "SurveysDataPrice" )
public class SurveysDataPriceEntity {
    private Long id;
    private Long surveysDataId;
    private Long surveyType;
    private Integer roomNumber;
    private Double price;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "surveysDataId", nullable = true)
    public Long getSurveysDataId() {
        return surveysDataId;
    }

    public void setSurveysDataId(Long surveysDataId) {
        this.surveysDataId = surveysDataId;
    }

    @Basic
    @Column(name = "surveyType", nullable = true)
    public Long getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(Long surveyType) {
        this.surveyType = surveyType;
    }

    @Basic
    @Column(name = "roomNumber", nullable = true)
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SurveysDataPriceEntity that = (SurveysDataPriceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (surveysDataId != null ? !surveysDataId.equals(that.surveysDataId) : that.surveysDataId != null)
            return false;
        if (surveyType != null ? !surveyType.equals(that.surveyType) : that.surveyType != null) return false;
        if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (surveysDataId != null ? surveysDataId.hashCode() : 0);
        result = 31 * result + (surveyType != null ? surveyType.hashCode() : 0);
        result = 31 * result + (roomNumber != null ? roomNumber.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
