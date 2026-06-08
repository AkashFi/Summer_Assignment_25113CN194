import java.util.*;

public class arraysumandavg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = input.nextInt();
        int sum = 0;

        int a[] = new int[n];
        // for input of an array
        for(int i=0; i<n; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = input.nextInt();
        }
        for(int i=0; i<n; i++) {
            sum+=a[i];
        }
        System.out.println("Sum of all the elements is : "+sum);
        System.out.print("Average of all the elements is : "+sum/n);
        input.close();
    } 
}
