package com.blog.example.CreatePDF.dto;



import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;


public class Book {

    private long CO_ContractID_Group;

    private long CO_ContractID_Indiv;

    private String ID_StartDate;

    private int PL_PlanID;

    private String IV_InvoiceDate;

    private String IV_PeriodStart;

    private String IV_PeriodEnd;

    private String OP_Description;

    private double IV_Total;

    private String OP_ExternalDescription;

    private String PL_Description;

    private String IN_FirstName;

    private String IN_LastName;

    private String GR_CompanyName;

    private String AD_AddressLine1;
    @Null
    private String AD_AddressLine2;

    private String AD_City;

    private String AD_PostalCode;

    private String PV_Abbreviation;

    private String CF_Description;

    private int OY_OptionTypeID;

    private int BF_FrequencyID;

    private String AGT1;

    private String ProvOfResidence;

    private int GPT_PlanTypeID;

    private String OnSupplemental;

    private double SUMIndHealth;

    private double SUMIndDental;

    private double SUMIndLife;

    private double SUMIndADPremium;

    private double SUMIndOptLife;

    private double SUMIndDepLife;

    private double SUMIndDepOptLife;

    private double SUMIndWI;

    private double SUMIndLTD;

    private double SUMIndCritIllness;

    private double SUMIndOptADD;

    private double SUMIndStopLoss;

    private double SUMIndHealthVol;

    private double SUMIndDentalVol;

    private double SUMIndLifeVol;

    private double SUMIndADDVol;

    private double SUMIndOptLifeVol;

    private double SUMIndDepLifeVol;

    private double SUMIndOptDepLifeVol;

    private double SUMIndWIVol;

    private double SUMIndLTDVol;

    private double SUMIndCritVol;

    private double SUMIndOptADDVol;

    private double SUMIndStopLossVol;

    private double SUMHealth;

    private double SUMDental;

    private double SUMLifePremium;




    private double SUMADPremium;

    private double SUMOptLife;

    private double SUMDepLife;

    private double SUMDepOptLife;

    private double SUMWI;

    private double SUMLTD;

    private double SUMCriticalIllness;

    private double SUMOptADD;

    private double SUMStopLoss;

    private double OSInvoiceAmount;

    private double OSSalesTaxes;

    private long InvoiceID;

    private double PAPFee;

    private double OSSuppInvoiceAmount;

    private double SuppInvoiceAmount;

    private int ContractAccount;

    private int PaymentType;

    private String AGT2;

    private int Age;

    private int NoOfLives;

    private int HealthCount;

    private int DentalCount;

    private int LifeCount;

    private int ADDCount;

    private int DepLifeCount;

    private int OptLifeCount;

    private int OptDepLifeCount;

    private int WICount;

    private int LTDCount;

    private int CritCount;

    private int OptADDCount;

    private int StopLossCount;

    private BigInteger HealthVol;

    private BigInteger DentalVol;

    private BigInteger LifeVol;

    private BigInteger ADDVol;

    private BigInteger OptLifeVol;

    private BigInteger DepLifeVol;

    private BigInteger DepOptLifeVol;

    private BigInteger WIVol;

    private BigInteger LTDVol;

    private BigInteger CriticalIllnessVol;

    private BigInteger OptADDVol;

    private BigInteger StopLossVol;

    private int AccountID;

    private double GST;

    private int PST;

    private int OtherTax;

    private int ThirdPartyGST;

    private int ThirdPartyPST;

    private int ThirdPartyOtherTax;

    private double DiscountAmount;

    private int CompanyID;

    public long getCO_ContractID_Group() {
        return CO_ContractID_Group;
    }

    public void setCO_ContractID_Group(long CO_ContractID_Group) {
        this.CO_ContractID_Group = CO_ContractID_Group;
    }

    public long getCO_ContractID_Indiv() {
        return CO_ContractID_Indiv;
    }

