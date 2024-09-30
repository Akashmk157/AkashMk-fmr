public class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public MotorInsurance(String insuranceNo, String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
        this.idv = amountCovered - ((amountCovered*depPercent)/100);
    }
    public double getIdv() {
        return idv;
    }
    public float getDepPercent() {
        return depPercent;
    }

    public double calculatePremium(){
        return getIdv()*(getDepPercent()/100);
    }
}
