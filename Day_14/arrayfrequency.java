import java.util.*;

public class arrayfrequency {
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
        System.out.print("Enter the target number: ");
        int key = input.nextInt();
        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == key) {
                count++;
            }
        }
        System.out.print("Frequency of "+key+" is: "+count);
        input.close();
    } 
}
