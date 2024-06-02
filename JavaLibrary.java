import java.util.Scanner;

public class JavaLibrary{
    public static int power(int x , int y) {

        int res = (int) Math.pow(x,y);
        
        return res;
    
    }

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.inheritedChannel);
        System.out.println("Enter a digit for the value of x");
        int a = scanner.nextInt();
        System.out.println("Enter = digit for the value of y");
        int b = scanner. nextInt();
        int res = power(a,b);
        System.out.println("x value is " + a + " and y value is " + b);
        System.out.println("x to the power of y " + res);
    }
    public static double trinAverage(int a , int b , int c , int d , int e) {
        
        int Smallest, Largest, Sum;

        int num[] = {a,b,c,d,e};


         Smallest = num [0];
         Largest = num [0];
         Sum = num [0];

           for (int m=1; m < num.Length;m++) {


               Sum += num{m];
            if(num[m] > Largest) {
               Largest = num[m];
            }
            else if (num[m] < Smallest) {
                Smallest =num[m];
            }

        }
        double trim = (( sum- Largest-Sumllest) / (num.length - 2));
        returm trim;
        }
        public static boolean isprime(int n)
            {
                if (n <= 1)

                     return false;
                for (int i = 2; i < n; i++)

                    if (n % i == 0)

                       return false;
                return true;

            }
            public static void main(String [] args)
            {
                if (isprime(13))
                    System.out.println("is a prime number");
                else
                    System.out.println(" is not a prime number");
                if (isprime(12))
                    System.out.println(" is a prime number");
                else
                    System.out.println(" is not a prime number"):
            }