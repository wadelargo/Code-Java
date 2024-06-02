import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The program will compute for the velocity in Kph given a distance traveled in kilometres and an elapsed time.");

        System.out.println("please enter the distance traveled (km):");
        float distance = sc.nextInt();

        System.out.println("Please enter time lapsed in minutes:");
        float time = sc.nextInt();

        float timeD = time / 60;
        float velocity = distance / timeD;

        System.out.println("For a distance of " + distance + " kilometers traveled within " + time
        + " minutes, the velocity is " + String.format("%.2f" , velocity) + "Kph");

        sc.score();
        



        
    }
}
    