    public void setCO_ContractID_Indiv(long CO_ContractID_Indiv) {
        this.CO_ContractID_Indiv = CO_ContractID_Indiv;
    }

    public String getID_StartDate() {
        return ID_StartDate;
    }

    public void setID_StartDate(String ID_StartDate) {
        this.ID_StartDate = ID_StartDate;
    }

    public int getPL_PlanID() {
        return PL_PlanID;
    }

    public void setPL_PlanID(int PL_PlanID) {
        this.PL_PlanID = PL_PlanID;
    }

    public String getIV_InvoiceDate() {
        return IV_InvoiceDate;
    }

    public void setIV_InvoiceDate(String IV_InvoiceDate) {
        this.IV_InvoiceDate = IV_InvoiceDate;
    }

    public String getIV_PeriodStart() {
        return IV_PeriodStart;
    }

    public void setIV_PeriodStart(String IV_PeriodStart) {
        this.IV_PeriodStart = IV_PeriodStart;
    }

    public String getIV_PeriodEnd() {
        return IV_PeriodEnd;
    }

    public void setIV_PeriodEnd(String IV_PeriodEnd) {
        this.IV_PeriodEnd = IV_PeriodEnd;
    }

    public String getOP_Description() {
        return OP_Description;
    }

    public void setOP_Description(String OP_Description) {
        this.OP_Description = OP_Description;
    }

    public double getIV_Total() {
        return IV_Total;
    }

    public void setIV_Total(double IV_Total) {
        this.IV_Total = IV_Total;
    }

    public String getOP_ExternalDescription() {
        return OP_ExternalDescription;
    }

    public void setOP_ExternalDescription(String OP_ExternalDescription) {
        this.OP_ExternalDescription = OP_ExternalDescription;
    }

    public String getPL_Description() {
        return PL_Description;
    }

    public void setPL_Description(String PL_Description) {
        this.PL_Description = PL_Description;
    }

    public String getIN_FirstName() {
        return IN_FirstName;
    }

    public void setIN_FirstName(String IN_FirstName) {
        this.IN_FirstName = IN_FirstName;
    }

    public String getIN_LastName() {
        return IN_LastName;
    }

    public void setIN_LastName(String IN_LastName) {
        this.IN_LastName = IN_LastName;
    }

    public String getGR_CompanyName() {
        return GR_CompanyName;
    }

    public void setGR_CompanyName(String GR_CompanyName) {
        this.GR_CompanyName = GR_CompanyName;
    }

    public String getAD_AddressLine1() {
        return AD_AddressLine1;
    }

    public void setAD_AddressLine1(String AD_AddressLine1) {
        this.AD_AddressLine1 = AD_AddressLine1;
    }

    public String getAD_AddressLine2() {
        return AD_AddressLine2;
    }

    public void setAD_AddressLine2(String AD_AddressLine2) {
        this.AD_AddressLine2 = AD_AddressLine2;
    }

    public String getAD_City() {
        return AD_City;
    }

    public void setAD_City(String AD_City) {
        this.AD_City = AD_City;
    }

    public String getAD_PostalCode() {
        return AD_PostalCode;
    }

    public void setAD_PostalCode(String AD_PostalCode) {
        this.AD_PostalCode = AD_PostalCode;
    }

    public String getPV_Abbreviation() {
        return PV_Abbreviation;
    }

    public void setPV_Abbreviation(String PV_Abbreviation) {
        this.PV_Abbreviation = PV_Abbreviation;
    }

    public String getCF_Description() {
        return CF_Description;
    }

    public void setCF_Description(String CF_Description) {
        this.CF_Description = CF_Description;
    }

    public int getOY_OptionTypeID() {
        return OY_OptionTypeID;
    }

    public void setOY_OptionTypeID(int OY_OptionTypeID) {
        this.OY_OptionTypeID = OY_OptionTypeID;
    }

    public int getBF_FrequencyID() {
        return BF_FrequencyID;
    }

