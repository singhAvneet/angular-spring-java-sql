package api.mssql.demo.Model;

public class IndividualDetail {
    private long CO_ContractID_Group;
    private long CO_ContractID_Indiv;
    private String GR_CompanyName;
    private String Personal_Indiv;
    private String Period_Invoice;
    private int NoOfLives;
    private double Health;
    private double Dental;
    private double Life;
    private double ADD;
    private double DepLife;
    private double OptDepLife;
    private double OptLife;
    private double WI;
    private double LTD;
    private double CritIllness;
    private double StopLoss;
    private double Total;

    public IndividualDetail(long grpId, long InvId, String grpName, String person, String period){
        CO_ContractID_Group=grpId;
        CO_ContractID_Indiv=InvId;
        GR_CompanyName=grpName;
        Personal_Indiv=person;
        Period_Invoice=period;
    }

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

    public String getGR_CompanyName() {
        return GR_CompanyName;
    }

    public void setGR_CompanyName(String GR_CompanyName) {
        this.GR_CompanyName = GR_CompanyName;
    }

    public String getPersonal_Indiv() {
        return Personal_Indiv;
    }

    public void setPersonal_Indiv(String personal_Indiv) {
        Personal_Indiv = personal_Indiv;
    }

    public String getPeriod_Invoice() {
        return Period_Invoice;
    }

    public void setPeriod_Invoice(String period_Invoice) {
        Period_Invoice = period_Invoice;
    }

    public int getNoOfLives() {
        return NoOfLives;
    }

    public void setNoOfLives(int noOfLives) {
        NoOfLives = noOfLives;
    }

    public double getHealth() {
        return Health;
    }

    public void setHealth(double health) {
        Health = health;
    }

    public double getDental() {
        return Dental;
    }

    public void setDental(double dental) {
        Dental = dental;
    }

    public double getLife() {
        return Life;
    }

    public void setLife(double life) {
        Life = life;
    }

    public double getADD() {
        return ADD;
    }

    public void setADD(double ADD) {
        this.ADD = ADD;
    }

    public double getDepLife() {
        return DepLife;
    }

    public void setDepLife(double depLife) {
        DepLife = depLife;
    }

    public double getOptDepLife() {
        return OptDepLife;
    }

    public void setOptDepLife(double optDepLife) {
        OptDepLife = optDepLife;
    }

    public double getOptLife() {
        return OptLife;
    }

    public void setOptLife(double optLife) {
        OptLife = optLife;
    }

    public double getWI() {
        return WI;
    }

    public void setWI(double WI) {
        this.WI = WI;
    }

    public double getLTD() {
        return LTD;
    }

    public void setLTD(double LTD) {
        this.LTD = LTD;
    }

    public double getCritIllness() {
        return CritIllness;
    }

    public void setCritIllness(double critIllness) {
        CritIllness = critIllness;
    }

    public double getStopLoss() {
        return StopLoss;
    }

    public void setStopLoss(double stopLoss) {
        StopLoss = stopLoss;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
}
