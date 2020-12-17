package com.blog.example.CreatePDF;

import com.blog.example.CreatePDF.dto.Book;

import java.math.BigInteger;
import java.sql.Date;
import java.util.Calendar;

public class initialize {
    private Book data=new Book();

    public initialize() {
       initBook();
    }

   public Book getBook() {
        return data;
    }



    private void initBook(){
        data.setCO_ContractID_Group(12345);
        data.setCO_ContractID_Indiv(00000);
        data.setID_StartDate("2020-10-10");
        data.setPL_PlanID(123);
        data.setIV_InvoiceDate("2020-10-10");
        data.setIV_PeriodEnd("2020-10-10");
        data.setIV_PeriodStart("2020-10-10");
        data.setOP_Description("description");
        data.setIV_Total(12345);
        data.setOP_ExternalDescription("external desc");
        data.setPL_Description("pl description");
        data.setIN_FirstName("firstName");
        data.setIN_LastName("lastName");
        data.setGR_CompanyName("companyName");
        data.setAD_AddressLine1("addressLine1");
        data.setAD_AddressLine2("addressLine2");
        data.setAD_City("city");
        data.setAD_PostalCode("postalCode");
        data.setPV_Abbreviation("12345");
        data.setCF_Description("external desc");

        data.setOY_OptionTypeID(12345);
        data.setBF_FrequencyID(00000);
        data.setAGT1("description");
        data.setProvOfResidence("province");
        data.setGPT_PlanTypeID(1234);
        data.setOnSupplemental("pl description");
        data.setSUMIndHealth(123);
        data.setSUMIndDental(123);
        data.setSUMIndADPremium(123);
        data.setSUMIndOptLife(0);
        data.setSUMIndDepLife(0);
        data.setSUMIndDepOptLife(0);
        data.setSUMIndWI(0);
        data.setSUMIndLTD(0);
        data.setSUMIndCritIllness(0);
        data.setSUMIndOptADD(0);
        data.setSUMIndStopLoss(12345);
        data.setSUMIndHealthVol(0);
        data.setSUMIndDentalVol(0);
        data.setSUMIndLifeVol(0);
        data.setSUMIndADDVol(0);
        data.setSUMIndOptLifeVol(0);
        data.setSUMIndDepLifeVol(0);
        data.setSUMIndOptDepLifeVol(0);

        data.setSUMIndWIVol(0);
        data.setSUMIndLTDVol(0);
        data.setSUMIndCritVol(0);
        data.setSUMIndOptADDVol(0);

        data.setSUMIndStopLossVol(12345);
        data.setSUMHealth(00000);
        data.setSUMDental(0);
        data.setSUMLifePremium(0);
        data.setSUMADPremium(1234);
        data.setSUMOptLife(0);
        data.setSUMDepLife(123);
        data.setSUMDepOptLife(123);
        data.setSUMWI(123);
        data.setSUMLTD(0);
        data.setSUMCriticalIllness(0);
        data.setSUMOptADD(0);
        data.setSUMStopLoss(0);
        data.setOSInvoiceAmount(0);
        data.setOSSalesTaxes(0);
        data.setInvoiceID(0);
        data.setPAPFee(12345);
        data.setOSSuppInvoiceAmount(0);
        data.setSuppInvoiceAmount(0);
        data.setContractAccount(0);
        data.setPaymentType(0);
        data.setAGT2("companyName");
        data.setAge(32);
        data.setNoOfLives(1);
        data.setHealthCount(1);
        data.setDentalCount(0);
        data.setLifeCount(0);
        data.setADDCount(0);

        data.setDepLifeCount(12345);
        data.setOptLifeCount(00000);
        data.setWICount(0);
        data.setLTDCount(0);
        data.setCritCount(1234);
        data.setOptADDCount(0);
        data.setStopLossCount(123);
        data.setHealthVol(new BigInteger("0"));
        data.setDentalVol(new BigInteger("0"));
        data.setLifeVol(new BigInteger("0"));
        data.setADDVol(new BigInteger("0"));
        data.setStopLossVol(new BigInteger("0"));
        data.setAccountID(0);
        data.setGST(0);
        data.setPST(0);

        data.setOtherTax(0);
        data.setThirdPartyGST(12345);
        data.setThirdPartyPST(0);
        data.setThirdPartyOtherTax(0);
        data.setDiscountAmount(0);

        data.setCompanyID(0);
    }
}