    public void setBF_FrequencyID(int BF_FrequencyID) {
        this.BF_FrequencyID = BF_FrequencyID;
    }

    public String getAGT1() {
        return AGT1;
    }

    public void setAGT1(String AGT1) {
        this.AGT1 = AGT1;
    }

    public String getProvOfResidence() {
        return ProvOfResidence;
    }

    public void setProvOfResidence(String provOfResidence) {
        ProvOfResidence = provOfResidence;
    }

    public int getGPT_PlanTypeID() {
        return GPT_PlanTypeID;
    }

    public void setGPT_PlanTypeID(int GPT_PlanTypeID) {
        this.GPT_PlanTypeID = GPT_PlanTypeID;
    }

    public String getOnSupplemental() {
        return OnSupplemental;
    }

    public void setOnSupplemental(String onSupplemental) {
        OnSupplemental = onSupplemental;
    }

    public double getSUMIndHealth() {
        return SUMIndHealth;
    }

    public void setSUMIndHealth(double SUMIndHealth) {
        this.SUMIndHealth = SUMIndHealth;
    }

    public double getSUMIndDental() {
        return SUMIndDental;
    }

    public void setSUMIndDental(double SUMIndDental) {
        this.SUMIndDental = SUMIndDental;
    }

    public double getSUMIndLife() {
        return SUMIndLife;
    }

    public void setSUMIndLife(double SUMIndLife) {
        this.SUMIndLife = SUMIndLife;
    }

    public double getSUMIndADPremium() {
        return SUMIndADPremium;
    }

    public void setSUMIndADPremium(double SUMIndADPremium) {
        this.SUMIndADPremium = SUMIndADPremium;
    }

    public double getSUMIndOptLife() {
        return SUMIndOptLife;
    }

    public void setSUMIndOptLife(double SUMIndOptLife) {
        this.SUMIndOptLife = SUMIndOptLife;
    }

    public double getSUMIndDepLife() {
        return SUMIndDepLife;
    }

    public void setSUMIndDepLife(double SUMIndDepLife) {
        this.SUMIndDepLife = SUMIndDepLife;
    }

    public double getSUMIndDepOptLife() {
        return SUMIndDepOptLife;
    }

    public void setSUMIndDepOptLife(double SUMIndDepOptLife) {
        this.SUMIndDepOptLife = SUMIndDepOptLife;
    }

    public double getSUMIndWI() {
        return SUMIndWI;
    }

    public void setSUMIndWI(double SUMIndWI) {
        this.SUMIndWI = SUMIndWI;
    }

    public double getSUMIndLTD() {
        return SUMIndLTD;
    }

    public void setSUMIndLTD(double SUMIndLTD) {
        this.SUMIndLTD = SUMIndLTD;
    }

    public double getSUMIndCritIllness() {
        return SUMIndCritIllness;
    }

    public void setSUMIndCritIllness(double SUMIndCritIllness) {
        this.SUMIndCritIllness = SUMIndCritIllness;
    }

    public double getSUMIndOptADD() {
        return SUMIndOptADD;
    }

    public void setSUMIndOptADD(double SUMIndOptADD) {
        this.SUMIndOptADD = SUMIndOptADD;
    }

    public double getSUMIndStopLoss() {
        return SUMIndStopLoss;
    }

    public void setSUMIndStopLoss(double SUMIndStopLoss) {
        this.SUMIndStopLoss = SUMIndStopLoss;
    }

    public double getSUMIndHealthVol() {
        return SUMIndHealthVol;
    }

    public void setSUMIndHealthVol(double SUMIndHealthVol) {
        this.SUMIndHealthVol = SUMIndHealthVol;
    }

    public double getSUMIndDentalVol() {
        return SUMIndDentalVol;
    }

    public void setSUMIndDentalVol(double SUMIndDentalVol) {
        this.SUMIndDentalVol = SUMIndDentalVol;
    }

