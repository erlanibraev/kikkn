package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "Conclusions" )
public class ConclusionsEntity {
    private Long id;
    private String code;
    private Date date;
    private String purpose;
    private String reportNumber;
    private Date reportDate;
    private String estimator;
    private String estimationClient;
    private Date surveyDate;
    private Date uzoSurveyDate;
    private String actualUsage;
    private String possibleCommercialUsage;
    private String note;
    private String docsList;
    private Boolean meetsDesignRequirements;
    private Boolean meetsDescriptionPartRequirements;
    private Boolean meetsCalculationPartRequirements;
    private Boolean meetsConclusionPartRequirements;
    private Boolean meetsPhotoMaterialRequirements;
    private Boolean hasMarketMethod;
    private Boolean hasIncomeMethod;
    private Boolean hasExpenseMethod;
    private Boolean isMarketMethodUseValid;
    private Boolean isIncomeMethodUseValid;
    private Boolean isExpenseMethodUseValid;
    private Boolean isMarketMethodCalculationValid;
    private Boolean isIncomeMethodCalculationValid;
    private Boolean isExpenseMethodCalculationValid;
    private Boolean hasTraditionalMethods;
    private Boolean isCalculationValid;
    private Double marketMethodValue;
    private Double incomeMethodValue;
    private Double expenseMethodValue;
    private Double reportMarketPrice;
    private Double reportMarketPricePerSquareMeter;
    private Double uzoMarketPrice;
    private Double uzoMarketPricePerSquareMeter;
    private Double difference;
    private Boolean isEstimationAdequate;
    private String designRequirementsRemarks;
    private String descriptionPartRequirementsRemarks;
    private String calculationPartRequirementsRemarks;
    private String conclusionPartRequirementsRemarks;
    private String photoMaterialRequirementsRemarks;
    private Double acceptedMarketPrice;
    private Long objectsId;
    private Long doerId;
    private Long approverId;
    private Double traditionalMethodValue;
    private String regionName;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    @Column(name = "reportNumber", nullable = true, length = 50)
    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    @Basic
    @Column(name = "reportDate", nullable = true)
    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    @Basic
    @Column(name = "estimator", nullable = true, length = 2147483647)
    public String getEstimator() {
        return estimator;
    }

    public void setEstimator(String estimator) {
        this.estimator = estimator;
    }

    @Basic
    @Column(name = "estimationClient", nullable = true, length = 2147483647)
    public String getEstimationClient() {
        return estimationClient;
    }

    public void setEstimationClient(String estimationClient) {
        this.estimationClient = estimationClient;
    }

    @Basic
    @Column(name = "surveyDate", nullable = true)
    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    @Basic
    @Column(name = "uzoSurveyDate", nullable = true)
    public Date getUzoSurveyDate() {
        return uzoSurveyDate;
    }

    public void setUzoSurveyDate(Date uzoSurveyDate) {
        this.uzoSurveyDate = uzoSurveyDate;
    }

    @Basic
    @Column(name = "actualUsage", nullable = true, length = 2147483647)
    public String getActualUsage() {
        return actualUsage;
    }

    public void setActualUsage(String actualUsage) {
        this.actualUsage = actualUsage;
    }

    @Basic
    @Column(name = "possibleCommercialUsage", nullable = true, length = 2147483647)
    public String getPossibleCommercialUsage() {
        return possibleCommercialUsage;
    }

