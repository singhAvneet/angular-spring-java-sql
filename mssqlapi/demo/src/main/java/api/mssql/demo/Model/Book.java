package api.mssql.demo.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.awt.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "books")
@IdClass(CompositeKey.class)
public class Book {

    @NotNull
    private long CO_ContractID_Group;
    @Id
    private long CO_ContractID_Indiv;
    @NotNull
    private String ID_StartDate;
    @Id
    private int PL_PlanID;
    @NotNull
    private String IV_InvoiceDate;
    @NotNull
    private String IV_PeriodStart;
    @NotNull
    private String IV_PeriodEnd;
    @NotNull
    private String OP_Description;
    @NotNull
    private double IV_Total;
    @NotNull
    private String OP_ExternalDescription;
    @NotNull
    private String PL_Description;
    @NotNull
    private String IN_FirstName;
    @NotNull
    private String IN_LastName;
    @NotNull
    private String GR_CompanyName;
    @NotNull
    private String AD_AddressLine1;
    @Null
    private String AD_AddressLine2;
    @NotNull
    private String AD_City;
    @NotNull
    private String AD_PostalCode;
    @NotNull
    private String PV_Abbreviation;
    @NotNull
    private String CF_Description;
    @NotNull
    private int OY_OptionTypeID;
    @NotNull
    private int BF_FrequencyID;
    @NotNull
    private String AGT1;
    @NotNull
    private String ProvOfResidence;
    @NotNull
    private int GPT_PlanTypeID;
    @NotNull
    private String OnSupplemental;
    @NotNull
    private double SUMIndHealth;
    @NotNull
    private double SUMIndDental;
    @NotNull
    private double SUMIndLife;
    @NotNull
    private double SUMIndADPremium;
    @NotNull
    private double SUMIndOptLife;
    @NotNull
    private double SUMIndDepLife;
    @NotNull
    private double SUMIndDepOptLife;
    @NotNull
    private double SUMIndWI;
    @NotNull
    private double SUMIndLTD;
    @NotNull
    private double SUMIndCritIllness;
    @NotNull
    private double SUMIndOptADD;
    @NotNull
    private double SUMIndStopLoss;
    @NotNull
    private double SUMIndHealthVol;
    @NotNull
    private double SUMIndDentalVol;
    @NotNull
    private double SUMIndLifeVol;
    @NotNull
    private double SUMIndADDVol;
    @NotNull
    private double SUMIndOptLifeVol;
    @NotNull
    private double SUMIndDepLifeVol;
    @NotNull
    private double SUMIndOptDepLifeVol;
    @NotNull
    private double SUMIndWIVol;
    @NotNull
    private double SUMIndLTDVol;
    @NotNull
    private double SUMIndCritVol;
    @NotNull
    private double SUMIndOptADDVol;
    @NotNull
    private double SUMIndStopLossVol;
    @NotNull
    private double SUMHealth;
    @NotNull
    private double SUMDental;
    @NotNull
    private double SUMLifePremium;



    @NotNull
    private double SUMADPremium;
    @NotNull
    private double SUMOptLife;
    @NotNull
    private double SUMDepLife;
    @NotNull
    private double SUMDepOptLife;
    @NotNull
    private double SUMWI;
    @NotNull
    private double SUMLTD;
    @NotNull
    private double SUMCriticalIllness;
    @NotNull
    private double SUMOptADD;
    @NotNull
    private double SUMStopLoss;
    @NotNull
    private double OSInvoiceAmount;
    @NotNull
    private double OSSalesTaxes;
    @NotNull
    private long InvoiceID;
    @NotNull
    private double PAPFee;
    @NotNull
    private double OSSuppInvoiceAmount;
    @NotNull
    private double SuppInvoiceAmount;
    @NotNull
    private int ContractAccount;
    @NotNull
    private int PaymentType;
    @NotNull
    private String AGT2;
    @NotNull
    private int Age;
    @NotNull
    private int NoOfLives;
    @NotNull
    private int HealthCount;
    @NotNull
    private int DentalCount;
    @NotNull
    private int LifeCount;
    @NotNull
    private int ADDCount;
    @NotNull
    private int DepLifeCount;
    @NotNull
    private int OptLifeCount;
    @NotNull
    private int OptDepLifeCount;
    @NotNull
    private int WICount;
    @NotNull
    private int LTDCount;
    @NotNull
    private int CritCount;
    @NotNull
    private int OptADDCount;
    @NotNull
    private int StopLossCount;
    @NotNull
    private BigInteger HealthVol;
    @NotNull
    private BigInteger DentalVol;
    @NotNull
    private BigInteger LifeVol;
    @NotNull
    private BigInteger ADDVol;
    @NotNull
    private BigInteger OptLifeVol;
    @NotNull
    private BigInteger DepLifeVol;
    @NotNull
    private BigInteger DepOptLifeVol;
    @NotNull
    private BigInteger WIVol;
    @NotNull
    private BigInteger LTDVol;
    @NotNull
    private BigInteger CriticalIllnessVol;
    @NotNull
    private BigInteger OptADDVol;
    @NotNull
    private BigInteger StopLossVol;
    @NotNull
    private int AccountID;
    @NotNull
    private double GST;
    @NotNull
    private int PST;
    @NotNull
    private int OtherTax;
    @NotNull
    private int ThirdPartyGST;
    @NotNull
    private int ThirdPartyPST;
    @NotNull
    private int ThirdPartyOtherTax;
    @NotNull
    private double DiscountAmount;
    @NotNull
    private int CompanyID;

