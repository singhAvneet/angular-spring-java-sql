package com.blog.example.CreatePDF.helper;

import com.blog.example.CreatePDF.dto.Book;
import com.blog.example.CreatePDF.dto.IndividualDetail;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class LogicHelper {

    private double sum=0;

    public BigInteger getVolume(BigInteger vol) {
        if(vol.toString() ==  new BigInteger("0").toString()){
            return null;
        }else {
            return vol;
        }
    }


    public double getHealthTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMHealth();  }
        return sum;
    }
    public double getDentalTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMDental();  }
        return sum;
    }
    public double getLifeTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMLifePremium();  }
        return sum;
    }
    public double getADDTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMADPremium();  }
        return sum;
    }
    public double getDepLifeTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMDepLife();  }
        return sum;
    }
    public double getOptDepLifeTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMDepOptLife();  }
        return sum;
    }
    public double getOptLifeTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMOptLife();  }
        return sum;
    }
    public double getSumWITotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMWI();  }
        return sum;
    }
    public double getLTDTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMLTD();  }
        return sum;
    }
    public double getCritIllTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMCriticalIllness();  }
        return sum;
    }
    public double getOptADDTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMOptADD();  }
        return sum;
    }
    public double getSumLossTotal(ArrayList<Book> newdetail){
        sum=0;
        for(Book b:newdetail) { sum += b.getSUMStopLoss();  }
        return sum;
    }




    public double getTotal(ArrayList<Book> newdetails){
        sum=0;
        sum=getSumLossTotal(newdetails)+
                getOptADDTotal(newdetails)+
                getADDTotal(newdetails)+
                getDentalTotal(newdetails)+
                getHealthTotal(newdetails)+
                getLifeTotal(newdetails)+
                getLTDTotal(newdetails)+
                getCritIllTotal(newdetails)+
                getOptLifeTotal(newdetails)+
                getOptDepLifeTotal(newdetails)+
                getSumWITotal(newdetails)+
                getDepLifeTotal(newdetails);

        return sum;
    }


    public String getFormatDate(String date) throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM dd YYYY");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = sdf1.parse(date);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        return sdf2.format(sqlDate);
    }

    public double getTotalGST(ArrayList<Book> newdetails) {
        return newdetails.get(0).getGST()+newdetails.get(0).getThirdPartyGST();
    }
    public double getTotalPST(ArrayList<Book> newdetails) {
        return newdetails.get(0).getPST()+newdetails.get(0).getThirdPartyPST();
    }
    public double getTotalOtherTax(ArrayList<Book> newdetails) {
        return newdetails.get(0).getOtherTax()+newdetails.get(0).getThirdPartyOtherTax();
    }


    public ArrayList<IndividualDetail> getIndivDetailsList(ArrayList<Book> newdetails) throws ParseException {

        ArrayList<IndividualDetail> invDetail=new ArrayList<>();
        IndividualDetail inv;

        for(int i=0;i<newdetails.size();i++){
            inv=new IndividualDetail(newdetails.get(i).getCO_ContractID_Group(),
                    newdetails.get(i).getCO_ContractID_Indiv(),newdetails.get(i).getGR_CompanyName(),newdetails.get(i).getIN_LastName().trim()+", "+newdetails.get(i).getIN_FirstName().trim()+" Age:"+newdetails.get(i).getAge()+" Prov Of Residence:"+newdetails.get(i).getProvOfResidence(),
                    getFormatDate(newdetails.get(i).getIV_PeriodStart())+" - "+ getFormatDate(newdetails.get(i).getIV_PeriodEnd()));
            inv.setNoOfLives(newdetails.get(i).getNoOfLives());
            double health=0;double dental=0;double life=0;double add=0;double depLife=0;double depOptLife=0;
            double optLife=0;double wi=0;double ltd=0;double critIll=0;double stopLoss=0;double total=0;


            for(int n=0;n<newdetails.size();n++){
                if(newdetails.get(n).getCO_ContractID_Indiv()==inv.getCO_ContractID_Indiv()){

                    health+=newdetails.get(n).getSUMIndHealth();
                    dental+=newdetails.get(n).getSUMIndDental();
                    life+=newdetails.get(n).getSUMIndLife();
                    add+=newdetails.get(n).getSUMIndADPremium();
                    depLife+=newdetails.get(n).getSUMIndDepLife();
                    optLife+=newdetails.get(n).getSUMIndOptLife();
                    wi+=newdetails.get(n).getSUMIndWI();
                    ltd+=newdetails.get(n).getSUMIndLTD();
                    critIll+=newdetails.get(n).getSUMIndCritIllness();
                    stopLoss+=newdetails.get(n).getSUMIndStopLoss();

                    total=health+dental+life+add+depLife+depOptLife+optLife+wi+ltd+critIll+stopLoss;
                }
            }

            inv.setHealth(health);inv.setDental(dental);inv.setLife(life);inv.setADD(add);inv.setDepLife(depLife);
            inv.setOptDepLife(depOptLife);inv.setOptLife(optLife);inv.setWI(wi);inv.setLTD(ltd);inv.setCritIllness(critIll);
            inv.setStopLoss(stopLoss);inv.setTotal(total);

            newdetails.remove(i);
            invDetail.add(inv);

        }

        return invDetail;
    }
}

