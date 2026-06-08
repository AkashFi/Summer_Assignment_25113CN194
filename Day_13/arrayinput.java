import java.util.*;

public class arrayinput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = input.nextInt();

        int a[] = new int[n];
        // for input of an array
        for(int i=0; i<n; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = input.nextInt();
        }
        // for output of an array
        for(int i=0; i<n; i++) {
            System.out.print(a[i]+"\t");
        }
        input.close();
    } 
}
