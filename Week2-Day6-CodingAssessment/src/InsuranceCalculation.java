import java.util.Scanner;

public class InsuranceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number : ");
        String insuranceNumber = sc.nextLine();
        System.out.println("Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Amount Covered : ");
        double amountCovered = sc.nextDouble();

        System.out.println("Select");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int choice = sc.nextInt();

        double calculatePremium = 0;
        switch (choice) {
            case 1 :
                System.out.println("Policy Term: ");
                int policyTerm = sc.nextInt();
                System.out.println("Benefit Percentage: ");
                float benefitPercentage = sc.nextFloat();

                Insurance lifeInsurance = new LifeInsurance(insuranceNumber, insuranceName, amountCovered, policyTerm, benefitPercentage);
                calculatePremium = addPolicy(lifeInsurance, 1);
                break;

            case 2 :
                System.out.println("Depreciation Percentage: ");
                float depreciationPercentage = sc.nextFloat();

                Insurance motorInsurance = new MotorInsurance(insuranceNumber, insuranceName, amountCovered, depreciationPercentage);
                calculatePremium = addPolicy(motorInsurance, 2);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Calculate Premium : " + calculatePremium);

    }
    public static double addPolicy(Insurance ins, int opt) {
        if(opt == 1) {
            return ((LifeInsurance)ins).calculatePremium();
        }
        else if(opt == 2) {
            return ((MotorInsurance)ins).calculatePremium();
        }
        return 0;
    }
}