    public long getCO_ContractID_Group() {
        return CO_ContractID_Group;
    }

    public long getCO_ContractID_Indiv() {
        return CO_ContractID_Indiv;
    }

    public String getID_StartDate() {
        return ID_StartDate;
    }

    public int getPL_PlanID() {
        return PL_PlanID;
    }

    public String getIV_InvoiceDate() {
        return IV_InvoiceDate;
    }

    public String getIV_PeriodStart() {
        return IV_PeriodStart;
    }

    public String getIV_PeriodEnd() {
        return IV_PeriodEnd;
    }

    public String getOP_Description() {
        return OP_Description;
    }

    public double getIV_Total() {
        return IV_Total;
    }

    public String getOP_ExternalDescription() {
        return OP_ExternalDescription;
    }

    public String getPL_Description() {
        return PL_Description;
    }

    public String getIN_FirstName() {
        return IN_FirstName;
    }

    public String getIN_LastName() {
        return IN_LastName;
    }

    public String getGR_CompanyName() {
        return GR_CompanyName;
    }

    public String getAD_AddressLine1() {
        return AD_AddressLine1;
    }

    public String getAD_AddressLine2() {
        return AD_AddressLine2;
    }

    public String getAD_City() {
        return AD_City;
    }

    public String getAD_PostalCode() {
        return AD_PostalCode;
    }

    public String getPV_Abbreviation() {
        return PV_Abbreviation;
    }

    public String getCF_Description() {
        return CF_Description;
    }

    public int getOY_OptionTypeID() {
        return OY_OptionTypeID;
    }

    public int getBF_FrequencyID() {
        return BF_FrequencyID;
    }

    public String getAGT1() {
        return AGT1;
    }

    public String getProvOfResidence() {
        return ProvOfResidence;
    }

    public int getGPT_PlanTypeID() {
        return GPT_PlanTypeID;
    }

    public String getOnSupplemental() {
        return OnSupplemental;
    }

    public double getSUMIndHealth() {
        return SUMIndHealth;
    }

    public double getSUMIndDental() {
        return SUMIndDental;
    }

    public double getSUMIndLife() {
        return SUMIndLife;
    }

    public double getSUMIndADPremium() {
        return SUMIndADPremium;
    }

    public double getSUMIndOptLife() {
        return SUMIndOptLife;
    }

    public double getSUMIndDepLife() {
        return SUMIndDepLife;
    }

    public double getSUMIndDepOptLife() {
        return SUMIndDepOptLife;
    }

    public double getSUMIndWI() {
        return SUMIndWI;
    }

    public double getSUMIndLTD() {
        return SUMIndLTD;
    }

    public double getSUMIndCritIllness() {
        return SUMIndCritIllness;
    }

    public double getSUMIndOptADD() {
        return SUMIndOptADD;
    }

    public double getSUMIndStopLoss() {
        return SUMIndStopLoss;
    }

    public double getSUMIndHealthVol() {
        return SUMIndHealthVol;
    }

    public double getSUMIndDentalVol() {
        return SUMIndDentalVol;
    }

