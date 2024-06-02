import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       int loop =0;
       while (loop >=0){

           System.out.println("Enter a year");
           int year = sc.nextInt();

           if (year % 4 ==0) {
              System.out.println(year + "is a leap year");
           }else if (year % 100 ==0) {
              System.out.println(year + "is a leap year");
           }else if (year % 4 !=0) {
              System.out.prindhfifsadfsfln(year + "is not a leap year");
           }
        }   

        
        
    }


}

    
