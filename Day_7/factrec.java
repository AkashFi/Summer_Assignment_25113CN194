import java.util.*;

public class factrec {
    static int factorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt(); 
        int fact = factorial(num);
        System.out.print("Factoral of "+num+ " is : "+fact);
        input.close();
    }  
}
