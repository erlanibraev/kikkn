package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "Region", schema = "dbo", catalog = "oris_kik")
public class RegionEntity {
    private Long id;
    private String codKato;
    private String name;
    private String fullName;
    private Long ord;
    private Double lat;
    private Double lon;
    private Long parent;
    private String krishaLink;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codKATO", nullable = true, length = 2147483647)
    public String getCodKato() {
        return codKato;
    }

    public void setCodKato(String codKato) {
        this.codKato = codKato;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 2147483647)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "fullName", nullable = true, length = 2147483647)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "ord", nullable = true)
    public Long getOrd() {
        return ord;
    }

    public void setOrd(Long ord) {
        this.ord = ord;
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
    @Column(name = "parent", nullable = true)
    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Basic
    @Column(name = "krishaLink", nullable = true, length = 2147483647)
    public String getKrishaLink() {
        return krishaLink;
    }

    public void setKrishaLink(String krishaLink) {
        this.krishaLink = krishaLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionEntity that = (RegionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (codKato != null ? !codKato.equals(that.codKato) : that.codKato != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (ord != null ? !ord.equals(that.ord) : that.ord != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (parent != null ? !parent.equals(that.parent) : that.parent != null) return false;
        if (krishaLink != null ? !krishaLink.equals(that.krishaLink) : that.krishaLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (codKato != null ? codKato.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (ord != null ? ord.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (krishaLink != null ? krishaLink.hashCode() : 0);
        return result;
    }
}
