import java.util.*;

public class decimaltobinary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int r; // remainder
        String rev = "";

        while(n>0) {
            r = n % 2;
            rev = r + rev;
            n = n / 2;
        }
        System.out.print(rev+ "\t");
        input.close();
    }
}
