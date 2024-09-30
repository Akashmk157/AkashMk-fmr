public class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        setPolicyTerm(policyTerm);
        setBenefitPercent(benefitPercent);
    }
    public int getPolicyTerm() {
        return policyTerm;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }

    public double calculatePremium(){
        double prep = (getAmountCovered() - ((getAmountCovered()*getBenefitPercent())/100))/getPolicyTerm();
        return prep;
    }

}
