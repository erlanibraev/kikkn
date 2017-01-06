package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "Images", schema = "dbo", catalog = "oris_kik")
public class ImagesEntity {
    private Long id;
    private Long objectsId;
    private String path;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "objectsId", nullable = true)
    public Long getObjectsId() {
        return objectsId;
    }

    public void setObjectsId(Long objectsId) {
        this.objectsId = objectsId;
    }

    @Basic
    @Column(name = "path", nullable = true, length = 2147483647)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImagesEntity that = (ImagesEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (objectsId != null ? !objectsId.equals(that.objectsId) : that.objectsId != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (objectsId != null ? objectsId.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
