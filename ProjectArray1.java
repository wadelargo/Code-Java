import java.util.Scanner;

public class ProjectArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner.out.println("This java program will generate n random integers between 1 and 100 ");
        Scanner.out.println("Please enter a number");
     //method 1.
        int num = sc.nextln();
        int[] tempNum = new int[mum];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < tempNum.lemgth; i++) {
            tempNum[i] = (int) (Math.random() * 100);
        }
        for (int all : tempNum) {

            if (all % 2 !=0) {
                System.out.println(all);
                odd += all;
            } else if (all % 2 == 0) {
                System.out.println(all);
                even += all;
            }
        }
        System.out.println("The total number of odd:" + odd);
        System.out.println("The total number of even:" + even);

    }// end main
}// end main