    public double getSUMIndLifeVol() {
        return SUMIndLifeVol;
    }

    public void setSUMIndLifeVol(double SUMIndLifeVol) {
        this.SUMIndLifeVol = SUMIndLifeVol;
    }

    public double getSUMIndADDVol() {
        return SUMIndADDVol;
    }

    public void setSUMIndADDVol(double SUMIndADDVol) {
        this.SUMIndADDVol = SUMIndADDVol;
    }

    public double getSUMIndOptLifeVol() {
        return SUMIndOptLifeVol;
    }

    public void setSUMIndOptLifeVol(double SUMIndOptLifeVol) {
        this.SUMIndOptLifeVol = SUMIndOptLifeVol;
    }

    public double getSUMIndDepLifeVol() {
        return SUMIndDepLifeVol;
    }

    public void setSUMIndDepLifeVol(double SUMIndDepLifeVol) {
        this.SUMIndDepLifeVol = SUMIndDepLifeVol;
    }

    public double getSUMIndOptDepLifeVol() {
        return SUMIndOptDepLifeVol;
    }

    public void setSUMIndOptDepLifeVol(double SUMIndOptDepLifeVol) {
        this.SUMIndOptDepLifeVol = SUMIndOptDepLifeVol;
    }

    public double getSUMIndWIVol() {
        return SUMIndWIVol;
    }

    public void setSUMIndWIVol(double SUMIndWIVol) {
        this.SUMIndWIVol = SUMIndWIVol;
    }

    public double getSUMIndLTDVol() {
        return SUMIndLTDVol;
    }

    public void setSUMIndLTDVol(double SUMIndLTDVol) {
        this.SUMIndLTDVol = SUMIndLTDVol;
    }

    public double getSUMIndCritVol() {
        return SUMIndCritVol;
    }

    public void setSUMIndCritVol(double SUMIndCritVol) {
        this.SUMIndCritVol = SUMIndCritVol;
    }

    public double getSUMIndOptADDVol() {
        return SUMIndOptADDVol;
    }

    public void setSUMIndOptADDVol(double SUMIndOptADDVol) {
        this.SUMIndOptADDVol = SUMIndOptADDVol;
    }

    public double getSUMIndStopLossVol() {
        return SUMIndStopLossVol;
    }

    public void setSUMIndStopLossVol(double SUMIndStopLossVol) {
        this.SUMIndStopLossVol = SUMIndStopLossVol;
    }

    public double getSUMHealth() {
        return SUMHealth;
    }

    public void setSUMHealth(double SUMHealth) {
        this.SUMHealth = SUMHealth;
    }

    public double getSUMDental() {
        return SUMDental;
    }

    public void setSUMDental(double SUMDental) {
        this.SUMDental = SUMDental;
    }

    public double getSUMLifePremium() {
        return SUMLifePremium;
    }

    public void setSUMLifePremium(double SUMLifePremium) {
        this.SUMLifePremium = SUMLifePremium;
    }

    public double getSUMADPremium() {
        return SUMADPremium;
    }

    public void setSUMADPremium(double SUMADPremium) {
        this.SUMADPremium = SUMADPremium;
    }

    public double getSUMOptLife() {
        return SUMOptLife;
    }

    public void setSUMOptLife(double SUMOptLife) {
        this.SUMOptLife = SUMOptLife;
    }

    public double getSUMDepLife() {
        return SUMDepLife;
    }

    public void setSUMDepLife(double SUMDepLife) {
        this.SUMDepLife = SUMDepLife;
    }

    public double getSUMDepOptLife() {
        return SUMDepOptLife;
    }

    public void setSUMDepOptLife(double SUMDepOptLife) {
        this.SUMDepOptLife = SUMDepOptLife;
    }

    public double getSUMWI() {
        return SUMWI;
    }

    public void setSUMWI(double SUMWI) {
        this.SUMWI = SUMWI;
    }

