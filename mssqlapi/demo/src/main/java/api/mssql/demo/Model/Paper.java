package api.mssql.demo.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Paper {

   private String groupid;
   private String contractinid;
   private String planid;
   private String periodmonth;
    private String plantype;

    public String getPlantype() {
        return plantype;
    }

    public void setPlantype(String plantype) {
        this.plantype = plantype;
    }

    public String getPeriodmonth() {
        return periodmonth;
    }

    public void setPeriodmonth(String periodmonth) {
        this.periodmonth = periodmonth;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getContractinid() {
        return contractinid;
    }

    public void setContractinid(String contractinid) {
        this.contractinid = contractinid;
    }

    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid;
    }


}
