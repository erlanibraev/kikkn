package kik.KN.model;

/**
 * Создал Ибраев Ерлан 06.01.17.
 */
public class MKvartira {
    private Double price; // Цена
    private Integer priceUnit; // единица измерения стоимости или Если аренда
    private Integer rentPeriodType; // Для аренды
    private String addressName; // Адрес
    private Double lat; // Координаты
    private Double lon; // Координаты
    private Integer condition; // Состояние
    private Integer telephoneFacility; // Тип телефона
    private Integer bathroomType; // санузел
    private String security; // безопасность
    private Double ceilingHeight; // Высота потолков
    private Boolean isPledged; // в залоге
    private Integer internetType; // тип интернета
    private Integer canalizationType; // канализация
    private Integer waterSupplyType; // Вода
    private Integer electricityType; // Электричество
    private Integer heatingType; // Отопление
    private Integer gasSupplyType; // Газ
    private String description; // описание
    private String otherProp; // разное
    private Integer wallType; // Тип строения
    private Integer roomCount; // Количество комнат
    private Integer yearBuild; // Год постройки
    private Integer storey; // Этаж квартиры
    private Integer storeysNumber; // этажность дома
    private Double area; // общая площадь
    private Double livingArea; // жилая площадь
    private Double kitchenArea; // площадь кухни
    private Integer balconyType; // Тип балкона
    private Boolean isGlassBalcony; // балкон остеклен
    private Integer doorType; // тип двери
    private Integer parkingType; // парковка
    private Integer furniture; // мебель
    private Integer floorType; // тип пола
    private Boolean isDormitory; // Общежитие

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Integer priceUnit) {
        this.priceUnit = priceUnit;
    }

    public Integer getRentPeriodType() {
        return rentPeriodType;
    }

    public void setRentPeriodType(Integer rentPeriodType) {
        this.rentPeriodType = rentPeriodType;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Integer getCondition() {
        return condition;
    }

    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    public Integer getTelephoneFacility() {
        return telephoneFacility;
    }

    public void setTelephoneFacility(Integer telephoneFacility) {
        this.telephoneFacility = telephoneFacility;
    }

    public Integer getBathroomType() {
        return bathroomType;
    }

    public void setBathroomType(Integer bathroomType) {
        this.bathroomType = bathroomType;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public Double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public Boolean getPledged() {
        return isPledged;
    }

    public void setPledged(Boolean pledged) {
        isPledged = pledged;
    }

    public Integer getInternetType() {
        return internetType;
    }

    public void setInternetType(Integer internetType) {
        this.internetType = internetType;
    }

    public Integer getCanalizationType() {
        return canalizationType;
    }

    public void setCanalizationType(Integer canalizationType) {
        this.canalizationType = canalizationType;
    }

    public Integer getWaterSupplyType() {
        return waterSupplyType;
    }

    public void setWaterSupplyType(Integer waterSupplyType) {
        this.waterSupplyType = waterSupplyType;
    }

    public Integer getElectricityType() {
        return electricityType;
    }

    public void setElectricityType(Integer electricityType) {
        this.electricityType = electricityType;
    }

    public Integer getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(Integer heatingType) {
        this.heatingType = heatingType;
    }

    public Integer getGasSupplyType() {
        return gasSupplyType;
    }

    public void setGasSupplyType(Integer gasSupplyType) {
        this.gasSupplyType = gasSupplyType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOtherProp() {
        return otherProp;
    }

    public void setOtherProp(String otherProp) {
        this.otherProp = otherProp;
    }

    public Integer getWallType() {
        return wallType;
    }

    public void setWallType(Integer wallType) {
        this.wallType = wallType;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(Integer yearBuild) {
        this.yearBuild = yearBuild;
    }

    public Integer getStorey() {
        return storey;
    }

    public void setStorey(Integer storey) {
        this.storey = storey;
    }

    public Integer getStoreysNumber() {
        return storeysNumber;
    }

    public void setStoreysNumber(Integer storeysNumber) {
        this.storeysNumber = storeysNumber;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(Double livingArea) {
        this.livingArea = livingArea;
    }

    public Double getKitchenArea() {
        return kitchenArea;
    }

    public void setKitchenArea(Double kitchenArea) {
        this.kitchenArea = kitchenArea;
    }

    public Integer getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(Integer balconyType) {
        this.balconyType = balconyType;
    }

    public Boolean getGlassBalcony() {
        return isGlassBalcony;
    }

    public void setGlassBalcony(Boolean glassBalcony) {
        isGlassBalcony = glassBalcony;
    }

    public Integer getDoorType() {
        return doorType;
    }

    public void setDoorType(Integer doorType) {
        this.doorType = doorType;
    }

    public Integer getParkingType() {
        return parkingType;
    }

    public void setParkingType(Integer parkingType) {
        this.parkingType = parkingType;
    }

    public Integer getFurniture() {
        return furniture;
    }

    public void setFurniture(Integer furniture) {
        this.furniture = furniture;
    }

    public Integer getFloorType() {
        return floorType;
    }

    public void setFloorType(Integer floorType) {
        this.floorType = floorType;
    }

    public Boolean getDormitory() {
        return isDormitory;
    }

    public void setDormitory(Boolean dormitory) {
        isDormitory = dormitory;
    }
}
