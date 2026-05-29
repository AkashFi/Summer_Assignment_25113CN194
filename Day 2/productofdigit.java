import java.util.*;
public class productofdigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int pro=1;
        int r;

        while(n>0) {
            r=n%10;
            pro=pro*r;
            n=n/10;
        }
        System.out.print("Product of number is : "+pro);

    }
}