    public double getSUMLTD() {
        return SUMLTD;
    }

    public void setSUMLTD(double SUMLTD) {
        this.SUMLTD = SUMLTD;
    }

    public double getSUMCriticalIllness() {
        return SUMCriticalIllness;
    }

    public void setSUMCriticalIllness(double SUMCriticalIllness) {
        this.SUMCriticalIllness = SUMCriticalIllness;
    }

    public double getSUMOptADD() {
        return SUMOptADD;
    }

    public void setSUMOptADD(double SUMOptADD) {
        this.SUMOptADD = SUMOptADD;
    }

    public double getSUMStopLoss() {
        return SUMStopLoss;
    }

    public void setSUMStopLoss(double SUMStopLoss) {
        this.SUMStopLoss = SUMStopLoss;
    }

    public double getOSInvoiceAmount() {
        return OSInvoiceAmount;
    }

    public void setOSInvoiceAmount(double OSInvoiceAmount) {
        this.OSInvoiceAmount = OSInvoiceAmount;
    }

    public double getOSSalesTaxes() {
        return OSSalesTaxes;
    }

    public void setOSSalesTaxes(double OSSalesTaxes) {
        this.OSSalesTaxes = OSSalesTaxes;
    }

    public long getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(long invoiceID) {
        InvoiceID = invoiceID;
    }

    public double getPAPFee() {
        return PAPFee;
    }

    public void setPAPFee(double PAPFee) {
        this.PAPFee = PAPFee;
    }

    public double getOSSuppInvoiceAmount() {
        return OSSuppInvoiceAmount;
    }

    public void setOSSuppInvoiceAmount(double OSSuppInvoiceAmount) {
        this.OSSuppInvoiceAmount = OSSuppInvoiceAmount;
    }

    public double getSuppInvoiceAmount() {
        return SuppInvoiceAmount;
    }

    public void setSuppInvoiceAmount(double suppInvoiceAmount) {
        SuppInvoiceAmount = suppInvoiceAmount;
    }

    public int getContractAccount() {
        return ContractAccount;
    }

    public void setContractAccount(int contractAccount) {
        ContractAccount = contractAccount;
    }

    public int getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(int paymentType) {
        PaymentType = paymentType;
    }

    public String getAGT2() {
        return AGT2;
    }

