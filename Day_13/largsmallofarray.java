import java.util.*;

public class largsmallofarray {
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
        int larg = a[0],small = a[0];
        for(int i=0; i<n; i++) {
            if(a[i]>larg) {
                larg = a[i];
            }
            else if(a[i]<small) {
                small = a[i];
            }
        }
        System.out.println("Largest element is : "+larg);
        System.out.print("Smallest element is : "+small);
        input.close();
    } 
}
