import java.util.Scanner;

public class menuDrivenCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int a,b;

        do{
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter Choice");

            choice = sc.nextInt();
            
            if(choice >=1 && choice <=4) {
                System.out.println("Enter First Number: ");
                a = sc.nextInt();
                System.out.println("Enter Second Number: ");
                b = sc.nextInt();
            }
            else{
                a = 0;
                b = 0;
            }
            switch(choice) {

                case 1:
                    System.out.println("Sum = " +(a+b));
                    break;
                case 2:
                    System.out.println("Difference = " +(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication = " +(a*b));
                    break;
                case 4:
                    if(b == 0) {
                        System.out.println("Division Not Possible!");
                    }
                    else{
                        System.out.println("Division = " +(a/b));
                    }
                    break;
                case 5:
                    System.out.println("Calculator Closed!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            } 
        }while(choice != 5);
        sc.close();
    }
}
