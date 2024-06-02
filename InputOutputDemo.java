import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is Java!");

        System.out.println("What is youre name?");
        
        String name = sc.nextline();

        System.out.println("Hello there, " + name + "!");

        sc.close(); 

        System.out.println("Please enter the distance traveled (km)");
        String distance = sc.nextLine();
        
        System.out.println("Please enter the time elapsed in minutes");
        double time = sc.nextDouble();"


}










