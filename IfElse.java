import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);

        System.out.println("Enter grade in Math (0-100)");
        int mathScore = sc.nextInt();

        System.out.println("Enter grade in Science (0-100)");
        int scienceScore = sc.nextInt();
        
        System.out.println("Enter grade in languages (0-100)");
        int languagesScore = sc.nextInt();

        int total = mathScore + scienceScore + languagesScore;
        float percentage = ((float)total / 300) * 100;

        //code for getting the rating (A,B,C,D,E,F)
        //...
        System.out.println("The percentage grade is " + percentage + "%");

        if(percentage >= 95) {
            System.out.println("Youre rating is A");
        }else {
            if(percentage >= 90) {
                System.out.println("Youre rating is B");
            }else{
                if(percentage >= 85) {
                    System.out.printn("Youre rating is C");
                }else{
                    if(percentage >= 80) {
                        System.out.println("Youre rating is D");
                    }else{
                        if(percentage >= 75) {
                            System.out.println("Youre  rating is E");
                        }else{
                            if(percentage >= 75) {
                                System.out.println("Youre rating is F");

                            }
                        }
                        
                    }
                    

                }
                
            }
            
        }
        
        if (percentage >= 75) {
            System.out.println("Congratulation you pass!");
        }else{
            System.out.println("Dont't go home, youre mom is waiting");
        }
        
    }
}