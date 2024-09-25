public class TemporaryEmployee extends Employee {
    float dailyWages;
    int Noofdays;

    void initialize(int id, String name, float dailyWages, int Noofdays) {
        EmployeeID = id;
        EmployeeName = name;
        this.dailyWages = dailyWages;
        this.Noofdays = Noofdays;
        calculateNetSalary();
        calculateBonus();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No of days: " + Noofdays);
    }
    public void calculateNetSalary(){
        netSalary = dailyWages * Noofdays;
    }
    public void calculateBonus(){
        if(dailyWages < 1000){
            bonus =  0.15f * netSalary;
        }
        else if(dailyWages >= 1000 && dailyWages < 1500){
            bonus = 0.12f * netSalary;
        }
        else if(dailyWages >= 1500 && dailyWages < 1750){
            bonus = 0.11f * netSalary;
        }
        else{
            bonus = 0.08f * netSalary;
        }
    }
}
