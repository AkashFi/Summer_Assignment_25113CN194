import java.util.*;

public class reverserec {
    static void reverse(int n) {
        if(n==0) {
            return ;
        }
        else{
            System.out.print(n % 10);
            reverse(n/10);
        }
    }   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        reverse(num);
        input.close();

    }  
}
