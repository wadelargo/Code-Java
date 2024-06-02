import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select a type of operation: [1] for Sum, [2] for Difference, [3] for Product, [4] for Quotient");
        int digit = sc.nextInt();

        switch (digit) {

            case 1: System.out.print("You choose Sum. Please enter the first value: ");
            int task1a = sc.nextInt();
            System.out.print("Please enter the second value: ");
            int task1b = sc.nextInt();
            
            float task1total = task1a + task1b;

            System.out.println("The sum of " + task1a + " and " + task1b + " is equal to " + task1total + "."); break;
 
            case 2: System.out.print("You choose Difference. Please enter the first value: ");
            int task2a = sc.nextInt();
            System.out.print("Please the second value: ");
            int task2b = sc.nextInt();
            
            Float task2total = task2b - task2a;
            
            System.out.println("The difference of " + task2a + " and " + task2b + " is equal to " + task2total + "."); break;


            case 3: System.out.print("You choose Product. Please enter the first value: ");
            int task3a = sc.nextInt();
            System.out.print("Please enter the second value: ");
            int task3b = sc.nextInt();
            
            float task3total = task3a * task3b;

            System.out.println("The Product of " + task3a + " and " + task3b + " is equal to " + task3total + "."); break;

            case 4: System.out.print("You choose Quotient. Please enter the first value: ");
            int task4a = sc.nextInt();
            System.out.print("Please enter the second value: ");
            int task4b = sc.nextInt();
            
            float task4total = task4a / task4b;

            System.out.println("The Quotient of " + task4a + " and " + task4b + " is equal to " + task4total + "."); break;
            
            
            
            

        }
    }
}
    