    public double getSUMIndLifeVol() {
        return SUMIndLifeVol;
    }

    public double getSUMIndADDVol() {
        return SUMIndADDVol;
    }

    public double getSUMIndOptLifeVol() {
        return SUMIndOptLifeVol;
    }

    public double getSUMIndDepLifeVol() {
        return SUMIndDepLifeVol;
    }

    public double getSUMIndOptDepLifeVol() {
        return SUMIndOptDepLifeVol;
    }

    public double getSUMIndWIVol() {
        return SUMIndWIVol;
    }

    public double getSUMIndLTDVol() {
        return SUMIndLTDVol;
    }

    public double getSUMIndCritVol() {
        return SUMIndCritVol;
    }

    public double getSUMIndOptADDVol() {
        return SUMIndOptADDVol;
    }

    public double getSUMIndStopLossVol() {
        return SUMIndStopLossVol;
    }

    public double getSUMHealth() {
        return SUMHealth;
    }

    public double getSUMDental() {
        return SUMDental;
    }

    public double getSUMLifePremium() {
        return SUMLifePremium;
    }

    public double getSUMADPremium() {
        return SUMADPremium;
    }

    public double getSUMOptLife() {
        return SUMOptLife;
    }

    public double getSUMDepLife() {
        return SUMDepLife;
    }

    public double getSUMDepOptLife() {
        return SUMDepOptLife;
    }

    public double getSUMWI() {
        return SUMWI;
    }

    public double getSUMLTD() {
        return SUMLTD;
    }

    public double getSUMCriticalIllness() {
        return SUMCriticalIllness;
    }

    public double getSUMOptADD() {
        return SUMOptADD;
    }

    public double getSUMStopLoss() {
        return SUMStopLoss;
    }

    public double getOSInvoiceAmount() {
        return OSInvoiceAmount;
    }

    public double getOSSalesTaxes() {
        return OSSalesTaxes;
    }

    public long getInvoiceID() {
        return InvoiceID;
    }

    public double getPAPFee() {
        return PAPFee;
    }

    public double getOSSuppInvoiceAmount() {
        return OSSuppInvoiceAmount;
    }

    public double getSuppInvoiceAmount() {
        return SuppInvoiceAmount;
    }

    public int getContractAccount() {
        return ContractAccount;
    }

    public int getPaymentType() {
        return PaymentType;
    }

    public String getAGT2() {
        return AGT2;
    }

    public int getAge() {
        return Age;
    }

    public int getNoOfLives() {
        return NoOfLives;
    }

    public int getHealthCount() {
        return HealthCount;
    }

    public int getDentalCount() {
        return DentalCount;
    }

    public int getLifeCount() {
        return LifeCount;
    }

    public int getADDCount() {
        return ADDCount;
    }

    public int getDepLifeCount() {
        return DepLifeCount;
    }

    public int getOptLifeCount() {
        return OptLifeCount;
    }

    public int getOptDepLifeCount() {
        return OptDepLifeCount;
    }

    public int getWICount() {
        return WICount;
    }

    public int getLTDCount() {
        return LTDCount;
    }

    public int getCritCount() {
        return CritCount;
    }

    public int getOptADDCount() {
        return OptADDCount;
    }

    public int getStopLossCount() {
        return StopLossCount;
    }

    public BigInteger getHealthVol() {
        return HealthVol;
    }

    public BigInteger getDentalVol() {
        return DentalVol;
    }

    public BigInteger getLifeVol() {
        return LifeVol;
    }

    public BigInteger getADDVol() {
        return ADDVol;
    }

    public BigInteger getOptLifeVol() {
        return OptLifeVol;
    }

    public BigInteger getDepLifeVol() {
        return DepLifeVol;
    }

    public BigInteger getDepOptLifeVol() {
        return DepOptLifeVol;
    }

    public BigInteger getWIVol() {
        return WIVol;
    }

    public BigInteger getLTDVol() {
        return LTDVol;
    }

    public BigInteger getCriticalIllnessVol() {
        return CriticalIllnessVol;
    }

    public BigInteger getOptADDVol() {
        return OptADDVol;
    }

    public BigInteger getStopLossVol() {
        return StopLossVol;
    }

    public int getAccountID() {
        return AccountID;
    }

    public double getGST() {
        return GST;
    }

