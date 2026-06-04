import java.util.*;

public class p30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of column : ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        input.close();
    } 
}
