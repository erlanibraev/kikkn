package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "EstateTypeMapping", schema = "dbo", catalog = "oris_kik")
public class EstateTypeMappingEntity {
    private Long id;
    private Long estateType;
    private Long outerEstateType;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "estateType", nullable = true)
    public Long getEstateType() {
        return estateType;
    }

    public void setEstateType(Long estateType) {
        this.estateType = estateType;
    }

    @Basic
    @Column(name = "outerEstateType", nullable = true)
    public Long getOuterEstateType() {
        return outerEstateType;
    }

    public void setOuterEstateType(Long outerEstateType) {
        this.outerEstateType = outerEstateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstateTypeMappingEntity that = (EstateTypeMappingEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (estateType != null ? !estateType.equals(that.estateType) : that.estateType != null) return false;
        if (outerEstateType != null ? !outerEstateType.equals(that.outerEstateType) : that.outerEstateType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (estateType != null ? estateType.hashCode() : 0);
        result = 31 * result + (outerEstateType != null ? outerEstateType.hashCode() : 0);
        return result;
    }
}