    public void setAGT2(String AGT2) {
        this.AGT2 = AGT2;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getNoOfLives() {
        return NoOfLives;
    }

    public void setNoOfLives(int noOfLives) {
        NoOfLives = noOfLives;
    }

    public int getHealthCount() {
        return HealthCount;
    }

    public void setHealthCount(int healthCount) {
        HealthCount = healthCount;
    }

    public int getDentalCount() {
        return DentalCount;
    }

    public void setDentalCount(int dentalCount) {
        DentalCount = dentalCount;
    }

    public int getLifeCount() {
        return LifeCount;
    }

    public void setLifeCount(int lifeCount) {
        LifeCount = lifeCount;
    }

    public int getADDCount() {
        return ADDCount;
    }

    public void setADDCount(int ADDCount) {
        this.ADDCount = ADDCount;
    }

    public int getDepLifeCount() {
        return DepLifeCount;
    }

    public void setDepLifeCount(int depLifeCount) {
        DepLifeCount = depLifeCount;
    }

    public int getOptLifeCount() {
        return OptLifeCount;
    }

    public void setOptLifeCount(int optLifeCount) {
        OptLifeCount = optLifeCount;
    }

    public int getOptDepLifeCount() {
        return OptDepLifeCount;
    }

    public void setOptDepLifeCount(int optDepLifeCount) {
        OptDepLifeCount = optDepLifeCount;
    }

    public int getWICount() {
        return WICount;
    }

    public void setWICount(int WICount) {
        this.WICount = WICount;
    }

    public int getLTDCount() {
        return LTDCount;
    }

    public void setLTDCount(int LTDCount) {
        this.LTDCount = LTDCount;
    }

    public int getCritCount() {
        return CritCount;
    }

    public void setCritCount(int critCount) {
        CritCount = critCount;
    }

    public int getOptADDCount() {
        return OptADDCount;
    }

    public void setOptADDCount(int optADDCount) {
        OptADDCount = optADDCount;
    }

    public int getStopLossCount() {
        return StopLossCount;
    }

    public void setStopLossCount(int stopLossCount) {
        StopLossCount = stopLossCount;
    }

    public BigInteger getHealthVol() {
        return HealthVol;
    }

    public void setHealthVol(BigInteger healthVol) {
        HealthVol = healthVol;
    }

    public BigInteger getDentalVol() {
        return DentalVol;
    }

    public void setDentalVol(BigInteger dentalVol) {
        DentalVol = dentalVol;
    }

    public BigInteger getLifeVol() {
        return LifeVol;
    }

    public void setLifeVol(BigInteger lifeVol) {
        LifeVol = lifeVol;
    }

    public BigInteger getADDVol() {
        return ADDVol;
    }

    public void setADDVol(BigInteger ADDVol) {
        this.ADDVol = ADDVol;
    }

    public BigInteger getOptLifeVol() {
        return OptLifeVol;
    }

    public void setOptLifeVol(BigInteger optLifeVol) {
        OptLifeVol = optLifeVol;
    }

    public BigInteger getDepLifeVol() {
        return DepLifeVol;
    }

    public void setDepLifeVol(BigInteger depLifeVol) {
        DepLifeVol = depLifeVol;
    }

    public BigInteger getDepOptLifeVol() {
        return DepOptLifeVol;
    }

    public void setDepOptLifeVol(BigInteger depOptLifeVol) {
        DepOptLifeVol = depOptLifeVol;
    }

    public BigInteger getWIVol() {
        return WIVol;
    }

    public void setWIVol(BigInteger WIVol) {
        this.WIVol = WIVol;
    }

    public BigInteger getLTDVol() {
        return LTDVol;
    }

    public void setLTDVol(BigInteger LTDVol) {
        this.LTDVol = LTDVol;
    }

    public BigInteger getCriticalIllnessVol() {
        return CriticalIllnessVol;
    }

    public void setCriticalIllnessVol(BigInteger criticalIllnessVol) {
        CriticalIllnessVol = criticalIllnessVol;
    }

    public BigInteger getOptADDVol() {
        return OptADDVol;
    }

    public void setOptADDVol(BigInteger optADDVol) {
        OptADDVol = optADDVol;
    }

    public BigInteger getStopLossVol() {
        return StopLossVol;
    }

    public void setStopLossVol(BigInteger stopLossVol) {
        StopLossVol = stopLossVol;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public double getGST() {
        return GST;
    }

    public void setGST(double GST) {
        this.GST = GST;
    }

    public int getPST() {
        return PST;
    }

    public void setPST(int PST) {
        this.PST = PST;
    }

    public int getOtherTax() {
        return OtherTax;
    }

    public void setOtherTax(int otherTax) {
        OtherTax = otherTax;
    }

    public int getThirdPartyGST() {
        return ThirdPartyGST;
    }

    public void setThirdPartyGST(int thirdPartyGST) {
        ThirdPartyGST = thirdPartyGST;
    }

    public int getThirdPartyPST() {
        return ThirdPartyPST;
    }

    public void setThirdPartyPST(int thirdPartyPST) {
        ThirdPartyPST = thirdPartyPST;
    }

    public int getThirdPartyOtherTax() {
        return ThirdPartyOtherTax;
    }

    public void setThirdPartyOtherTax(int thirdPartyOtherTax) {
        ThirdPartyOtherTax = thirdPartyOtherTax;
    }

    public double getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        DiscountAmount = discountAmount;
    }

    public int getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(int companyID) {
        CompanyID = companyID;
    }
}