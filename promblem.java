import java.uil.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scannwer sc = new Sacnner(System.in);

        System.out.println("Enter Gross Salary");
        double salary = sc.nextImt();

        double amountToPay = taxAmount(salary);
        
        System.out.println("Tax amount to pay: " + amountTopay);
    }
    public static double taxAmount(double grossSalary){
        double Tax = 0;
        if(grossSalary>200000){
            return grossSalary*0.25;
        }else if(grossSalary>100000 && grossSalary<=200000){
            grossSalary-=100000;
            return (grossSalary*0.20)+15000;
        }else if(grossSalary>50000 && grossSalary<=100000){
            grossSalary-=50000;
            return (grossSalary*0.15)+50000;
        }else if(grossSalary<=50000){
            return grossSalary*0.10;
        }else{
            return Tax;
        }
    }
}