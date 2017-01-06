package kik.KN.repository.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Создал Ибраев Ерлан 05.01.17.
 */
@Entity
@Table(name = "Objects", schema = "dbo", catalog = "oris_kik")
public class ObjectsEntity {
    private Long id;
    private String owner;
    private String name;
    private String placement;
    private Double area;
    private Double livingArea;
    private Double kitchenArea;
    private Integer roomCount;
    private String rooms;
    private Integer yearBuilt;
    private Integer storeysNumber;
    private Integer storey;
    private Long wallType;
    private Long floorType;
    private Long bathroomFloorType;
    private Long wallFacingType;
    private Long bathroomWallFacingType;
    private Long ceilingType;
    private Long doorType;
    private Long entranceDoorType;
    private Long windowType;
    private String condition;
    private Boolean isCentralCommunication;
    private Long electricityType;
    private Long heatingType;
    private Long coldWaterSupplyType;
    private Long hotWaterSupplyType;
    private Long gasSupplyType;
    private Long canalizationType;
    private String formalAddress;
    private Long estateType;
    private Double effectiveArea;
    private Long landOwnershipType;
    private Double landAreaHundredthHa;
    private Double ceilingHeight;
    private Integer spaceCount;
    private Long outerFacingType;
    private Long interiorDoorType;
    private Double landLeasePeriod;
    private Double shareAreaHundredthHa;
    private String cadastralNum;
    private String landPurpose;
    private Long divisibilityType;
    private Long relievoType;
    private Long territoryType;
    private String additionalBuildings;
    private Long region;
    private Double lat;
    private Double lon;
    private String addressName;
    private Boolean isPledged;
    private String borrower;
    private String mortgagor;
    private Long creditId;
    private Long layoutType;
    private String repairAge;
    private Long repairType;
    private Boolean illegalReplanning;
    private String illegalReplanningNote;
    private Long foundationType;
    private Long foundationConditionType;
    private String foundationConditionNote;
    private Long frameType;
    private Long frameConditionType;
    private String frameConditionNote;
    private Long wallConditionType;
    private String wallConditionNote;
    private Long coveringType;
    private Long coveringConditionType;
    private String coveringConditionNote;
    private Long balconyType;
    private Long balconyConditionType;
    private String balconyConditionNote;
    private Long roofType;
    private Long roofConditionType;
    private String roofConditionNote;
    private Long floorConditionType;
    private String floorConditionNote;
    private Long bathroomFloorConditionType;
    private String bathroomFloorConditionNote;
    private Long wallFacingConditionType;
    private String wallFacingConditionNote;
    private Long bathroomWallFacingConditionType;
    private String bathroomWallFacingConditionNote;
    private Long ceilingConditionType;
    private String ceilingConditionNote;
    private Long interiorDoorConditionType;
    private String interiorDoorConditionNote;
    private Long entranceDoorConditionType;
    private String entranceDoorConditionNote;
    private Long windowConditionType;
    private String windowConditionNote;
    private String plumbingEquipment;
    private Long plumbingEquipmentConditionType;
    private String plumbingEquipmentConditionNote;
    private String spaceCountDescription;
    private String note;
    private String mortgageContractNumber;
    private Date mortgageContractDate;
    private Long outerFacingConditionType;
    private String outerFacingConditionNote;
    private Long outerId;
    private Long outerEstateType;
    private String foundAddressName;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "owner", nullable = true, length = 2147483647)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
    @Column(name = "placement", nullable = true, length = 2147483647)
    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
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
    @Column(name = "kitchenArea", nullable = true, precision = 0)
    public Double getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Double kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    @Basic
    @Column(name = "roomCount", nullable = true)
    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    @Basic
    @Column(name = "rooms", nullable = true, length = 2147483647)
    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    @Basic
    @Column(name = "yearBuilt", nullable = true)
    public Integer getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(Integer yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Basic
    @Column(name = "storeysNumber", nullable = true)
    public Integer getStoreysNumber() {
        return storeysNumber;
    }

    public void setStoreysNumber(Integer storeysNumber) {
        this.storeysNumber = storeysNumber;
    }

    @Basic
    @Column(name = "storey", nullable = true)
    public Integer getStorey() {
        return storey;
    }

    public void setStorey(Integer storey) {
        this.storey = storey;
    }

    @Basic
    @Column(name = "wallType", nullable = true)
    public Long getWallType() {
        return wallType;
    }

    public void setWallType(Long wallType) {
        this.wallType = wallType;
    }

    @Basic
    @Column(name = "floorType", nullable = true)
    public Long getFloorType() {
        return floorType;
    }

    public void setFloorType(Long floorType) {
        this.floorType = floorType;
    }

    @Basic
    @Column(name = "bathroomFloorType", nullable = true)
    public Long getBathroomFloorType() {
        return bathroomFloorType;
    }

    public void setBathroomFloorType(Long bathroomFloorType) {
        this.bathroomFloorType = bathroomFloorType;
    }

    @Basic
    @Column(name = "wallFacingType", nullable = true)
    public Long getWallFacingType() {
        return wallFacingType;
    }

    public void setWallFacingType(Long wallFacingType) {
        this.wallFacingType = wallFacingType;
    }

    @Basic
    @Column(name = "bathroomWallFacingType", nullable = true)
    public Long getBathroomWallFacingType() {
        return bathroomWallFacingType;
    }

    public void setBathroomWallFacingType(Long bathroomWallFacingType) {
        this.bathroomWallFacingType = bathroomWallFacingType;
    }

    @Basic
    @Column(name = "ceilingType", nullable = true)
    public Long getCeilingType() {
        return ceilingType;
    }

    public void setCeilingType(Long ceilingType) {
        this.ceilingType = ceilingType;
    }

    @Basic
    @Column(name = "doorType", nullable = true)
    public Long getDoorType() {
        return doorType;
    }

    public void setDoorType(Long doorType) {
        this.doorType = doorType;
    }

    @Basic
    @Column(name = "entranceDoorType", nullable = true)
    public Long getEntranceDoorType() {
        return entranceDoorType;
    }

    public void setEntranceDoorType(Long entranceDoorType) {
        this.entranceDoorType = entranceDoorType;
    }

    @Basic
    @Column(name = "windowType", nullable = true)
    public Long getWindowType() {
        return windowType;
    }

    public void setWindowType(Long windowType) {
        this.windowType = windowType;
    }

    @Basic
    @Column(name = "condition", nullable = true, length = 2147483647)
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Basic
    @Column(name = "isCentralCommunication", nullable = true)
    public Boolean getCentralCommunication() {
        return isCentralCommunication;
    }

    public void setCentralCommunication(Boolean centralCommunication) {
        isCentralCommunication = centralCommunication;
    }

    @Basic
    @Column(name = "electricityType", nullable = true)
    public Long getElectricityType() {
        return electricityType;
    }

    public void setElectricityType(Long electricityType) {
        this.electricityType = electricityType;
    }

    @Basic
    @Column(name = "heatingType", nullable = true)
    public Long getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(Long heatingType) {
        this.heatingType = heatingType;
    }

    @Basic
    @Column(name = "coldWaterSupplyType", nullable = true)
    public Long getColdWaterSupplyType() {
        return coldWaterSupplyType;
    }

    public void setColdWaterSupplyType(Long coldWaterSupplyType) {
        this.coldWaterSupplyType = coldWaterSupplyType;
    }

    @Basic
    @Column(name = "hotWaterSupplyType", nullable = true)
    public Long getHotWaterSupplyType() {
        return hotWaterSupplyType;
    }

    public void setHotWaterSupplyType(Long hotWaterSupplyType) {
        this.hotWaterSupplyType = hotWaterSupplyType;
    }

    @Basic
    @Column(name = "gasSupplyType", nullable = true)
    public Long getGasSupplyType() {
        return gasSupplyType;
    }

    public void setGasSupplyType(Long gasSupplyType) {
        this.gasSupplyType = gasSupplyType;
    }

    @Basic
    @Column(name = "canalizationType", nullable = true)
    public Long getCanalizationType() {
        return canalizationType;
    }

    public void setCanalizationType(Long canalizationType) {
        this.canalizationType = canalizationType;
    }

    @Basic
    @Column(name = "formalAddress", nullable = true, length = 2147483647)
    public String getFormalAddress() {
        return formalAddress;
    }

    public void setFormalAddress(String formalAddress) {
        this.formalAddress = formalAddress;
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
    @Column(name = "effectiveArea", nullable = true, precision = 0)
    public Double getEffectiveArea() {
        return effectiveArea;
    }

    public void setEffectiveArea(Double effectiveArea) {
        this.effectiveArea = effectiveArea;
    }

    @Basic
    @Column(name = "landOwnershipType", nullable = true)
    public Long getLandOwnershipType() {
        return landOwnershipType;
    }

    public void setLandOwnershipType(Long landOwnershipType) {
        this.landOwnershipType = landOwnershipType;
    }

    @Basic
    @Column(name = "landAreaHundredthHa", nullable = true, precision = 0)
    public Double getLandAreaHundredthHa() {
        return landAreaHundredthHa;
    }

    public void setLandAreaHundredthHa(Double landAreaHundredthHa) {
        this.landAreaHundredthHa = landAreaHundredthHa;
    }

    @Basic
    @Column(name = "ceilingHeight", nullable = true, precision = 0)
    public Double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    @Basic
    @Column(name = "spaceCount", nullable = true)
    public Integer getSpaceCount() {
        return spaceCount;
    }

    public void setSpaceCount(Integer spaceCount) {
        this.spaceCount = spaceCount;
    }

    @Basic
    @Column(name = "outerFacingType", nullable = true)
    public Long getOuterFacingType() {
        return outerFacingType;
    }

    public void setOuterFacingType(Long outerFacingType) {
        this.outerFacingType = outerFacingType;
    }

    @Basic
    @Column(name = "interiorDoorType", nullable = true)
    public Long getInteriorDoorType() {
        return interiorDoorType;
    }

    public void setInteriorDoorType(Long interiorDoorType) {
        this.interiorDoorType = interiorDoorType;
    }

    @Basic
    @Column(name = "landLeasePeriod", nullable = true, precision = 0)
    public Double getLandLeasePeriod() {
        return landLeasePeriod;
    }

    public void setLandLeasePeriod(Double landLeasePeriod) {
        this.landLeasePeriod = landLeasePeriod;
    }

    @Basic
    @Column(name = "shareAreaHundredthHa", nullable = true, precision = 0)
    public Double getShareAreaHundredthHa() {
        return shareAreaHundredthHa;
    }

    public void setShareAreaHundredthHa(Double shareAreaHundredthHa) {
        this.shareAreaHundredthHa = shareAreaHundredthHa;
    }

    @Basic
    @Column(name = "cadastralNum", nullable = true, length = 2147483647)
    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
    }

    @Basic
    @Column(name = "landPurpose", nullable = true, length = 2147483647)
    public String getLandPurpose() {
        return landPurpose;
    }

    public void setLandPurpose(String landPurpose) {
        this.landPurpose = landPurpose;
    }

    @Basic
    @Column(name = "divisibilityType", nullable = true)
    public Long getDivisibilityType() {
        return divisibilityType;
    }

    public void setDivisibilityType(Long divisibilityType) {
        this.divisibilityType = divisibilityType;
    }

    @Basic
    @Column(name = "relievoType", nullable = true)
    public Long getRelievoType() {
        return relievoType;
    }

    public void setRelievoType(Long relievoType) {
        this.relievoType = relievoType;
    }

    @Basic
    @Column(name = "territoryType", nullable = true)
    public Long getTerritoryType() {
        return territoryType;
    }

    public void setTerritoryType(Long territoryType) {
        this.territoryType = territoryType;
    }

    @Basic
    @Column(name = "additionalBuildings", nullable = true, length = 2147483647)
    public String getAdditionalBuildings() {
        return additionalBuildings;
    }

    public void setAdditionalBuildings(String additionalBuildings) {
        this.additionalBuildings = additionalBuildings;
    }

    @Basic
    @Column(name = "region", nullable = true)
    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
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
    @Column(name = "addressName", nullable = true, length = 2147483647)
    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @Basic
    @Column(name = "isPledged", nullable = true)
    public Boolean getPledged() {
        return isPledged;
    }

    public void setPledged(Boolean pledged) {
        isPledged = pledged;
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
    @Column(name = "mortgagor", nullable = true, length = 2147483647)
    public String getMortgagor() {
        return mortgagor;
    }

    public void setMortgagor(String mortgagor) {
        this.mortgagor = mortgagor;
    }

    @Basic
    @Column(name = "creditID", nullable = true)
    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    @Basic
    @Column(name = "layoutType", nullable = true)
    public Long getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(Long layoutType) {
        this.layoutType = layoutType;
    }

    @Basic
    @Column(name = "repairAge", nullable = true, length = 2147483647)
    public String getRepairAge() {
        return repairAge;
    }

    public void setRepairAge(String repairAge) {
        this.repairAge = repairAge;
    }

    @Basic
    @Column(name = "repairType", nullable = true)
    public Long getRepairType() {
        return repairType;
    }

    public void setRepairType(Long repairType) {
        this.repairType = repairType;
    }

    @Basic
    @Column(name = "illegalReplanning", nullable = true)
    public Boolean getIllegalReplanning() {
        return illegalReplanning;
    }

    public void setIllegalReplanning(Boolean illegalReplanning) {
        this.illegalReplanning = illegalReplanning;
    }

    @Basic
    @Column(name = "illegalReplanningNote", nullable = true, length = 2147483647)
    public String getIllegalReplanningNote() {
        return illegalReplanningNote;
    }

    public void setIllegalReplanningNote(String illegalReplanningNote) {
        this.illegalReplanningNote = illegalReplanningNote;
    }

    @Basic
    @Column(name = "foundationType", nullable = true)
    public Long getFoundationType() {
        return foundationType;
    }

    public void setFoundationType(Long foundationType) {
        this.foundationType = foundationType;
    }

    @Basic
    @Column(name = "foundationConditionType", nullable = true)
    public Long getFoundationConditionType() {
        return foundationConditionType;
    }

    public void setFoundationConditionType(Long foundationConditionType) {
        this.foundationConditionType = foundationConditionType;
    }

    @Basic
    @Column(name = "foundationConditionNote", nullable = true, length = 2147483647)
    public String getFoundationConditionNote() {
        return foundationConditionNote;
    }

    public void setFoundationConditionNote(String foundationConditionNote) {
        this.foundationConditionNote = foundationConditionNote;
    }

    @Basic
    @Column(name = "frameType", nullable = true)
    public Long getFrameType() {
        return frameType;
    }

    public void setFrameType(Long frameType) {
        this.frameType = frameType;
    }

    @Basic
    @Column(name = "frameConditionType", nullable = true)
    public Long getFrameConditionType() {
        return frameConditionType;
    }

    public void setFrameConditionType(Long frameConditionType) {
        this.frameConditionType = frameConditionType;
    }

    @Basic
    @Column(name = "frameConditionNote", nullable = true, length = 2147483647)
    public String getFrameConditionNote() {
        return frameConditionNote;
    }

    public void setFrameConditionNote(String frameConditionNote) {
        this.frameConditionNote = frameConditionNote;
    }

    @Basic
    @Column(name = "wallConditionType", nullable = true)
    public Long getWallConditionType() {
        return wallConditionType;
    }

    public void setWallConditionType(Long wallConditionType) {
        this.wallConditionType = wallConditionType;
    }

    @Basic
    @Column(name = "wallConditionNote", nullable = true, length = 2147483647)
    public String getWallConditionNote() {
        return wallConditionNote;
    }

    public void setWallConditionNote(String wallConditionNote) {
        this.wallConditionNote = wallConditionNote;
    }

    @Basic
    @Column(name = "coveringType", nullable = true)
    public Long getCoveringType() {
        return coveringType;
    }

    public void setCoveringType(Long coveringType) {
        this.coveringType = coveringType;
    }

    @Basic
    @Column(name = "coveringConditionType", nullable = true)
    public Long getCoveringConditionType() {
        return coveringConditionType;
    }

    public void setCoveringConditionType(Long coveringConditionType) {
        this.coveringConditionType = coveringConditionType;
    }

    @Basic
    @Column(name = "coveringConditionNote", nullable = true, length = 2147483647)
    public String getCoveringConditionNote() {
        return coveringConditionNote;
    }

    public void setCoveringConditionNote(String coveringConditionNote) {
        this.coveringConditionNote = coveringConditionNote;
    }

    @Basic
    @Column(name = "balconyType", nullable = true)
    public Long getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(Long balconyType) {
        this.balconyType = balconyType;
    }

    @Basic
    @Column(name = "balconyConditionType", nullable = true)
    public Long getBalconyConditionType() {
        return balconyConditionType;
    }

    public void setBalconyConditionType(Long balconyConditionType) {
        this.balconyConditionType = balconyConditionType;
    }

    @Basic
    @Column(name = "balconyConditionNote", nullable = true, length = 2147483647)
    public String getBalconyConditionNote() {
        return balconyConditionNote;
    }

    public void setBalconyConditionNote(String balconyConditionNote) {
        this.balconyConditionNote = balconyConditionNote;
    }

    @Basic
    @Column(name = "roofType", nullable = true)
    public Long getRoofType() {
        return roofType;
    }

    public void setRoofType(Long roofType) {
        this.roofType = roofType;
    }

    @Basic
    @Column(name = "roofConditionType", nullable = true)
    public Long getRoofConditionType() {
        return roofConditionType;
    }

    public void setRoofConditionType(Long roofConditionType) {
        this.roofConditionType = roofConditionType;
    }

    @Basic
    @Column(name = "roofConditionNote", nullable = true, length = 2147483647)
    public String getRoofConditionNote() {
        return roofConditionNote;
    }

    public void setRoofConditionNote(String roofConditionNote) {
        this.roofConditionNote = roofConditionNote;
    }

    @Basic
    @Column(name = "floorConditionType", nullable = true)
    public Long getFloorConditionType() {
        return floorConditionType;
    }

    public void setFloorConditionType(Long floorConditionType) {
        this.floorConditionType = floorConditionType;
    }

    @Basic
    @Column(name = "floorConditionNote", nullable = true, length = 2147483647)
    public String getFloorConditionNote() {
        return floorConditionNote;
    }

    public void setFloorConditionNote(String floorConditionNote) {
        this.floorConditionNote = floorConditionNote;
    }

    @Basic
    @Column(name = "bathroomFloorConditionType", nullable = true)
    public Long getBathroomFloorConditionType() {
        return bathroomFloorConditionType;
    }

    public void setBathroomFloorConditionType(Long bathroomFloorConditionType) {
        this.bathroomFloorConditionType = bathroomFloorConditionType;
    }

    @Basic
    @Column(name = "bathroomFloorConditionNote", nullable = true, length = 2147483647)
    public String getBathroomFloorConditionNote() {
        return bathroomFloorConditionNote;
    }

    public void setBathroomFloorConditionNote(String bathroomFloorConditionNote) {
        this.bathroomFloorConditionNote = bathroomFloorConditionNote;
    }

    @Basic
    @Column(name = "wallFacingConditionType", nullable = true)
    public Long getWallFacingConditionType() {
        return wallFacingConditionType;
    }

    public void setWallFacingConditionType(Long wallFacingConditionType) {
        this.wallFacingConditionType = wallFacingConditionType;
    }

    @Basic
    @Column(name = "wallFacingConditionNote", nullable = true, length = 2147483647)
    public String getWallFacingConditionNote() {
        return wallFacingConditionNote;
    }

    public void setWallFacingConditionNote(String wallFacingConditionNote) {
        this.wallFacingConditionNote = wallFacingConditionNote;
    }

    @Basic
    @Column(name = "bathroomWallFacingConditionType", nullable = true)
    public Long getBathroomWallFacingConditionType() {
        return bathroomWallFacingConditionType;
    }

    public void setBathroomWallFacingConditionType(Long bathroomWallFacingConditionType) {
        this.bathroomWallFacingConditionType = bathroomWallFacingConditionType;
    }

    @Basic
    @Column(name = "bathroomWallFacingConditionNote", nullable = true, length = 2147483647)
    public String getBathroomWallFacingConditionNote() {
        return bathroomWallFacingConditionNote;
    }

    public void setBathroomWallFacingConditionNote(String bathroomWallFacingConditionNote) {
        this.bathroomWallFacingConditionNote = bathroomWallFacingConditionNote;
    }

    @Basic
    @Column(name = "ceilingConditionType", nullable = true)
    public Long getCeilingConditionType() {
        return ceilingConditionType;
    }

    public void setCeilingConditionType(Long ceilingConditionType) {
        this.ceilingConditionType = ceilingConditionType;
    }

    @Basic
    @Column(name = "ceilingConditionNote", nullable = true, length = 2147483647)
    public String getCeilingConditionNote() {
        return ceilingConditionNote;
    }

    public void setCeilingConditionNote(String ceilingConditionNote) {
        this.ceilingConditionNote = ceilingConditionNote;
    }

    @Basic
    @Column(name = "interiorDoorConditionType", nullable = true)
    public Long getInteriorDoorConditionType() {
        return interiorDoorConditionType;
    }

    public void setInteriorDoorConditionType(Long interiorDoorConditionType) {
        this.interiorDoorConditionType = interiorDoorConditionType;
    }

    @Basic
    @Column(name = "interiorDoorConditionNote", nullable = true, length = 2147483647)
    public String getInteriorDoorConditionNote() {
        return interiorDoorConditionNote;
    }

    public void setInteriorDoorConditionNote(String interiorDoorConditionNote) {
        this.interiorDoorConditionNote = interiorDoorConditionNote;
    }

    @Basic
    @Column(name = "entranceDoorConditionType", nullable = true)
    public Long getEntranceDoorConditionType() {
        return entranceDoorConditionType;
    }

    public void setEntranceDoorConditionType(Long entranceDoorConditionType) {
        this.entranceDoorConditionType = entranceDoorConditionType;
    }

    @Basic
    @Column(name = "entranceDoorConditionNote", nullable = true, length = 2147483647)
    public String getEntranceDoorConditionNote() {
        return entranceDoorConditionNote;
    }

    public void setEntranceDoorConditionNote(String entranceDoorConditionNote) {
        this.entranceDoorConditionNote = entranceDoorConditionNote;
    }

    @Basic
    @Column(name = "windowConditionType", nullable = true)
    public Long getWindowConditionType() {
        return windowConditionType;
    }

    public void setWindowConditionType(Long windowConditionType) {
        this.windowConditionType = windowConditionType;
    }

    @Basic
    @Column(name = "windowConditionNote", nullable = true, length = 2147483647)
    public String getWindowConditionNote() {
        return windowConditionNote;
    }

    public void setWindowConditionNote(String windowConditionNote) {
        this.windowConditionNote = windowConditionNote;
    }

    @Basic
    @Column(name = "plumbingEquipment", nullable = true, length = 2147483647)
    public String getPlumbingEquipment() {
        return plumbingEquipment;
    }

    public void setPlumbingEquipment(String plumbingEquipment) {
        this.plumbingEquipment = plumbingEquipment;
    }

    @Basic
    @Column(name = "plumbingEquipmentConditionType", nullable = true)
    public Long getPlumbingEquipmentConditionType() {
        return plumbingEquipmentConditionType;
    }

    public void setPlumbingEquipmentConditionType(Long plumbingEquipmentConditionType) {
        this.plumbingEquipmentConditionType = plumbingEquipmentConditionType;
    }

    @Basic
    @Column(name = "plumbingEquipmentConditionNote", nullable = true, length = 2147483647)
    public String getPlumbingEquipmentConditionNote() {
        return plumbingEquipmentConditionNote;
    }

    public void setPlumbingEquipmentConditionNote(String plumbingEquipmentConditionNote) {
        this.plumbingEquipmentConditionNote = plumbingEquipmentConditionNote;
    }

    @Basic
    @Column(name = "spaceCountDescription", nullable = true, length = 2147483647)
    public String getSpaceCountDescription() {
        return spaceCountDescription;
    }

    public void setSpaceCountDescription(String spaceCountDescription) {
        this.spaceCountDescription = spaceCountDescription;
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
    @Column(name = "mortgageContractNumber", nullable = true, length = 2147483647)
    public String getMortgageContractNumber() {
        return mortgageContractNumber;
    }

    public void setMortgageContractNumber(String mortgageContractNumber) {
        this.mortgageContractNumber = mortgageContractNumber;
    }

    @Basic
    @Column(name = "mortgageContractDate", nullable = true)
    public Date getMortgageContractDate() {
        return mortgageContractDate;
    }

    public void setMortgageContractDate(Date mortgageContractDate) {
        this.mortgageContractDate = mortgageContractDate;
    }

    @Basic
    @Column(name = "outerFacingConditionType", nullable = true)
    public Long getOuterFacingConditionType() {
        return outerFacingConditionType;
    }

    public void setOuterFacingConditionType(Long outerFacingConditionType) {
        this.outerFacingConditionType = outerFacingConditionType;
    }

    @Basic
    @Column(name = "outerFacingConditionNote", nullable = true, length = 2147483647)
    public String getOuterFacingConditionNote() {
        return outerFacingConditionNote;
    }

    public void setOuterFacingConditionNote(String outerFacingConditionNote) {
        this.outerFacingConditionNote = outerFacingConditionNote;
    }

    @Basic
    @Column(name = "outerId", nullable = true)
    public Long getOuterId() {
        return outerId;
    }

    public void setOuterId(Long outerId) {
        this.outerId = outerId;
    }

    @Basic
    @Column(name = "outerEstateType", nullable = true)
    public Long getOuterEstateType() {
        return outerEstateType;
    }

    public void setOuterEstateType(Long outerEstateType) {
        this.outerEstateType = outerEstateType;
    }

    @Basic
    @Column(name = "foundAddressName", nullable = true, length = 2147483647)
    public String getFoundAddressName() {
        return foundAddressName;
    }

    public void setFoundAddressName(String foundAddressName) {
        this.foundAddressName = foundAddressName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectsEntity that = (ObjectsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (placement != null ? !placement.equals(that.placement) : that.placement != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (livingArea != null ? !livingArea.equals(that.livingArea) : that.livingArea != null) return false;
        if (kitchenArea != null ? !kitchenArea.equals(that.kitchenArea) : that.kitchenArea != null) return false;
        if (roomCount != null ? !roomCount.equals(that.roomCount) : that.roomCount != null) return false;
        if (rooms != null ? !rooms.equals(that.rooms) : that.rooms != null) return false;
        if (yearBuilt != null ? !yearBuilt.equals(that.yearBuilt) : that.yearBuilt != null) return false;
        if (storeysNumber != null ? !storeysNumber.equals(that.storeysNumber) : that.storeysNumber != null)
            return false;
        if (storey != null ? !storey.equals(that.storey) : that.storey != null) return false;
        if (wallType != null ? !wallType.equals(that.wallType) : that.wallType != null) return false;
        if (floorType != null ? !floorType.equals(that.floorType) : that.floorType != null) return false;
        if (bathroomFloorType != null ? !bathroomFloorType.equals(that.bathroomFloorType) : that.bathroomFloorType != null)
            return false;
        if (wallFacingType != null ? !wallFacingType.equals(that.wallFacingType) : that.wallFacingType != null)
            return false;
        if (bathroomWallFacingType != null ? !bathroomWallFacingType.equals(that.bathroomWallFacingType) : that.bathroomWallFacingType != null)
            return false;
        if (ceilingType != null ? !ceilingType.equals(that.ceilingType) : that.ceilingType != null) return false;
        if (doorType != null ? !doorType.equals(that.doorType) : that.doorType != null) return false;
        if (entranceDoorType != null ? !entranceDoorType.equals(that.entranceDoorType) : that.entranceDoorType != null)
            return false;
        if (windowType != null ? !windowType.equals(that.windowType) : that.windowType != null) return false;
        if (condition != null ? !condition.equals(that.condition) : that.condition != null) return false;
        if (isCentralCommunication != null ? !isCentralCommunication.equals(that.isCentralCommunication) : that.isCentralCommunication != null)
            return false;
        if (electricityType != null ? !electricityType.equals(that.electricityType) : that.electricityType != null)
            return false;
        if (heatingType != null ? !heatingType.equals(that.heatingType) : that.heatingType != null) return false;
        if (coldWaterSupplyType != null ? !coldWaterSupplyType.equals(that.coldWaterSupplyType) : that.coldWaterSupplyType != null)
            return false;
        if (hotWaterSupplyType != null ? !hotWaterSupplyType.equals(that.hotWaterSupplyType) : that.hotWaterSupplyType != null)
            return false;
        if (gasSupplyType != null ? !gasSupplyType.equals(that.gasSupplyType) : that.gasSupplyType != null)
            return false;
        if (canalizationType != null ? !canalizationType.equals(that.canalizationType) : that.canalizationType != null)
            return false;
        if (formalAddress != null ? !formalAddress.equals(that.formalAddress) : that.formalAddress != null)
            return false;
        if (estateType != null ? !estateType.equals(that.estateType) : that.estateType != null) return false;
        if (effectiveArea != null ? !effectiveArea.equals(that.effectiveArea) : that.effectiveArea != null)
            return false;
        if (landOwnershipType != null ? !landOwnershipType.equals(that.landOwnershipType) : that.landOwnershipType != null)
            return false;
        if (landAreaHundredthHa != null ? !landAreaHundredthHa.equals(that.landAreaHundredthHa) : that.landAreaHundredthHa != null)
            return false;
        if (ceilingHeight != null ? !ceilingHeight.equals(that.ceilingHeight) : that.ceilingHeight != null)
            return false;
        if (spaceCount != null ? !spaceCount.equals(that.spaceCount) : that.spaceCount != null) return false;
        if (outerFacingType != null ? !outerFacingType.equals(that.outerFacingType) : that.outerFacingType != null)
            return false;
        if (interiorDoorType != null ? !interiorDoorType.equals(that.interiorDoorType) : that.interiorDoorType != null)
            return false;
        if (landLeasePeriod != null ? !landLeasePeriod.equals(that.landLeasePeriod) : that.landLeasePeriod != null)
            return false;
        if (shareAreaHundredthHa != null ? !shareAreaHundredthHa.equals(that.shareAreaHundredthHa) : that.shareAreaHundredthHa != null)
            return false;
        if (cadastralNum != null ? !cadastralNum.equals(that.cadastralNum) : that.cadastralNum != null) return false;
        if (landPurpose != null ? !landPurpose.equals(that.landPurpose) : that.landPurpose != null) return false;
        if (divisibilityType != null ? !divisibilityType.equals(that.divisibilityType) : that.divisibilityType != null)
            return false;
        if (relievoType != null ? !relievoType.equals(that.relievoType) : that.relievoType != null) return false;
        if (territoryType != null ? !territoryType.equals(that.territoryType) : that.territoryType != null)
            return false;
        if (additionalBuildings != null ? !additionalBuildings.equals(that.additionalBuildings) : that.additionalBuildings != null)
            return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (addressName != null ? !addressName.equals(that.addressName) : that.addressName != null) return false;
        if (isPledged != null ? !isPledged.equals(that.isPledged) : that.isPledged != null) return false;
        if (borrower != null ? !borrower.equals(that.borrower) : that.borrower != null) return false;
        if (mortgagor != null ? !mortgagor.equals(that.mortgagor) : that.mortgagor != null) return false;
        if (creditId != null ? !creditId.equals(that.creditId) : that.creditId != null) return false;
        if (layoutType != null ? !layoutType.equals(that.layoutType) : that.layoutType != null) return false;
        if (repairAge != null ? !repairAge.equals(that.repairAge) : that.repairAge != null) return false;
        if (repairType != null ? !repairType.equals(that.repairType) : that.repairType != null) return false;
        if (illegalReplanning != null ? !illegalReplanning.equals(that.illegalReplanning) : that.illegalReplanning != null)
            return false;
        if (illegalReplanningNote != null ? !illegalReplanningNote.equals(that.illegalReplanningNote) : that.illegalReplanningNote != null)
            return false;
        if (foundationType != null ? !foundationType.equals(that.foundationType) : that.foundationType != null)
            return false;
        if (foundationConditionType != null ? !foundationConditionType.equals(that.foundationConditionType) : that.foundationConditionType != null)
            return false;
        if (foundationConditionNote != null ? !foundationConditionNote.equals(that.foundationConditionNote) : that.foundationConditionNote != null)
            return false;
        if (frameType != null ? !frameType.equals(that.frameType) : that.frameType != null) return false;
        if (frameConditionType != null ? !frameConditionType.equals(that.frameConditionType) : that.frameConditionType != null)
            return false;
        if (frameConditionNote != null ? !frameConditionNote.equals(that.frameConditionNote) : that.frameConditionNote != null)
            return false;
        if (wallConditionType != null ? !wallConditionType.equals(that.wallConditionType) : that.wallConditionType != null)
            return false;
        if (wallConditionNote != null ? !wallConditionNote.equals(that.wallConditionNote) : that.wallConditionNote != null)
            return false;
        if (coveringType != null ? !coveringType.equals(that.coveringType) : that.coveringType != null) return false;
        if (coveringConditionType != null ? !coveringConditionType.equals(that.coveringConditionType) : that.coveringConditionType != null)
            return false;
        if (coveringConditionNote != null ? !coveringConditionNote.equals(that.coveringConditionNote) : that.coveringConditionNote != null)
            return false;
        if (balconyType != null ? !balconyType.equals(that.balconyType) : that.balconyType != null) return false;
        if (balconyConditionType != null ? !balconyConditionType.equals(that.balconyConditionType) : that.balconyConditionType != null)
            return false;
        if (balconyConditionNote != null ? !balconyConditionNote.equals(that.balconyConditionNote) : that.balconyConditionNote != null)
            return false;
        if (roofType != null ? !roofType.equals(that.roofType) : that.roofType != null) return false;
        if (roofConditionType != null ? !roofConditionType.equals(that.roofConditionType) : that.roofConditionType != null)
            return false;
        if (roofConditionNote != null ? !roofConditionNote.equals(that.roofConditionNote) : that.roofConditionNote != null)
            return false;
        if (floorConditionType != null ? !floorConditionType.equals(that.floorConditionType) : that.floorConditionType != null)
            return false;
        if (floorConditionNote != null ? !floorConditionNote.equals(that.floorConditionNote) : that.floorConditionNote != null)
            return false;
        if (bathroomFloorConditionType != null ? !bathroomFloorConditionType.equals(that.bathroomFloorConditionType) : that.bathroomFloorConditionType != null)
            return false;
        if (bathroomFloorConditionNote != null ? !bathroomFloorConditionNote.equals(that.bathroomFloorConditionNote) : that.bathroomFloorConditionNote != null)
            return false;
        if (wallFacingConditionType != null ? !wallFacingConditionType.equals(that.wallFacingConditionType) : that.wallFacingConditionType != null)
            return false;
        if (wallFacingConditionNote != null ? !wallFacingConditionNote.equals(that.wallFacingConditionNote) : that.wallFacingConditionNote != null)
            return false;
        if (bathroomWallFacingConditionType != null ? !bathroomWallFacingConditionType.equals(that.bathroomWallFacingConditionType) : that.bathroomWallFacingConditionType != null)
            return false;
        if (bathroomWallFacingConditionNote != null ? !bathroomWallFacingConditionNote.equals(that.bathroomWallFacingConditionNote) : that.bathroomWallFacingConditionNote != null)
            return false;
        if (ceilingConditionType != null ? !ceilingConditionType.equals(that.ceilingConditionType) : that.ceilingConditionType != null)
            return false;
        if (ceilingConditionNote != null ? !ceilingConditionNote.equals(that.ceilingConditionNote) : that.ceilingConditionNote != null)
            return false;
        if (interiorDoorConditionType != null ? !interiorDoorConditionType.equals(that.interiorDoorConditionType) : that.interiorDoorConditionType != null)
            return false;
        if (interiorDoorConditionNote != null ? !interiorDoorConditionNote.equals(that.interiorDoorConditionNote) : that.interiorDoorConditionNote != null)
            return false;
        if (entranceDoorConditionType != null ? !entranceDoorConditionType.equals(that.entranceDoorConditionType) : that.entranceDoorConditionType != null)
            return false;
        if (entranceDoorConditionNote != null ? !entranceDoorConditionNote.equals(that.entranceDoorConditionNote) : that.entranceDoorConditionNote != null)
            return false;
        if (windowConditionType != null ? !windowConditionType.equals(that.windowConditionType) : that.windowConditionType != null)
            return false;
        if (windowConditionNote != null ? !windowConditionNote.equals(that.windowConditionNote) : that.windowConditionNote != null)
            return false;
        if (plumbingEquipment != null ? !plumbingEquipment.equals(that.plumbingEquipment) : that.plumbingEquipment != null)
            return false;
        if (plumbingEquipmentConditionType != null ? !plumbingEquipmentConditionType.equals(that.plumbingEquipmentConditionType) : that.plumbingEquipmentConditionType != null)
            return false;
        if (plumbingEquipmentConditionNote != null ? !plumbingEquipmentConditionNote.equals(that.plumbingEquipmentConditionNote) : that.plumbingEquipmentConditionNote != null)
            return false;
        if (spaceCountDescription != null ? !spaceCountDescription.equals(that.spaceCountDescription) : that.spaceCountDescription != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (mortgageContractNumber != null ? !mortgageContractNumber.equals(that.mortgageContractNumber) : that.mortgageContractNumber != null)
            return false;
        if (mortgageContractDate != null ? !mortgageContractDate.equals(that.mortgageContractDate) : that.mortgageContractDate != null)
            return false;
        if (outerFacingConditionType != null ? !outerFacingConditionType.equals(that.outerFacingConditionType) : that.outerFacingConditionType != null)
            return false;
        if (outerFacingConditionNote != null ? !outerFacingConditionNote.equals(that.outerFacingConditionNote) : that.outerFacingConditionNote != null)
            return false;
        if (outerId != null ? !outerId.equals(that.outerId) : that.outerId != null) return false;
        if (outerEstateType != null ? !outerEstateType.equals(that.outerEstateType) : that.outerEstateType != null)
            return false;
        if (foundAddressName != null ? !foundAddressName.equals(that.foundAddressName) : that.foundAddressName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (placement != null ? placement.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (livingArea != null ? livingArea.hashCode() : 0);
        result = 31 * result + (kitchenArea != null ? kitchenArea.hashCode() : 0);
        result = 31 * result + (roomCount != null ? roomCount.hashCode() : 0);
        result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        result = 31 * result + (yearBuilt != null ? yearBuilt.hashCode() : 0);
        result = 31 * result + (storeysNumber != null ? storeysNumber.hashCode() : 0);
        result = 31 * result + (storey != null ? storey.hashCode() : 0);
        result = 31 * result + (wallType != null ? wallType.hashCode() : 0);
        result = 31 * result + (floorType != null ? floorType.hashCode() : 0);
        result = 31 * result + (bathroomFloorType != null ? bathroomFloorType.hashCode() : 0);
        result = 31 * result + (wallFacingType != null ? wallFacingType.hashCode() : 0);
        result = 31 * result + (bathroomWallFacingType != null ? bathroomWallFacingType.hashCode() : 0);
        result = 31 * result + (ceilingType != null ? ceilingType.hashCode() : 0);
        result = 31 * result + (doorType != null ? doorType.hashCode() : 0);
        result = 31 * result + (entranceDoorType != null ? entranceDoorType.hashCode() : 0);
        result = 31 * result + (windowType != null ? windowType.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (isCentralCommunication != null ? isCentralCommunication.hashCode() : 0);
        result = 31 * result + (electricityType != null ? electricityType.hashCode() : 0);
        result = 31 * result + (heatingType != null ? heatingType.hashCode() : 0);
        result = 31 * result + (coldWaterSupplyType != null ? coldWaterSupplyType.hashCode() : 0);
        result = 31 * result + (hotWaterSupplyType != null ? hotWaterSupplyType.hashCode() : 0);
        result = 31 * result + (gasSupplyType != null ? gasSupplyType.hashCode() : 0);
        result = 31 * result + (canalizationType != null ? canalizationType.hashCode() : 0);
        result = 31 * result + (formalAddress != null ? formalAddress.hashCode() : 0);
        result = 31 * result + (estateType != null ? estateType.hashCode() : 0);
        result = 31 * result + (effectiveArea != null ? effectiveArea.hashCode() : 0);
        result = 31 * result + (landOwnershipType != null ? landOwnershipType.hashCode() : 0);
        result = 31 * result + (landAreaHundredthHa != null ? landAreaHundredthHa.hashCode() : 0);
        result = 31 * result + (ceilingHeight != null ? ceilingHeight.hashCode() : 0);
        result = 31 * result + (spaceCount != null ? spaceCount.hashCode() : 0);
        result = 31 * result + (outerFacingType != null ? outerFacingType.hashCode() : 0);
        result = 31 * result + (interiorDoorType != null ? interiorDoorType.hashCode() : 0);
        result = 31 * result + (landLeasePeriod != null ? landLeasePeriod.hashCode() : 0);
        result = 31 * result + (shareAreaHundredthHa != null ? shareAreaHundredthHa.hashCode() : 0);
        result = 31 * result + (cadastralNum != null ? cadastralNum.hashCode() : 0);
        result = 31 * result + (landPurpose != null ? landPurpose.hashCode() : 0);
        result = 31 * result + (divisibilityType != null ? divisibilityType.hashCode() : 0);
        result = 31 * result + (relievoType != null ? relievoType.hashCode() : 0);
        result = 31 * result + (territoryType != null ? territoryType.hashCode() : 0);
        result = 31 * result + (additionalBuildings != null ? additionalBuildings.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        result = 31 * result + (isPledged != null ? isPledged.hashCode() : 0);
        result = 31 * result + (borrower != null ? borrower.hashCode() : 0);
        result = 31 * result + (mortgagor != null ? mortgagor.hashCode() : 0);
        result = 31 * result + (creditId != null ? creditId.hashCode() : 0);
        result = 31 * result + (layoutType != null ? layoutType.hashCode() : 0);
        result = 31 * result + (repairAge != null ? repairAge.hashCode() : 0);
        result = 31 * result + (repairType != null ? repairType.hashCode() : 0);
        result = 31 * result + (illegalReplanning != null ? illegalReplanning.hashCode() : 0);
        result = 31 * result + (illegalReplanningNote != null ? illegalReplanningNote.hashCode() : 0);
        result = 31 * result + (foundationType != null ? foundationType.hashCode() : 0);
        result = 31 * result + (foundationConditionType != null ? foundationConditionType.hashCode() : 0);
        result = 31 * result + (foundationConditionNote != null ? foundationConditionNote.hashCode() : 0);
        result = 31 * result + (frameType != null ? frameType.hashCode() : 0);
        result = 31 * result + (frameConditionType != null ? frameConditionType.hashCode() : 0);
        result = 31 * result + (frameConditionNote != null ? frameConditionNote.hashCode() : 0);
        result = 31 * result + (wallConditionType != null ? wallConditionType.hashCode() : 0);
        result = 31 * result + (wallConditionNote != null ? wallConditionNote.hashCode() : 0);
        result = 31 * result + (coveringType != null ? coveringType.hashCode() : 0);
        result = 31 * result + (coveringConditionType != null ? coveringConditionType.hashCode() : 0);
        result = 31 * result + (coveringConditionNote != null ? coveringConditionNote.hashCode() : 0);
        result = 31 * result + (balconyType != null ? balconyType.hashCode() : 0);
        result = 31 * result + (balconyConditionType != null ? balconyConditionType.hashCode() : 0);
        result = 31 * result + (balconyConditionNote != null ? balconyConditionNote.hashCode() : 0);
        result = 31 * result + (roofType != null ? roofType.hashCode() : 0);
        result = 31 * result + (roofConditionType != null ? roofConditionType.hashCode() : 0);
        result = 31 * result + (roofConditionNote != null ? roofConditionNote.hashCode() : 0);
        result = 31 * result + (floorConditionType != null ? floorConditionType.hashCode() : 0);
        result = 31 * result + (floorConditionNote != null ? floorConditionNote.hashCode() : 0);
        result = 31 * result + (bathroomFloorConditionType != null ? bathroomFloorConditionType.hashCode() : 0);
        result = 31 * result + (bathroomFloorConditionNote != null ? bathroomFloorConditionNote.hashCode() : 0);
        result = 31 * result + (wallFacingConditionType != null ? wallFacingConditionType.hashCode() : 0);
        result = 31 * result + (wallFacingConditionNote != null ? wallFacingConditionNote.hashCode() : 0);
        result = 31 * result + (bathroomWallFacingConditionType != null ? bathroomWallFacingConditionType.hashCode() : 0);
        result = 31 * result + (bathroomWallFacingConditionNote != null ? bathroomWallFacingConditionNote.hashCode() : 0);
        result = 31 * result + (ceilingConditionType != null ? ceilingConditionType.hashCode() : 0);
        result = 31 * result + (ceilingConditionNote != null ? ceilingConditionNote.hashCode() : 0);
        result = 31 * result + (interiorDoorConditionType != null ? interiorDoorConditionType.hashCode() : 0);
        result = 31 * result + (interiorDoorConditionNote != null ? interiorDoorConditionNote.hashCode() : 0);
        result = 31 * result + (entranceDoorConditionType != null ? entranceDoorConditionType.hashCode() : 0);
        result = 31 * result + (entranceDoorConditionNote != null ? entranceDoorConditionNote.hashCode() : 0);
        result = 31 * result + (windowConditionType != null ? windowConditionType.hashCode() : 0);
        result = 31 * result + (windowConditionNote != null ? windowConditionNote.hashCode() : 0);
        result = 31 * result + (plumbingEquipment != null ? plumbingEquipment.hashCode() : 0);
        result = 31 * result + (plumbingEquipmentConditionType != null ? plumbingEquipmentConditionType.hashCode() : 0);
        result = 31 * result + (plumbingEquipmentConditionNote != null ? plumbingEquipmentConditionNote.hashCode() : 0);
        result = 31 * result + (spaceCountDescription != null ? spaceCountDescription.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (mortgageContractNumber != null ? mortgageContractNumber.hashCode() : 0);
        result = 31 * result + (mortgageContractDate != null ? mortgageContractDate.hashCode() : 0);
        result = 31 * result + (outerFacingConditionType != null ? outerFacingConditionType.hashCode() : 0);
        result = 31 * result + (outerFacingConditionNote != null ? outerFacingConditionNote.hashCode() : 0);
        result = 31 * result + (outerId != null ? outerId.hashCode() : 0);
        result = 31 * result + (outerEstateType != null ? outerEstateType.hashCode() : 0);
        result = 31 * result + (foundAddressName != null ? foundAddressName.hashCode() : 0);
        return result;
    }
}
