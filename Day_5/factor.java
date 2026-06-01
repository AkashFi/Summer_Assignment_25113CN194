import java.util.*;

public class factor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();


        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + "\t");
            }
        }
        input.close();
    }
}
