package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "Credits", schema = "dbo", catalog = "oris_kik")
public class CreditsEntity {
    private Long id;
    private Long creditId;
    private String creditAgreementNumber;
    private Date creditAgreementDate;
    private String borrower;
    private Long outerObjectId;
    private Boolean status;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "creditId", nullable = true)
    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    @Basic
    @Column(name = "creditAgreementNumber", nullable = true, length = 100)
    public String getCreditAgreementNumber() {
        return creditAgreementNumber;
    }

    public void setCreditAgreementNumber(String creditAgreementNumber) {
        this.creditAgreementNumber = creditAgreementNumber;
    }

    @Basic
    @Column(name = "creditAgreementDate", nullable = true)
    public Date getCreditAgreementDate() {
        return creditAgreementDate;
    }

    public void setCreditAgreementDate(Date creditAgreementDate) {
        this.creditAgreementDate = creditAgreementDate;
    }

    @Basic
    @Column(name = "borrower", nullable = true, length = 2147483647)
    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    @Basic
    @Column(name = "outerObjectId", nullable = true)
    public Long getOuterObjectId() {
        return outerObjectId;
    }

    public void setOuterObjectId(Long outerObjectId) {
        this.outerObjectId = outerObjectId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditsEntity that = (CreditsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (creditId != null ? !creditId.equals(that.creditId) : that.creditId != null) return false;
        if (creditAgreementNumber != null ? !creditAgreementNumber.equals(that.creditAgreementNumber) : that.creditAgreementNumber != null)
            return false;
        if (creditAgreementDate != null ? !creditAgreementDate.equals(that.creditAgreementDate) : that.creditAgreementDate != null)
            return false;
        if (borrower != null ? !borrower.equals(that.borrower) : that.borrower != null) return false;
        if (outerObjectId != null ? !outerObjectId.equals(that.outerObjectId) : that.outerObjectId != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (creditId != null ? creditId.hashCode() : 0);
        result = 31 * result + (creditAgreementNumber != null ? creditAgreementNumber.hashCode() : 0);
        result = 31 * result + (creditAgreementDate != null ? creditAgreementDate.hashCode() : 0);
        result = 31 * result + (borrower != null ? borrower.hashCode() : 0);
        result = 31 * result + (outerObjectId != null ? outerObjectId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
