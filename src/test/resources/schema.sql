CREATE TABLE AccessLevel
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(50)
);
CREATE TABLE Acts
(
    id BIGINT PRIMARY KEY  auto_increment,
    code VARCHAR(50),
    date DATE,
    surveyDate DATE,
    purpose VARCHAR(1000),
    docsList VARCHAR(1000),
    actualUsage VARCHAR(1000),
    possibleCommercialUsage VARCHAR(1000),
    uzoMarketPrice FLOAT,
    uzoMarketPricePerSquareMeter FLOAT,
    objectsId BIGINT,
    regionName VARCHAR(1000),
    riskFreeInterestRate FLOAT,
    productionInvestmentRiskCorrection FLOAT,
    inefficientManagementCorrection FLOAT,
    lowLiquidityCorrection FLOAT,
    capitalReturnRate FLOAT,
    VAT FLOAT,
    roomMaintainingCostMin FLOAT,
    roomMaintainingCostMax FLOAT,
    CIT FLOAT,
    simplifiedTaxSystem BIT,
    uzoIncomeMethodPrice FLOAT,
    uzoIncomeMethodPriceReliability FLOAT,
    uzoMarketPriceReliability FLOAT,
    approverId BIGINT,
    doerId BIGINT
);
CREATE TABLE Address
(
    id BIGINT PRIMARY KEY ,
    addressName VARCHAR(1000),
    lat FLOAT,
    lon FLOAT,
    region BIGINT,
    addressPrecision BIGINT
);
CREATE TABLE AddressPrecision
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE AdvertType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE AnalyticalCalculationAnalogs
(
    id BIGINT PRIMARY KEY  auto_increment,
    apartmentAdsId BIGINT,
    houseAdsId BIGINT,
    commercialEstateAdsId BIGINT,
    landAdsId BIGINT,
    objectId BIGINT
);
CREATE TABLE AnalyticalCalculations
(
    id BIGINT PRIMARY KEY  auto_increment,
    date DATE,
    note VARCHAR(1000),
    uzoMarketPriceSM FLOAT,
    uzoMarketPrice FLOAT,
    creditId BIGINT,
    calculatedPriceSM FLOAT
);
CREATE TABLE ApartmentAds
(
    id BIGINT PRIMARY KEY  auto_increment,
    source BIGINT ,
    advertType BIGINT ,
    wallType BIGINT,
    bathroomType BIGINT,
    telephoneFacility BIGINT,
    condition BIGINT,
    internetType BIGINT,
    parkingType BIGINT,
    doorType BIGINT,
    furniture BIGINT,
    floorType BIGINT,
    balconyType BIGINT,
    ceilingHeight FLOAT,
    roomCount INT,
    phoneNumber VARCHAR(1000),
    price FLOAT ,
    storey INT,
    storeysNumber INT,
    area FLOAT,
    livingArea FLOAT,
    kitchenArea FLOAT,
    isPledged BIT,
    isDormitory BIT,
    isGlassBalcony BIT,
    yearBuilt INT,
    description VARCHAR(1000),
    security VARCHAR(1000),
    otherProp VARCHAR(1000),
    createDate DATE,
    pageId BIGINT,
    link VARCHAR(1000),
    region BIGINT,
    lat FLOAT,
    lon FLOAT,
    addressName VARCHAR(1000),
    priceUnit BIGINT,
    isAnalog BIT,
    rentPeriodType BIGINT
);
CREATE TABLE AuthUser
(
    id BIGINT PRIMARY KEY  auto_increment,
    accessLevel BIGINT,
    name VARCHAR(1000),
    surname VARCHAR(1000),
    login VARCHAR(1000),
    password VARCHAR(1000),
    documentologUID VARCHAR(100),
    position VARCHAR(300),
    patronymic VARCHAR(1000)
);
CREATE TABLE BalconyType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE BathroomFloorType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE BathroomType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE BathroomWallFacingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE CalculationMethodType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE CanalizationType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE CeilingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE ColdWaterSupplyType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE CommercialEstateAds
(
    id BIGINT PRIMARY KEY  auto_increment,
    commercialEstateType BIGINT,
    roomCount INT,
    price FLOAT,
    priceUnit BIGINT,
    isPledged BIT,
    buildingType BIGINT,
    bussinessCenterName VARCHAR(1000),
    area FLOAT,
    hallArea FLOAT,
    productionRoomArea FLOAT,
    warehouseSpaceArea FLOAT,
    officeSpaceArea FLOAT,
    storeysNumber INT,
    storey INT,
    landArea FLOAT,
    yearBuilt INT,
    condition BIGINT,
    wallType BIGINT,
    ceilingHeight FLOAT,
    heatingType BIGINT,
    waterSupplyType BIGINT,
    communications VARCHAR(1000),
    description VARCHAR(1000),
    security VARCHAR(1000),
    otherProp VARCHAR(1000),
    createDate DATE,
    pageId BIGINT,
    link VARCHAR(1000),
    phoneNumber VARCHAR(50),
    isAnalog BIT,
    advertType BIGINT,
    region BIGINT,
    lat FLOAT,
    lon FLOAT,
    addressName VARCHAR(1000),
    source BIGINT,
    internetType BIGINT,
    rentPeriodType BIGINT
);
CREATE TABLE CommercialEstateBuildingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE CommercialEstateType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE Conclusions
(
    id BIGINT PRIMARY KEY  auto_increment,
    code VARCHAR(50),
    date DATE,
    purpose VARCHAR(1000),
    reportNumber VARCHAR(50),
    reportDate DATE,
    estimator VARCHAR(1000),
    estimationClient VARCHAR(1000),
    surveyDate DATE,
    uzoSurveyDate DATE,
    actualUsage VARCHAR(1000),
    possibleCommercialUsage VARCHAR(1000),
    note VARCHAR(1000),
    docsList VARCHAR(1000),
    meetsDesignRequirements BIT,
    meetsDescriptionPartRequirements BIT,
    meetsCalculationPartRequirements BIT,
    meetsConclusionPartRequirements BIT,
    meetsPhotoMaterialRequirements BIT,
    hasMarketMethod BIT,
    hasIncomeMethod BIT,
    hasExpenseMethod BIT,
    isMarketMethodUseValid BIT,
    isIncomeMethodUseValid BIT,
    isExpenseMethodUseValid BIT,
    isMarketMethodCalculationValid BIT,
    isIncomeMethodCalculationValid BIT,
    isExpenseMethodCalculationValid BIT,
    hasTraditionalMethods BIT,
    isCalculationValid BIT,
    marketMethodValue FLOAT,
    incomeMethodValue FLOAT,
    expenseMethodValue FLOAT,
    reportMarketPrice FLOAT,
    reportMarketPricePerSquareMeter FLOAT,
    uzoMarketPrice FLOAT,
    uzoMarketPricePerSquareMeter FLOAT,
    difference FLOAT,
    isEstimationAdequate BIT,
    designRequirementsRemarks VARCHAR(1000),
    descriptionPartRequirementsRemarks VARCHAR(1000),
    calculationPartRequirementsRemarks VARCHAR(1000),
    conclusionPartRequirementsRemarks VARCHAR(1000),
    photoMaterialRequirementsRemarks VARCHAR(1000),
    acceptedMarketPrice FLOAT,
    objectsId BIGINT,
    doerId BIGINT,
    approverId BIGINT,
    traditionalMethodValue FLOAT,
    regionName VARCHAR(1000)
);
CREATE TABLE Condition
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE ConditionType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE CorrectionCoefs
(
    id BIGINT PRIMARY KEY  auto_increment,
    conclusionId BIGINT,
    apartmentAdsId BIGINT,
    sellingConditionCorrection FLOAT,
    placementCorrection FLOAT,
    techConditionCorrection FLOAT,
    facingCorrection FLOAT,
    areaCorrection FLOAT,
    storeyCorrection FLOAT,
    designCorrection FLOAT,
    engineeringSupplyCorrection FLOAT,
    actId BIGINT,
    houseAdsId BIGINT,
    commercialEstateAdsId BIGINT,
    landAdsId BIGINT,
    calculationMethodType BIGINT,
    beautificationCorrection FLOAT,
    claimsPurchaseMemosId BIGINT,
    preCostMemosId BIGINT,
    purposeCorrection FLOAT
);
CREATE TABLE CoveringType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE Credits
(
    id BIGINT PRIMARY KEY  auto_increment,
    creditId BIGINT,
    creditAgreementNumber VARCHAR(100),
    creditAgreementDate DATE,
    borrower VARCHAR(1000),
    outerObjectId BIGINT,
    status BIT
);
CREATE TABLE DivisibilityType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE DoorType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE ElectricityType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE EntranceDoorType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE EstateType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE EstateTypeMapping
(
    id BIGINT PRIMARY KEY  auto_increment,
    estateType BIGINT,
    outerEstateType BIGINT
);
CREATE TABLE FloorType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE FoundationType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE FrameType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE Furniture
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE GasSupplyType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE HeatingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE HotWaterSupplyType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE HouseAds
(
    id BIGINT PRIMARY KEY  auto_increment,
    source BIGINT ,
    advertType BIGINT ,
    ownershipType BIGINT,
    wallType BIGINT,
    houseType BIGINT,
    yearBuilt INT,
    levelNumber INT,
    area FLOAT,
    livingArea FLOAT,
    kitchenArea FLOAT,
    landAreaHundredthHa FLOAT,
    condition BIGINT,
    telephoneFacility BIGINT,
    internetType BIGINT,
    bathroomType BIGINT,
    canalizationType BIGINT,
    waterSupplyType BIGINT,
    electricityType BIGINT,
    heatingType BIGINT,
    gasSupplyType BIGINT,
    ceilingHeight FLOAT,
    roomCount INT,
    price FLOAT ,
    isPledged BIT,
    description VARCHAR(1000),
    security VARCHAR(1000),
    otherProp VARCHAR(1000),
    createDate DATE,
    pageId BIGINT,
    link VARCHAR(1000),
    phoneNumber VARCHAR(50),
    priceUnit BIGINT,
    isAnalog BIT,
    region BIGINT,
    lat FLOAT,
    lon FLOAT,
    addressName VARCHAR(1000)
);
CREATE TABLE HouseType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE Images
(
    id BIGINT PRIMARY KEY  auto_increment,
    objectsId BIGINT,
    path VARCHAR(1000)
);
CREATE TABLE InteriorDoorType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE InternetType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE LandAds
(
    id BIGINT PRIMARY KEY  auto_increment,
    source BIGINT,
    advertType BIGINT,
    ownershipType BIGINT,
    isPledged BIT,
    area FLOAT,
    divisibilityType BIGINT,
    communications VARCHAR(1000),
    placement VARCHAR(1000),
    purpose VARCHAR(1000),
    price FLOAT ,
    phoneNumber VARCHAR(50),
    description VARCHAR(1000),
    otherProp VARCHAR(1000),
    createDate DATE,
    pageId BIGINT,
    link VARCHAR(1000),
    priceUnit BIGINT,
    relievoType BIGINT,
    isAnalog BIT,
    region BIGINT,
    lat FLOAT,
    lon FLOAT,
    addressName VARCHAR(1000)
);
CREATE TABLE LandOwnershipType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE LayoutType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(50)
);
CREATE TABLE Objects
(
    id BIGINT PRIMARY KEY  auto_increment,
    owner VARCHAR(1000),
    name VARCHAR(1000),
    placement VARCHAR(1000),
    area FLOAT,
    livingArea FLOAT,
    kitchenArea FLOAT,
    roomCount INT,
    rooms VARCHAR(1000),
    yearBuilt INT,
    storeysNumber INT,
    storey INT,
    wallType BIGINT,
    floorType BIGINT,
    bathroomFloorType BIGINT,
    wallFacingType BIGINT,
    bathroomWallFacingType BIGINT,
    ceilingType BIGINT,
    doorType BIGINT,
    entranceDoorType BIGINT,
    windowType BIGINT,
    condition VARCHAR(1000),
    isCentralCommunication BIT,
    electricityType BIGINT,
    heatingType BIGINT,
    coldWaterSupplyType BIGINT,
    hotWaterSupplyType BIGINT,
    gasSupplyType BIGINT,
    canalizationType BIGINT,
    formalAddress VARCHAR(1000),
    estateType BIGINT,
    effectiveArea FLOAT,
    landOwnershipType BIGINT,
    landAreaHundredthHa FLOAT,
    ceilingHeight FLOAT,
    spaceCount INT,
    outerFacingType BIGINT,
    interiorDoorType BIGINT,
    landLeasePeriod FLOAT,
    shareAreaHundredthHa FLOAT,
    cadastralNum VARCHAR(1000),
    landPurpose VARCHAR(1000),
    divisibilityType BIGINT,
    relievoType BIGINT,
    territoryType BIGINT,
    additionalBuildings VARCHAR(1000),
    region BIGINT,
    lat FLOAT,
    lon FLOAT,
    addressName VARCHAR(1000),
    isPledged BIT,
    borrower VARCHAR(1000),
    mortgagor VARCHAR(1000),
    creditID BIGINT,
    layoutType BIGINT,
    repairAge VARCHAR(1000),
    repairType BIGINT,
    illegalReplanning BIT,
    illegalReplanningNote VARCHAR(1000),
    foundationType BIGINT,
    foundationConditionType BIGINT,
    foundationConditionNote VARCHAR(1000),
    frameType BIGINT,
    frameConditionType BIGINT,
    frameConditionNote VARCHAR(1000),
    wallConditionType BIGINT,
    wallConditionNote VARCHAR(1000),
    coveringType BIGINT,
    coveringConditionType BIGINT,
    coveringConditionNote VARCHAR(1000),
    balconyType BIGINT,
    balconyConditionType BIGINT,
    balconyConditionNote VARCHAR(1000),
    roofType BIGINT,
    roofConditionType BIGINT,
    roofConditionNote VARCHAR(1000),
    floorConditionType BIGINT,
    floorConditionNote VARCHAR(1000),
    bathroomFloorConditionType BIGINT,
    bathroomFloorConditionNote VARCHAR(1000),
    wallFacingConditionType BIGINT,
    wallFacingConditionNote VARCHAR(1000),
    bathroomWallFacingConditionType BIGINT,
    bathroomWallFacingConditionNote VARCHAR(1000),
    ceilingConditionType BIGINT,
    ceilingConditionNote VARCHAR(1000),
    interiorDoorConditionType BIGINT,
    interiorDoorConditionNote VARCHAR(1000),
    entranceDoorConditionType BIGINT,
    entranceDoorConditionNote VARCHAR(1000),
    windowConditionType BIGINT,
    windowConditionNote VARCHAR(1000),
    plumbingEquipment VARCHAR(1000),
    plumbingEquipmentConditionType BIGINT,
    plumbingEquipmentConditionNote VARCHAR(1000),
    spaceCountDescription VARCHAR(1000),
    note VARCHAR(1000),
    mortgageContractNumber VARCHAR(1000),
    mortgageContractDate DATE,
    outerFacingConditionType BIGINT,
    outerFacingConditionNote VARCHAR(1000),
    outerId BIGINT,
    outerEstateType BIGINT,
    foundAddressName VARCHAR(1000)
);
CREATE TABLE ObjectsLevels
(
    id BIGINT PRIMARY KEY  auto_increment,
    objectId BIGINT,
    constructionName VARCHAR(1000),
    roomsName VARCHAR(1000),
    levelName VARCHAR(1000),
    area FLOAT,
    livingArea FLOAT,
    priceCorrection FLOAT,
    levelNumber INT,
    spacesDescription VARCHAR(1000),
    underloadCoeff FLOAT,
    noVATCosts FLOAT
);
CREATE TABLE OuterEstateType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(200),
    sellingCorrection FLOAT
);
CREATE TABLE OuterFacingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE ParkingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE PreCostMemos
(
    id BIGINT PRIMARY KEY  auto_increment,
    code NVARCHAR(50),
    date DATE,
    reg_number NVARCHAR(50),
    reg_date DATE,
    reg_name NVARCHAR(200),
    requestPurpose NVARCHAR(1000),
    actualUsage NVARCHAR(1000),
    possibleCommercialUsage NVARCHAR(1000),
    uzoMarketPrice FLOAT,
    uzoMarketPricePerSquareMeter FLOAT,
    objectsId BIGINT,
    doerId BIGINT,
    approverId BIGINT
);
CREATE TABLE PriceUnit
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE Region
(
    id BIGINT PRIMARY KEY  auto_increment,
    codKATO VARCHAR(1000),
    name VARCHAR(1000),
    fullName VARCHAR(1000),
    ord BIGINT,
    lat FLOAT,
    lon FLOAT,
    parent BIGINT,
    krishaLink VARCHAR(1000)
);
CREATE TABLE RelievoType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE RentPeriodType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE RepairType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE RoofType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE RoomType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE Source
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000),
    url VARCHAR(1000)
);
CREATE TABLE SurveyDataAdverts
(
    id BIGINT PRIMARY KEY  auto_increment,
    surveysDataPriceId BIGINT,
    apartmentAdsId BIGINT,
    houseAdsId BIGINT,
    commercialEstateAdsId BIGINT
);
CREATE TABLE SurveyType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE Surveys
(
    id BIGINT PRIMARY KEY  auto_increment,
    periodName VARCHAR(1000),
    dateEnd DATE,
    createDate DATE,
    name VARCHAR(1000),
    dateBegin DATE
);
CREATE TABLE SurveysData
(
    id BIGINT PRIMARY KEY  auto_increment,
    surveysId BIGINT,
    regionId BIGINT,
    district BIGINT
);
CREATE TABLE SurveysDataPrice
(
    id BIGINT PRIMARY KEY  auto_increment,
    surveysDataId BIGINT,
    surveyType BIGINT,
    roomNumber INT,
    price FLOAT
);
CREATE TABLE TelephoneFacility
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE TerritoryType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE WallFacingType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000) 
);
CREATE TABLE WallType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE WindowType
(
    id BIGINT PRIMARY KEY  auto_increment,
    name VARCHAR(1000)
);
CREATE TABLE claimsPurchaseMemos
(
    id BIGINT PRIMARY KEY  auto_increment,
    code NVARCHAR(50),
    reg_number NVARCHAR(50),
    reg_date NVARCHAR(50),
    date DATE,
    reg_name NVARCHAR(200),
    requestPurpose NVARCHAR(1000),
    reportMarketPrice FLOAT,
    actualUsage NVARCHAR(1000),
    possibleCommercialUsage NVARCHAR(1000),
    note NVARCHAR(1000),
    uzoMarketPrice FLOAT,
    uzoMarketPricePerSquareMeter FLOAT,
    difference FLOAT,
    acceptedMarketPrice FLOAT,
    objectsId BIGINT,
    doerId BIGINT,
    approverId BIGINT,
    isEstimationAdequate BIT
);
ALTER TABLE Acts ADD FOREIGN KEY (objectsId) REFERENCES Objects (id);
ALTER TABLE Address ADD FOREIGN KEY (region) REFERENCES Region (id);
ALTER TABLE Address ADD FOREIGN KEY (addressPrecision) REFERENCES AddressPrecision (id);
ALTER TABLE AnalyticalCalculationAnalogs ADD FOREIGN KEY (apartmentAdsId) REFERENCES ApartmentAds (id);
ALTER TABLE AnalyticalCalculationAnalogs ADD FOREIGN KEY (houseAdsId) REFERENCES HouseAds (id);
ALTER TABLE AnalyticalCalculationAnalogs ADD FOREIGN KEY (commercialEstateAdsId) REFERENCES CommercialEstateAds (id);
ALTER TABLE AnalyticalCalculationAnalogs ADD FOREIGN KEY (landAdsId) REFERENCES LandAds (id);
ALTER TABLE AnalyticalCalculationAnalogs ADD FOREIGN KEY (objectId) REFERENCES Objects (id);
ALTER TABLE AnalyticalCalculations ADD FOREIGN KEY (creditId) REFERENCES Credits (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (source) REFERENCES Source (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (advertType) REFERENCES AdvertType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (wallType) REFERENCES WallType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (bathroomType) REFERENCES BathroomType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (telephoneFacility) REFERENCES TelephoneFacility (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (condition) REFERENCES Condition (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (internetType) REFERENCES InternetType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (parkingType) REFERENCES ParkingType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (doorType) REFERENCES DoorType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (furniture) REFERENCES Furniture (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (floorType) REFERENCES FloorType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (balconyType) REFERENCES BalconyType (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (region) REFERENCES Region (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (priceUnit) REFERENCES PriceUnit (id);
ALTER TABLE ApartmentAds ADD FOREIGN KEY (rentPeriodType) REFERENCES RentPeriodType (id);
ALTER TABLE AuthUser ADD FOREIGN KEY (accessLevel) REFERENCES AccessLevel (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (commercialEstateType) REFERENCES CommercialEstateType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (priceUnit) REFERENCES PriceUnit (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (buildingType) REFERENCES CommercialEstateBuildingType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (wallType) REFERENCES WallType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (heatingType) REFERENCES HeatingType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (waterSupplyType) REFERENCES ColdWaterSupplyType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (advertType) REFERENCES AdvertType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (region) REFERENCES Region (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (source) REFERENCES Source (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (internetType) REFERENCES InternetType (id);
ALTER TABLE CommercialEstateAds ADD FOREIGN KEY (rentPeriodType) REFERENCES RentPeriodType (id);
ALTER TABLE Conclusions ADD FOREIGN KEY (objectsId) REFERENCES Objects (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (id) REFERENCES CorrectionCoefs (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (conclusionId) REFERENCES Conclusions (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (apartmentAdsId) REFERENCES ApartmentAds (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (actId) REFERENCES Acts (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (houseAdsId) REFERENCES HouseAds (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (commercialEstateAdsId) REFERENCES CommercialEstateAds (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (landAdsId) REFERENCES LandAds (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (calculationMethodType) REFERENCES CalculationMethodType (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (claimsPurchaseMemosId) REFERENCES claimsPurchaseMemos (id);
ALTER TABLE CorrectionCoefs ADD FOREIGN KEY (preCostMemosId) REFERENCES PreCostMemos (id);
ALTER TABLE EstateTypeMapping ADD FOREIGN KEY (estateType) REFERENCES EstateType (id);
ALTER TABLE EstateTypeMapping ADD FOREIGN KEY (outerEstateType) REFERENCES OuterEstateType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (source) REFERENCES Source (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (advertType) REFERENCES AdvertType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (ownershipType) REFERENCES LandOwnershipType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (wallType) REFERENCES WallType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (houseType) REFERENCES HouseType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (condition) REFERENCES Condition (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (telephoneFacility) REFERENCES TelephoneFacility (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (internetType) REFERENCES InternetType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (bathroomType) REFERENCES BathroomType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (canalizationType) REFERENCES CanalizationType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (waterSupplyType) REFERENCES ColdWaterSupplyType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (electricityType) REFERENCES ElectricityType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (heatingType) REFERENCES HeatingType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (gasSupplyType) REFERENCES GasSupplyType (id);
ALTER TABLE HouseAds ADD FOREIGN KEY (priceUnit) REFERENCES PriceUnit (id);
ALTER TABLE Images ADD FOREIGN KEY (objectsId) REFERENCES Objects (id);
ALTER TABLE LandAds ADD FOREIGN KEY (source) REFERENCES Source (id);
ALTER TABLE LandAds ADD FOREIGN KEY (advertType) REFERENCES AdvertType (id);
ALTER TABLE LandAds ADD FOREIGN KEY (ownershipType) REFERENCES LandOwnershipType (id);
ALTER TABLE LandAds ADD FOREIGN KEY (divisibilityType) REFERENCES DivisibilityType (id);
ALTER TABLE LandAds ADD FOREIGN KEY (priceUnit) REFERENCES PriceUnit (id);
ALTER TABLE LandAds ADD FOREIGN KEY (relievoType) REFERENCES RelievoType (id);
ALTER TABLE LandAds ADD FOREIGN KEY (region) REFERENCES Region (id);
ALTER TABLE Objects ADD FOREIGN KEY (id) REFERENCES Objects (id);
ALTER TABLE Objects ADD FOREIGN KEY (id) REFERENCES Objects (id);
ALTER TABLE Objects ADD FOREIGN KEY (wallType) REFERENCES WallType (id);
ALTER TABLE Objects ADD FOREIGN KEY (floorType) REFERENCES FloorType (id);
ALTER TABLE Objects ADD FOREIGN KEY (bathroomFloorType) REFERENCES BathroomFloorType (id);
ALTER TABLE Objects ADD FOREIGN KEY (wallFacingType) REFERENCES WallFacingType (id);
ALTER TABLE Objects ADD FOREIGN KEY (bathroomWallFacingType) REFERENCES BathroomWallFacingType (id);
ALTER TABLE Objects ADD FOREIGN KEY (ceilingType) REFERENCES CeilingType (id);
ALTER TABLE Objects ADD FOREIGN KEY (doorType) REFERENCES DoorType (id);
ALTER TABLE Objects ADD FOREIGN KEY (entranceDoorType) REFERENCES EntranceDoorType (id);
ALTER TABLE Objects ADD FOREIGN KEY (windowType) REFERENCES WindowType (id);
ALTER TABLE Objects ADD FOREIGN KEY (electricityType) REFERENCES ElectricityType (id);
ALTER TABLE Objects ADD FOREIGN KEY (heatingType) REFERENCES HeatingType (id);
ALTER TABLE Objects ADD FOREIGN KEY (coldWaterSupplyType) REFERENCES ColdWaterSupplyType (id);
ALTER TABLE Objects ADD FOREIGN KEY (hotWaterSupplyType) REFERENCES HotWaterSupplyType (id);
ALTER TABLE Objects ADD FOREIGN KEY (gasSupplyType) REFERENCES GasSupplyType (id);
ALTER TABLE Objects ADD FOREIGN KEY (canalizationType) REFERENCES CanalizationType (id);
ALTER TABLE Objects ADD FOREIGN KEY (estateType) REFERENCES EstateType (id);
ALTER TABLE Objects ADD FOREIGN KEY (landOwnershipType) REFERENCES LandOwnershipType (id);
ALTER TABLE Objects ADD FOREIGN KEY (outerFacingType) REFERENCES OuterFacingType (id);
ALTER TABLE Objects ADD FOREIGN KEY (interiorDoorType) REFERENCES InteriorDoorType (id);
ALTER TABLE Objects ADD FOREIGN KEY (divisibilityType) REFERENCES DivisibilityType (id);
ALTER TABLE Objects ADD FOREIGN KEY (relievoType) REFERENCES RelievoType (id);
ALTER TABLE Objects ADD FOREIGN KEY (territoryType) REFERENCES TerritoryType (id);
ALTER TABLE Objects ADD FOREIGN KEY (region) REFERENCES Region (id);
ALTER TABLE Objects ADD FOREIGN KEY (layoutType) REFERENCES LayoutType (id);
ALTER TABLE Objects ADD FOREIGN KEY (repairType) REFERENCES RepairType (id);
ALTER TABLE Objects ADD FOREIGN KEY (foundationType) REFERENCES FoundationType (id);
ALTER TABLE Objects ADD FOREIGN KEY (foundationConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (frameType) REFERENCES FrameType (id);
ALTER TABLE Objects ADD FOREIGN KEY (frameConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (wallConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (coveringType) REFERENCES CoveringType (id);
ALTER TABLE Objects ADD FOREIGN KEY (coveringConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (balconyType) REFERENCES BalconyType (id);
ALTER TABLE Objects ADD FOREIGN KEY (balconyConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (roofType) REFERENCES RoofType (id);
ALTER TABLE Objects ADD FOREIGN KEY (roofConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (floorConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (bathroomFloorConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (wallFacingConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (bathroomWallFacingConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (ceilingConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (interiorDoorConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (entranceDoorConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (windowConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (plumbingEquipmentConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (outerFacingConditionType) REFERENCES ConditionType (id);
ALTER TABLE Objects ADD FOREIGN KEY (outerEstateType) REFERENCES OuterEstateType (id);
ALTER TABLE ObjectsLevels ADD FOREIGN KEY (objectId) REFERENCES Objects (id);
ALTER TABLE PreCostMemos ADD FOREIGN KEY (objectsId) REFERENCES Objects (id);
ALTER TABLE PreCostMemos ADD FOREIGN KEY (doerId) REFERENCES AuthUser (id);
ALTER TABLE PreCostMemos ADD FOREIGN KEY (approverId) REFERENCES AuthUser (id);
ALTER TABLE Region ADD FOREIGN KEY (parent) REFERENCES Region (id);
ALTER TABLE SurveyDataAdverts ADD FOREIGN KEY (surveysDataPriceId) REFERENCES SurveysDataPrice (id);
ALTER TABLE SurveysData ADD FOREIGN KEY (surveysId) REFERENCES Surveys (id);
ALTER TABLE SurveysData ADD FOREIGN KEY (regionId) REFERENCES Region (id);
ALTER TABLE SurveysData ADD FOREIGN KEY (district) REFERENCES Region (id);
ALTER TABLE SurveysDataPrice ADD FOREIGN KEY (surveysDataId) REFERENCES SurveysData (id);
ALTER TABLE SurveysDataPrice ADD FOREIGN KEY (surveyType) REFERENCES SurveyType (id);
ALTER TABLE claimsPurchaseMemos ADD FOREIGN KEY (objectsId) REFERENCES Objects (id);
ALTER TABLE claimsPurchaseMemos ADD FOREIGN KEY (doerId) REFERENCES AuthUser (id);
ALTER TABLE claimsPurchaseMemos ADD FOREIGN KEY (approverId) REFERENCES AuthUser (id);