    public int getPST() {
        return PST;
    }

    public int getOtherTax() {
        return OtherTax;
    }

    public int getThirdPartyGST() {
        return ThirdPartyGST;
    }

    public int getThirdPartyPST() {
        return ThirdPartyPST;
    }

    public int getThirdPartyOtherTax() {
        return ThirdPartyOtherTax;
    }

    public double getDiscountAmount() {
        return DiscountAmount;
    }

    public int getCompanyID() {
        return CompanyID;
    }


    public void setCO_ContractID_Group(long CO_ContractID_Group) {
        this.CO_ContractID_Group = CO_ContractID_Group;
    }

    public void setCO_ContractID_Indiv(long CO_ContractID_Indiv) {
        this.CO_ContractID_Indiv = CO_ContractID_Indiv;
    }

    public void setID_StartDate(String ID_StartDate) {
        this.ID_StartDate = ID_StartDate;
    }

    public void setPL_PlanID(int PL_PlanID) {
        this.PL_PlanID = PL_PlanID;
    }

    public void setIV_InvoiceDate(String IV_InvoiceDate) {
        this.IV_InvoiceDate = IV_InvoiceDate;
    }

    public void setIV_PeriodStart(String IV_PeriodStart) {
        this.IV_PeriodStart = IV_PeriodStart;
    }

    public void setIV_PeriodEnd(String IV_PeriodEnd) {
        this.IV_PeriodEnd = IV_PeriodEnd;
    }

    public void setOP_Description(String OP_Description) {
        this.OP_Description = OP_Description;
    }

    public void setIV_Total(double IV_Total) {
        this.IV_Total = IV_Total;
    }

    public void setOP_ExternalDescription(String OP_ExternalDescription) {
        this.OP_ExternalDescription = OP_ExternalDescription;
    }

    public void setPL_Description(String PL_Description) {
        this.PL_Description = PL_Description;
    }

    public void setIN_FirstName(String IN_FirstName) {
        this.IN_FirstName = IN_FirstName;
    }

    public void setIN_LastName(String IN_LastName) {
        this.IN_LastName = IN_LastName;
    }

    public void setGR_CompanyName(String GR_CompanyName) {
        this.GR_CompanyName = GR_CompanyName;
    }

    public void setAD_AddressLine1(String AD_AddressLine1) {
        this.AD_AddressLine1 = AD_AddressLine1;
    }

    public void setAD_AddressLine2(String AD_AddressLine2) {
        this.AD_AddressLine2 = AD_AddressLine2;
    }

    public void setAD_City(String AD_City) {
        this.AD_City = AD_City;
    }

    public void setAD_PostalCode(String AD_PostalCode) {
        this.AD_PostalCode = AD_PostalCode;
    }

    public void setPV_Abbreviation(String PV_Abbreviation) {
        this.PV_Abbreviation = PV_Abbreviation;
    }

    public void setCF_Description(String CF_Description) {
        this.CF_Description = CF_Description;
    }

    public void setOY_OptionTypeID(int OY_OptionTypeID) {
        this.OY_OptionTypeID = OY_OptionTypeID;
    }

    public void setBF_FrequencyID(int BF_FrequencyID) {
        this.BF_FrequencyID = BF_FrequencyID;
    }

    public void setAGT1(String AGT1) {
        this.AGT1 = AGT1;
    }

    public void setProvOfResidence(String provOfResidence) {
        ProvOfResidence = provOfResidence;
    }

    public void setGPT_PlanTypeID(int GPT_PlanTypeID) {
        this.GPT_PlanTypeID = GPT_PlanTypeID;
    }

    public void setOnSupplemental(String onSupplemental) {
        OnSupplemental = onSupplemental;
    }

    public void setSUMIndHealth(double SUMIndHealth) {
        this.SUMIndHealth = SUMIndHealth;
    }

    public void setSUMIndDental(double SUMIndDental) {
        this.SUMIndDental = SUMIndDental;
    }

    public void setSUMIndLife(double SUMIndLife) {
        this.SUMIndLife = SUMIndLife;
    }

    public void setSUMIndADPremium(double SUMIndADPremium) {
        this.SUMIndADPremium = SUMIndADPremium;
    }

    public void setSUMIndOptLife(double SUMIndOptLife) {
        this.SUMIndOptLife = SUMIndOptLife;
    }

