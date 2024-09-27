import java.util.Scanner;

class Calculator {
     public int Addition(int a, int b){
         return a+b;
     }
     public int Subtraction(int a, int b){
         return a-b;
     }
     public int Multiplication(int a, int b){
         return a*b;
     }
     public double Division(int a, int b, double[] remainder){
         if(b!=0){
             remainder[0] = a%b;
             return (double)a/b;
         }
         else{
             System.out.println("Division by zero is not possible");
             return 0;
         }
     }
 }

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] remainder = new double[1];
        System.out.println("Enter the operator: ");
        String operator = sc.next();
        System.out.println("Enter the operands: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result;
        Calculator calculator = new Calculator();

        switch(operator){
            case "+":
                result = calculator.Addition(num1, num2);
                System.out.println("Result of "+num1+" "+operator+" "+num2+" is "+result);
                break;
            case "-":
                result = calculator.Subtraction(num1, num2);
                System.out.println("Result of "+num1+" "+operator+" "+num2+" is "+result);
                break;
            case "*":
                result = calculator.Multiplication(num1, num2);
                System.out.println("Result of "+num1+" "+operator+" "+num2+" is "+result);
                break;
            case "/":
                double quotient = calculator.Division(num1, num2, remainder);
                System.out.println("Result of "+num1+" "+operator+" "+num2+" is "+(int)quotient);
                System.out.println("Remainder = "+(int)remainder[0]);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
