package api.mssql.demo.helper;

import api.mssql.demo.Model.Book;
import api.mssql.demo.Model.IndividualDetail;
import org.thymeleaf.context.Context;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

public class ContextHelper {
    private Context context;
    public ContextHelper(){
        context=new Context();
    }
    private LogicHelper logic=new LogicHelper();

    public Context getContext(ArrayList<Book> newdetails) throws ParseException {
        ArrayList<IndividualDetail> Inv_details=logic.getIndivDetailsList(newdetails);

        context.setVariable("newdetails",newdetails);
        context.setVariable("Inv_details",Inv_details);

        context.setVariable("Date",logic.getFormatDate(newdetails.get(0).getIV_InvoiceDate()));
        context.setVariable("Period_Covered",logic.getFormatDate(newdetails.get(0).getIV_PeriodStart())+" - "+logic.getFormatDate(newdetails.get(0).getIV_PeriodEnd()));
        context.setVariable("City_Province",newdetails.get(0).getAD_City()+", "+newdetails.get(0).getProvOfResidence());
        context.setVariable("County_Postal",newdetails.get(0).getCF_Description()+", "+newdetails.get(0).getAD_PostalCode());

        context.setVariable("HealthVol",logic.getVolume(newdetails.get(0).getHealthVol()));
        context.setVariable("DentalVol",logic.getVolume(newdetails.get(0).getDentalVol()));
        context.setVariable("LifeVol",logic.getVolume(newdetails.get(0).getLifeVol()));
        context.setVariable("ADDVol",logic.getVolume(newdetails.get(0).getADDVol()));
        context.setVariable("DepLifeVol",logic.getVolume(newdetails.get(0).getDepLifeVol()));
        context.setVariable("DepOptLifeVol",logic.getVolume(newdetails.get(0).getDepOptLifeVol()));
        context.setVariable("OptLifeVol",logic.getVolume(newdetails.get(0).getOptLifeVol()));
        context.setVariable("WIVol",logic.getVolume(newdetails.get(0).getWIVol()));
        context.setVariable("LTDVol",logic.getVolume(newdetails.get(0).getLTDVol()));
        context.setVariable("CriticalIllnessVol",logic.getVolume(newdetails.get(0).getCriticalIllnessVol()));
        context.setVariable("OptADDVol",logic.getVolume(newdetails.get(0).getOptADDVol()));
        context.setVariable("StopLossVol",logic.getVolume(newdetails.get(0).getStopLossVol()));

        context.setVariable("SUMHealth", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getHealthTotal(newdetails)));
        context.setVariable("SUMDental",  NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getDentalTotal(newdetails)));
        context.setVariable("SUMLifePremium", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getLifeTotal(newdetails)));
        context.setVariable("SUMADPremium", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getADDTotal(newdetails)));
        context.setVariable("SUMDepLife", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getDepLifeTotal(newdetails)));
        context.setVariable("SUMDepOptLife", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getOptDepLifeTotal(newdetails)));
        context.setVariable("SUMOptLife", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getOptLifeTotal(newdetails)));
        context.setVariable("SUMWI", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getSumWITotal(newdetails)));
        context.setVariable("SUMLTD", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getLTDTotal(newdetails)));
        context.setVariable("SUMCriticalIllness", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getCritIllTotal(newdetails)));
        context.setVariable("SUMOptADD", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getOptADDTotal(newdetails)));
        context.setVariable("SUMStopLoss", NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getSumLossTotal(newdetails)));

        context.setVariable("Totals",NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getTotal(newdetails)));
        context.setVariable("Total_Payable",NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getTotal(newdetails)));
        context.setVariable("Total_GST",NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getTotalGST(newdetails)));
        context.setVariable("Total_PST",NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getTotalPST(newdetails)));
        context.setVariable("TotalOther_Tax",NumberFormat.getCurrencyInstance(Locale.CANADA).format(logic.getTotalOtherTax(newdetails)));



        return context;

}

}
