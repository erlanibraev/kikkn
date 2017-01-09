package kik.KN.repository.entities;

import javax.persistence.*;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "AuthUser" )
public class AuthUserEntity {
    private Long id;
    private Long accessLevel;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String documentologUid;
    private String position;
    private String patronymic;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "accessLevel", nullable = true)
    public Long getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Long accessLevel) {
        this.accessLevel = accessLevel;
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
    @Column(name = "surname", nullable = true, length = 2147483647)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "login", nullable = true, length = 2147483647)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 2147483647)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "documentologUID", nullable = true, length = 100)
    public String getDocumentologUid() {
        return documentologUid;
    }

    public void setDocumentologUid(String documentologUid) {
        this.documentologUid = documentologUid;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 300)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "patronymic", nullable = true, length = 2147483647)
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthUserEntity that = (AuthUserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (accessLevel != null ? !accessLevel.equals(that.accessLevel) : that.accessLevel != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (documentologUid != null ? !documentologUid.equals(that.documentologUid) : that.documentologUid != null)
            return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (patronymic != null ? !patronymic.equals(that.patronymic) : that.patronymic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accessLevel != null ? accessLevel.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (documentologUid != null ? documentologUid.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        return result;
    }
}