    public void setPossibleCommercialUsage(String possibleCommercialUsage) {
        this.possibleCommercialUsage = possibleCommercialUsage;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 2147483647)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "docsList", nullable = true, length = 2147483647)
    public String getDocsList() {
        return docsList;
    }

    public void setDocsList(String docsList) {
        this.docsList = docsList;
    }

    @Basic
    @Column(name = "meetsDesignRequirements", nullable = true)
    public Boolean getMeetsDesignRequirements() {
        return meetsDesignRequirements;
    }

    public void setMeetsDesignRequirements(Boolean meetsDesignRequirements) {
        this.meetsDesignRequirements = meetsDesignRequirements;
    }

    @Basic
    @Column(name = "meetsDescriptionPartRequirements", nullable = true)
    public Boolean getMeetsDescriptionPartRequirements() {
        return meetsDescriptionPartRequirements;
    }

    public void setMeetsDescriptionPartRequirements(Boolean meetsDescriptionPartRequirements) {
        this.meetsDescriptionPartRequirements = meetsDescriptionPartRequirements;
    }

    @Basic
    @Column(name = "meetsCalculationPartRequirements", nullable = true)
    public Boolean getMeetsCalculationPartRequirements() {
        return meetsCalculationPartRequirements;
    }

    public void setMeetsCalculationPartRequirements(Boolean meetsCalculationPartRequirements) {
        this.meetsCalculationPartRequirements = meetsCalculationPartRequirements;
    }

    @Basic
    @Column(name = "meetsConclusionPartRequirements", nullable = true)
    public Boolean getMeetsConclusionPartRequirements() {
        return meetsConclusionPartRequirements;
    }

    public void setMeetsConclusionPartRequirements(Boolean meetsConclusionPartRequirements) {
        this.meetsConclusionPartRequirements = meetsConclusionPartRequirements;
    }

    @Basic
    @Column(name = "meetsPhotoMaterialRequirements", nullable = true)
    public Boolean getMeetsPhotoMaterialRequirements() {
        return meetsPhotoMaterialRequirements;
    }

    public void setMeetsPhotoMaterialRequirements(Boolean meetsPhotoMaterialRequirements) {
        this.meetsPhotoMaterialRequirements = meetsPhotoMaterialRequirements;
    }

    @Basic
    @Column(name = "hasMarketMethod", nullable = true)
    public Boolean getHasMarketMethod() {
        return hasMarketMethod;
    }

    public void setHasMarketMethod(Boolean hasMarketMethod) {
        this.hasMarketMethod = hasMarketMethod;
    }

    @Basic
    @Column(name = "hasIncomeMethod", nullable = true)
    public Boolean getHasIncomeMethod() {
        return hasIncomeMethod;
    }

    public void setHasIncomeMethod(Boolean hasIncomeMethod) {
        this.hasIncomeMethod = hasIncomeMethod;
    }

    @Basic
    @Column(name = "hasExpenseMethod", nullable = true)
    public Boolean getHasExpenseMethod() {
        return hasExpenseMethod;
    }

    public void setHasExpenseMethod(Boolean hasExpenseMethod) {
        this.hasExpenseMethod = hasExpenseMethod;
    }

    @Basic
    @Column(name = "isMarketMethodUseValid", nullable = true)
    public Boolean getMarketMethodUseValid() {
        return isMarketMethodUseValid;
    }

    public void setMarketMethodUseValid(Boolean marketMethodUseValid) {
        isMarketMethodUseValid = marketMethodUseValid;
    }

    @Basic
    @Column(name = "isIncomeMethodUseValid", nullable = true)
    public Boolean getIncomeMethodUseValid() {
        return isIncomeMethodUseValid;
    }

    public void setIncomeMethodUseValid(Boolean incomeMethodUseValid) {
        isIncomeMethodUseValid = incomeMethodUseValid;
    }

    @Basic
    @Column(name = "isExpenseMethodUseValid", nullable = true)
    public Boolean getExpenseMethodUseValid() {
        return isExpenseMethodUseValid;
    }

    public void setExpenseMethodUseValid(Boolean expenseMethodUseValid) {
        isExpenseMethodUseValid = expenseMethodUseValid;
    }

    @Basic
    @Column(name = "isMarketMethodCalculationValid", nullable = true)
    public Boolean getMarketMethodCalculationValid() {
        return isMarketMethodCalculationValid;
    }

    public void setMarketMethodCalculationValid(Boolean marketMethodCalculationValid) {
        isMarketMethodCalculationValid = marketMethodCalculationValid;
    }

    @Basic
    @Column(name = "isIncomeMethodCalculationValid", nullable = true)
    public Boolean getIncomeMethodCalculationValid() {
        return isIncomeMethodCalculationValid;
    }

    public void setIncomeMethodCalculationValid(Boolean incomeMethodCalculationValid) {
        isIncomeMethodCalculationValid = incomeMethodCalculationValid;
    }

    @Basic
    @Column(name = "isExpenseMethodCalculationValid", nullable = true)
    public Boolean getExpenseMethodCalculationValid() {
        return isExpenseMethodCalculationValid;
    }

    public void setExpenseMethodCalculationValid(Boolean expenseMethodCalculationValid) {
        isExpenseMethodCalculationValid = expenseMethodCalculationValid;
    }

    @Basic
    @Column(name = "hasTraditionalMethods", nullable = true)
    public Boolean getHasTraditionalMethods() {
        return hasTraditionalMethods;
    }

    public void setHasTraditionalMethods(Boolean hasTraditionalMethods) {
        this.hasTraditionalMethods = hasTraditionalMethods;
    }

    @Basic
    @Column(name = "isCalculationValid", nullable = true)
    public Boolean getCalculationValid() {
        return isCalculationValid;
    }

    public void setCalculationValid(Boolean calculationValid) {
        isCalculationValid = calculationValid;
    }

    @Basic
    @Column(name = "marketMethodValue", nullable = true, precision = 0)
    public Double getMarketMethodValue() {
        return marketMethodValue;
    }

    public void setMarketMethodValue(Double marketMethodValue) {
        this.marketMethodValue = marketMethodValue;
    }

    @Basic
    @Column(name = "incomeMethodValue", nullable = true, precision = 0)
    public Double getIncomeMethodValue() {
        return incomeMethodValue;
    }

    public void setIncomeMethodValue(Double incomeMethodValue) {
        this.incomeMethodValue = incomeMethodValue;
    }

    @Basic
    @Column(name = "expenseMethodValue", nullable = true, precision = 0)
    public Double getExpenseMethodValue() {
        return expenseMethodValue;
    }

    public void setExpenseMethodValue(Double expenseMethodValue) {
        this.expenseMethodValue = expenseMethodValue;
    }

    @Basic
    @Column(name = "reportMarketPrice", nullable = true, precision = 0)
    public Double getReportMarketPrice() {
        return reportMarketPrice;
    }

    public void setReportMarketPrice(Double reportMarketPrice) {
        this.reportMarketPrice = reportMarketPrice;
    }

    @Basic
    @Column(name = "reportMarketPricePerSquareMeter", nullable = true, precision = 0)
    public Double getReportMarketPricePerSquareMeter() {
        return reportMarketPricePerSquareMeter;
    }

    public void setReportMarketPricePerSquareMeter(Double reportMarketPricePerSquareMeter) {
        this.reportMarketPricePerSquareMeter = reportMarketPricePerSquareMeter;
    }

    @Basic
    @Column(name = "uzoMarketPrice", nullable = true, precision = 0)
    public Double getUzoMarketPrice() {
        return uzoMarketPrice;
    }

    public void setUzoMarketPrice(Double uzoMarketPrice) {
        this.uzoMarketPrice = uzoMarketPrice;
    }

    @Basic
    @Column(name = "uzoMarketPricePerSquareMeter", nullable = true, precision = 0)
    public Double getUzoMarketPricePerSquareMeter() {
        return uzoMarketPricePerSquareMeter;
    }

    public void setUzoMarketPricePerSquareMeter(Double uzoMarketPricePerSquareMeter) {
        this.uzoMarketPricePerSquareMeter = uzoMarketPricePerSquareMeter;
    }

    @Basic
    @Column(name = "difference", nullable = true, precision = 0)
    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }

    @Basic
    @Column(name = "isEstimationAdequate", nullable = true)
    public Boolean getEstimationAdequate() {
        return isEstimationAdequate;
    }

    public void setEstimationAdequate(Boolean estimationAdequate) {
        isEstimationAdequate = estimationAdequate;
    }

    @Basic
    @Column(name = "designRequirementsRemarks", nullable = true, length = 2147483647)
    public String getDesignRequirementsRemarks() {
        return designRequirementsRemarks;
    }

    public void setDesignRequirementsRemarks(String designRequirementsRemarks) {
        this.designRequirementsRemarks = designRequirementsRemarks;
    }

    @Basic
    @Column(name = "descriptionPartRequirementsRemarks", nullable = true, length = 2147483647)
    public String getDescriptionPartRequirementsRemarks() {
        return descriptionPartRequirementsRemarks;
    }

    public void setDescriptionPartRequirementsRemarks(String descriptionPartRequirementsRemarks) {
        this.descriptionPartRequirementsRemarks = descriptionPartRequirementsRemarks;
    }

    @Basic
    @Column(name = "calculationPartRequirementsRemarks", nullable = true, length = 2147483647)
    public String getCalculationPartRequirementsRemarks() {
        return calculationPartRequirementsRemarks;
    }

    public void setCalculationPartRequirementsRemarks(String calculationPartRequirementsRemarks) {
        this.calculationPartRequirementsRemarks = calculationPartRequirementsRemarks;
    }

    @Basic
    @Column(name = "conclusionPartRequirementsRemarks", nullable = true, length = 2147483647)
    public String getConclusionPartRequirementsRemarks() {
        return conclusionPartRequirementsRemarks;
    }

    public void setConclusionPartRequirementsRemarks(String conclusionPartRequirementsRemarks) {
        this.conclusionPartRequirementsRemarks = conclusionPartRequirementsRemarks;
    }

    @Basic
    @Column(name = "photoMaterialRequirementsRemarks", nullable = true, length = 2147483647)
    public String getPhotoMaterialRequirementsRemarks() {
        return photoMaterialRequirementsRemarks;
    }

    public void setPhotoMaterialRequirementsRemarks(String photoMaterialRequirementsRemarks) {
        this.photoMaterialRequirementsRemarks = photoMaterialRequirementsRemarks;
    }

    @Basic
    @Column(name = "acceptedMarketPrice", nullable = true, precision = 0)
    public Double getAcceptedMarketPrice() {
        return acceptedMarketPrice;
    }

    public void setAcceptedMarketPrice(Double acceptedMarketPrice) {
        this.acceptedMarketPrice = acceptedMarketPrice;
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
    @Column(name = "doerId", nullable = true)
    public Long getDoerId() {
        return doerId;
    }

    public void setDoerId(Long doerId) {
        this.doerId = doerId;
    }

    @Basic
    @Column(name = "approverId", nullable = true)
    public Long getApproverId() {
        return approverId;
    }

    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }

    @Basic
    @Column(name = "traditionalMethodValue", nullable = true, precision = 0)
    public Double getTraditionalMethodValue() {
        return traditionalMethodValue;
    }

    public void setTraditionalMethodValue(Double traditionalMethodValue) {
        this.traditionalMethodValue = traditionalMethodValue;
    }

    @Basic
    @Column(name = "regionName", nullable = true, length = 2147483647)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConclusionsEntity that = (ConclusionsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;
        if (reportNumber != null ? !reportNumber.equals(that.reportNumber) : that.reportNumber != null) return false;
        if (reportDate != null ? !reportDate.equals(that.reportDate) : that.reportDate != null) return false;
        if (estimator != null ? !estimator.equals(that.estimator) : that.estimator != null) return false;
        if (estimationClient != null ? !estimationClient.equals(that.estimationClient) : that.estimationClient != null)
            return false;
        if (surveyDate != null ? !surveyDate.equals(that.surveyDate) : that.surveyDate != null) return false;
        if (uzoSurveyDate != null ? !uzoSurveyDate.equals(that.uzoSurveyDate) : that.uzoSurveyDate != null)
            return false;
        if (actualUsage != null ? !actualUsage.equals(that.actualUsage) : that.actualUsage != null) return false;
        if (possibleCommercialUsage != null ? !possibleCommercialUsage.equals(that.possibleCommercialUsage) : that.possibleCommercialUsage != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (docsList != null ? !docsList.equals(that.docsList) : that.docsList != null) return false;
        if (meetsDesignRequirements != null ? !meetsDesignRequirements.equals(that.meetsDesignRequirements) : that.meetsDesignRequirements != null)
            return false;
        if (meetsDescriptionPartRequirements != null ? !meetsDescriptionPartRequirements.equals(that.meetsDescriptionPartRequirements) : that.meetsDescriptionPartRequirements != null)
            return false;
        if (meetsCalculationPartRequirements != null ? !meetsCalculationPartRequirements.equals(that.meetsCalculationPartRequirements) : that.meetsCalculationPartRequirements != null)
            return false;
        if (meetsConclusionPartRequirements != null ? !meetsConclusionPartRequirements.equals(that.meetsConclusionPartRequirements) : that.meetsConclusionPartRequirements != null)
            return false;
        if (meetsPhotoMaterialRequirements != null ? !meetsPhotoMaterialRequirements.equals(that.meetsPhotoMaterialRequirements) : that.meetsPhotoMaterialRequirements != null)
            return false;
        if (hasMarketMethod != null ? !hasMarketMethod.equals(that.hasMarketMethod) : that.hasMarketMethod != null)
            return false;
        if (hasIncomeMethod != null ? !hasIncomeMethod.equals(that.hasIncomeMethod) : that.hasIncomeMethod != null)
            return false;
        if (hasExpenseMethod != null ? !hasExpenseMethod.equals(that.hasExpenseMethod) : that.hasExpenseMethod != null)
            return false;
        if (isMarketMethodUseValid != null ? !isMarketMethodUseValid.equals(that.isMarketMethodUseValid) : that.isMarketMethodUseValid != null)
            return false;
        if (isIncomeMethodUseValid != null ? !isIncomeMethodUseValid.equals(that.isIncomeMethodUseValid) : that.isIncomeMethodUseValid != null)
            return false;
        if (isExpenseMethodUseValid != null ? !isExpenseMethodUseValid.equals(that.isExpenseMethodUseValid) : that.isExpenseMethodUseValid != null)
            return false;
        if (isMarketMethodCalculationValid != null ? !isMarketMethodCalculationValid.equals(that.isMarketMethodCalculationValid) : that.isMarketMethodCalculationValid != null)
            return false;
        if (isIncomeMethodCalculationValid != null ? !isIncomeMethodCalculationValid.equals(that.isIncomeMethodCalculationValid) : that.isIncomeMethodCalculationValid != null)
            return false;
        if (isExpenseMethodCalculationValid != null ? !isExpenseMethodCalculationValid.equals(that.isExpenseMethodCalculationValid) : that.isExpenseMethodCalculationValid != null)
            return false;
        if (hasTraditionalMethods != null ? !hasTraditionalMethods.equals(that.hasTraditionalMethods) : that.hasTraditionalMethods != null)
            return false;
        if (isCalculationValid != null ? !isCalculationValid.equals(that.isCalculationValid) : that.isCalculationValid != null)
            return false;
        if (marketMethodValue != null ? !marketMethodValue.equals(that.marketMethodValue) : that.marketMethodValue != null)
            return false;
        if (incomeMethodValue != null ? !incomeMethodValue.equals(that.incomeMethodValue) : that.incomeMethodValue != null)
            return false;
        if (expenseMethodValue != null ? !expenseMethodValue.equals(that.expenseMethodValue) : that.expenseMethodValue != null)
            return false;
        if (reportMarketPrice != null ? !reportMarketPrice.equals(that.reportMarketPrice) : that.reportMarketPrice != null)
            return false;
        if (reportMarketPricePerSquareMeter != null ? !reportMarketPricePerSquareMeter.equals(that.reportMarketPricePerSquareMeter) : that.reportMarketPricePerSquareMeter != null)
            return false;
        if (uzoMarketPrice != null ? !uzoMarketPrice.equals(that.uzoMarketPrice) : that.uzoMarketPrice != null)
            return false;
        if (uzoMarketPricePerSquareMeter != null ? !uzoMarketPricePerSquareMeter.equals(that.uzoMarketPricePerSquareMeter) : that.uzoMarketPricePerSquareMeter != null)
            return false;
        if (difference != null ? !difference.equals(that.difference) : that.difference != null) return false;
        if (isEstimationAdequate != null ? !isEstimationAdequate.equals(that.isEstimationAdequate) : that.isEstimationAdequate != null)
            return false;
        if (designRequirementsRemarks != null ? !designRequirementsRemarks.equals(that.designRequirementsRemarks) : that.designRequirementsRemarks != null)
            return false;
        if (descriptionPartRequirementsRemarks != null ? !descriptionPartRequirementsRemarks.equals(that.descriptionPartRequirementsRemarks) : that.descriptionPartRequirementsRemarks != null)
            return false;
        if (calculationPartRequirementsRemarks != null ? !calculationPartRequirementsRemarks.equals(that.calculationPartRequirementsRemarks) : that.calculationPartRequirementsRemarks != null)
            return false;
        if (conclusionPartRequirementsRemarks != null ? !conclusionPartRequirementsRemarks.equals(that.conclusionPartRequirementsRemarks) : that.conclusionPartRequirementsRemarks != null)
            return false;
        if (photoMaterialRequirementsRemarks != null ? !photoMaterialRequirementsRemarks.equals(that.photoMaterialRequirementsRemarks) : that.photoMaterialRequirementsRemarks != null)
            return false;
        if (acceptedMarketPrice != null ? !acceptedMarketPrice.equals(that.acceptedMarketPrice) : that.acceptedMarketPrice != null)
            return false;
        if (objectsId != null ? !objectsId.equals(that.objectsId) : that.objectsId != null) return false;
        if (doerId != null ? !doerId.equals(that.doerId) : that.doerId != null) return false;
        if (approverId != null ? !approverId.equals(that.approverId) : that.approverId != null) return false;
        if (traditionalMethodValue != null ? !traditionalMethodValue.equals(that.traditionalMethodValue) : that.traditionalMethodValue != null)
            return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (reportNumber != null ? reportNumber.hashCode() : 0);
        result = 31 * result + (reportDate != null ? reportDate.hashCode() : 0);
        result = 31 * result + (estimator != null ? estimator.hashCode() : 0);
        result = 31 * result + (estimationClient != null ? estimationClient.hashCode() : 0);
        result = 31 * result + (surveyDate != null ? surveyDate.hashCode() : 0);
        result = 31 * result + (uzoSurveyDate != null ? uzoSurveyDate.hashCode() : 0);
        result = 31 * result + (actualUsage != null ? actualUsage.hashCode() : 0);
        result = 31 * result + (possibleCommercialUsage != null ? possibleCommercialUsage.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (docsList != null ? docsList.hashCode() : 0);
        result = 31 * result + (meetsDesignRequirements != null ? meetsDesignRequirements.hashCode() : 0);
        result = 31 * result + (meetsDescriptionPartRequirements != null ? meetsDescriptionPartRequirements.hashCode() : 0);
        result = 31 * result + (meetsCalculationPartRequirements != null ? meetsCalculationPartRequirements.hashCode() : 0);
        result = 31 * result + (meetsConclusionPartRequirements != null ? meetsConclusionPartRequirements.hashCode() : 0);
        result = 31 * result + (meetsPhotoMaterialRequirements != null ? meetsPhotoMaterialRequirements.hashCode() : 0);
        result = 31 * result + (hasMarketMethod != null ? hasMarketMethod.hashCode() : 0);
        result = 31 * result + (hasIncomeMethod != null ? hasIncomeMethod.hashCode() : 0);
        result = 31 * result + (hasExpenseMethod != null ? hasExpenseMethod.hashCode() : 0);
        result = 31 * result + (isMarketMethodUseValid != null ? isMarketMethodUseValid.hashCode() : 0);
        result = 31 * result + (isIncomeMethodUseValid != null ? isIncomeMethodUseValid.hashCode() : 0);
        result = 31 * result + (isExpenseMethodUseValid != null ? isExpenseMethodUseValid.hashCode() : 0);
        result = 31 * result + (isMarketMethodCalculationValid != null ? isMarketMethodCalculationValid.hashCode() : 0);
        result = 31 * result + (isIncomeMethodCalculationValid != null ? isIncomeMethodCalculationValid.hashCode() : 0);
        result = 31 * result + (isExpenseMethodCalculationValid != null ? isExpenseMethodCalculationValid.hashCode() : 0);
        result = 31 * result + (hasTraditionalMethods != null ? hasTraditionalMethods.hashCode() : 0);
        result = 31 * result + (isCalculationValid != null ? isCalculationValid.hashCode() : 0);
        result = 31 * result + (marketMethodValue != null ? marketMethodValue.hashCode() : 0);
        result = 31 * result + (incomeMethodValue != null ? incomeMethodValue.hashCode() : 0);
        result = 31 * result + (expenseMethodValue != null ? expenseMethodValue.hashCode() : 0);
        result = 31 * result + (reportMarketPrice != null ? reportMarketPrice.hashCode() : 0);
        result = 31 * result + (reportMarketPricePerSquareMeter != null ? reportMarketPricePerSquareMeter.hashCode() : 0);
        result = 31 * result + (uzoMarketPrice != null ? uzoMarketPrice.hashCode() : 0);
        result = 31 * result + (uzoMarketPricePerSquareMeter != null ? uzoMarketPricePerSquareMeter.hashCode() : 0);
        result = 31 * result + (difference != null ? difference.hashCode() : 0);
        result = 31 * result + (isEstimationAdequate != null ? isEstimationAdequate.hashCode() : 0);
        result = 31 * result + (designRequirementsRemarks != null ? designRequirementsRemarks.hashCode() : 0);
        result = 31 * result + (descriptionPartRequirementsRemarks != null ? descriptionPartRequirementsRemarks.hashCode() : 0);
        result = 31 * result + (calculationPartRequirementsRemarks != null ? calculationPartRequirementsRemarks.hashCode() : 0);
        result = 31 * result + (conclusionPartRequirementsRemarks != null ? conclusionPartRequirementsRemarks.hashCode() : 0);
        result = 31 * result + (photoMaterialRequirementsRemarks != null ? photoMaterialRequirementsRemarks.hashCode() : 0);
        result = 31 * result + (acceptedMarketPrice != null ? acceptedMarketPrice.hashCode() : 0);
        result = 31 * result + (objectsId != null ? objectsId.hashCode() : 0);
        result = 31 * result + (doerId != null ? doerId.hashCode() : 0);
        result = 31 * result + (approverId != null ? approverId.hashCode() : 0);
        result = 31 * result + (traditionalMethodValue != null ? traditionalMethodValue.hashCode() : 0);
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        return result;
    }
}