    public void setSUMIndDepLife(double SUMIndDepLife) {
        this.SUMIndDepLife = SUMIndDepLife;
    }

    public void setSUMIndDepOptLife(double SUMIndDepOptLife) {
        this.SUMIndDepOptLife = SUMIndDepOptLife;
    }

    public void setSUMIndWI(double SUMIndWI) {
        this.SUMIndWI = SUMIndWI;
    }

    public void setSUMIndLTD(double SUMIndLTD) {
        this.SUMIndLTD = SUMIndLTD;
    }

    public void setSUMIndCritIllness(double SUMIndCritIllness) {
        this.SUMIndCritIllness = SUMIndCritIllness;
    }

    public void setSUMIndOptADD(double SUMIndOptADD) {
        this.SUMIndOptADD = SUMIndOptADD;
    }

    public void setSUMIndStopLoss(double SUMIndStopLoss) {
        this.SUMIndStopLoss = SUMIndStopLoss;
    }

    public void setSUMIndHealthVol(double SUMIndHealthVol) {
        this.SUMIndHealthVol = SUMIndHealthVol;
    }

    public void setSUMIndDentalVol(double SUMIndDentalVol) {
        this.SUMIndDentalVol = SUMIndDentalVol;
    }

    public void setSUMIndLifeVol(double SUMIndLifeVol) {
        this.SUMIndLifeVol = SUMIndLifeVol;
    }

    public void setSUMIndADDVol(double SUMIndADDVol) {
        this.SUMIndADDVol = SUMIndADDVol;
    }

    public void setSUMIndOptLifeVol(double SUMIndOptLifeVol) {
        this.SUMIndOptLifeVol = SUMIndOptLifeVol;
    }

    public void setSUMIndDepLifeVol(double SUMIndDepLifeVol) {
        this.SUMIndDepLifeVol = SUMIndDepLifeVol;
    }

    public void setSUMIndOptDepLifeVol(double SUMIndOptDepLifeVol) {
        this.SUMIndOptDepLifeVol = SUMIndOptDepLifeVol;
    }

    public void setSUMIndWIVol(double SUMIndWIVol) {
        this.SUMIndWIVol = SUMIndWIVol;
    }

    public void setSUMIndLTDVol(double SUMIndLTDVol) {
        this.SUMIndLTDVol = SUMIndLTDVol;
    }

    public void setSUMIndCritVol(double SUMIndCritVol) {
        this.SUMIndCritVol = SUMIndCritVol;
    }

    public void setSUMIndOptADDVol(double SUMIndOptADDVol) {
        this.SUMIndOptADDVol = SUMIndOptADDVol;
    }

    public void setSUMIndStopLossVol(double SUMIndStopLossVol) {
        this.SUMIndStopLossVol = SUMIndStopLossVol;
    }

    public void setSUMHealth(double SUMHealth) {
        this.SUMHealth = SUMHealth;
    }

    public void setSUMDental(double SUMDental) {
        this.SUMDental = SUMDental;
    }

    public void setSUMLifePremium(double SUMLifePremium) {
        this.SUMLifePremium = SUMLifePremium;
    }

    public void setSUMADPremium(double SUMADPremium) {
        this.SUMADPremium = SUMADPremium;
    }

    public void setSUMOptLife(double SUMOptLife) {
        this.SUMOptLife = SUMOptLife;
    }

    public void setSUMDepLife(double SUMDepLife) {
        this.SUMDepLife = SUMDepLife;
    }

    public void setSUMDepOptLife(double SUMDepOptLife) {
        this.SUMDepOptLife = SUMDepOptLife;
    }

    public void setSUMWI(double SUMWI) {
        this.SUMWI = SUMWI;
    }

    public void setSUMLTD(double SUMLTD) {
        this.SUMLTD = SUMLTD;
    }

    public void setSUMCriticalIllness(double SUMCriticalIllness) {
        this.SUMCriticalIllness = SUMCriticalIllness;
    }

    public void setSUMOptADD(double SUMOptADD) {
        this.SUMOptADD = SUMOptADD;
    }

    public void setSUMStopLoss(double SUMStopLoss) {
        this.SUMStopLoss = SUMStopLoss;
    }

    public void setOSInvoiceAmount(double OSInvoiceAmount) {
        this.OSInvoiceAmount = OSInvoiceAmount;
    }

