import java.util.*;

public class p35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = input.nextInt();

        for(int i=0; i<n; i++) {
            for(char ch='A'; ch<='A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        input.close();
    }
}