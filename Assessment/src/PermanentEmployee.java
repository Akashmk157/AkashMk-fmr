public class PermanentEmployee extends Employee {
    float pf;

    void initialize(int id, String name, float salary, float pf) {
        EmployeeID = id;
        EmployeeName = name;
        basicSalary = salary;
        this.pf = pf;
        calculateNetSalary();
        calculateBonus();

    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Basic salary: " + basicSalary);
        System.out.println("Pf : "+pf);
    }
    public void calculateBonus() {
        if(pf < 1000){
            bonus = 0.10f * basicSalary;
        }
        else if(pf>=1000 && pf<1500){
            bonus = 0.115f * basicSalary;
        }
        else if(pf>=1500 && pf<1800){
            bonus = 0.12f * basicSalary;
        }
        else{
            bonus = 0.15f * basicSalary;
        }
    }
    public void calculateNetSalary() {
        netSalary = basicSalary - pf;
    }
}