    public void setOSSalesTaxes(double OSSalesTaxes) {
        this.OSSalesTaxes = OSSalesTaxes;
    }

    public void setInvoiceID(long invoiceID) {
        InvoiceID = invoiceID;
    }

    public void setPAPFee(double PAPFee) {
        this.PAPFee = PAPFee;
    }

    public void setOSSuppInvoiceAmount(double OSSuppInvoiceAmount) {
        this.OSSuppInvoiceAmount = OSSuppInvoiceAmount;
    }

    public void setSuppInvoiceAmount(double suppInvoiceAmount) {
        SuppInvoiceAmount = suppInvoiceAmount;
    }

    public void setContractAccount(int contractAccount) {
        ContractAccount = contractAccount;
    }

    public void setPaymentType(int paymentType) {
        PaymentType = paymentType;
    }

    public void setAGT2(String AGT2) {
        this.AGT2 = AGT2;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setNoOfLives(int noOfLives) {
        NoOfLives = noOfLives;
    }

    public void setHealthCount(int healthCount) {
        HealthCount = healthCount;
    }

    public void setDentalCount(int dentalCount) {
        DentalCount = dentalCount;
    }

    public void setLifeCount(int lifeCount) {
        LifeCount = lifeCount;
    }

    public void setADDCount(int ADDCount) {
        this.ADDCount = ADDCount;
    }

    public void setDepLifeCount(int depLifeCount) {
        DepLifeCount = depLifeCount;
    }

    public void setOptLifeCount(int optLifeCount) {
        OptLifeCount = optLifeCount;
    }

    public void setOptDepLifeCount(int optDepLifeCount) {
        OptDepLifeCount = optDepLifeCount;
    }

    public void setWICount(int WICount) {
        this.WICount = WICount;
    }

    public void setLTDCount(int LTDCount) {
        this.LTDCount = LTDCount;
    }

    public void setCritCount(int critCount) {
        CritCount = critCount;
    }

    public void setOptADDCount(int optADDCount) {
        OptADDCount = optADDCount;
    }

    public void setStopLossCount(int stopLossCount) {
        StopLossCount = stopLossCount;
    }

    public void setHealthVol(BigInteger healthVol) {
        HealthVol = healthVol;
    }

    public void setDentalVol(BigInteger dentalVol) {
        DentalVol = dentalVol;
    }

    public void setLifeVol(BigInteger lifeVol) {
        LifeVol = lifeVol;
    }

    public void setADDVol(BigInteger ADDVol) {
        this.ADDVol = ADDVol;
    }

    public void setOptLifeVol(BigInteger optLifeVol) {
        OptLifeVol = optLifeVol;
    }

    public void setDepLifeVol(BigInteger depLifeVol) {
        DepLifeVol = depLifeVol;
    }

    public void setDepOptLifeVol(BigInteger depOptLifeVol) {
        DepOptLifeVol = depOptLifeVol;
    }

    public void setWIVol(BigInteger WIVol) {
        this.WIVol = WIVol;
    }

    public void setLTDVol(BigInteger LTDVol) {
        this.LTDVol = LTDVol;
    }

    public void setCriticalIllnessVol(BigInteger criticalIllnessVol) {
        CriticalIllnessVol = criticalIllnessVol;
    }

    public void setOptADDVol(BigInteger optADDVol) {
        OptADDVol = optADDVol;
    }

    public void setStopLossVol(BigInteger stopLossVol) {
        StopLossVol = stopLossVol;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public void setGST(double GST) {
        this.GST = GST;
    }

    public void setPST(int PST) {
        this.PST = PST;
    }

    public void setOtherTax(int otherTax) {
        OtherTax = otherTax;
    }

    public void setThirdPartyGST(int thirdPartyGST) {
        ThirdPartyGST = thirdPartyGST;
    }

    public void setThirdPartyPST(int thirdPartyPST) {
        ThirdPartyPST = thirdPartyPST;
    }

    public void setThirdPartyOtherTax(int thirdPartyOtherTax) {
        ThirdPartyOtherTax = thirdPartyOtherTax;
    }

    public void setDiscountAmount(double discountAmount) {
        DiscountAmount = discountAmount;
    }

    public void setCompanyID(int companyID) {
        CompanyID = companyID;
    }
}