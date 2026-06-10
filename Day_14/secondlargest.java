import java.util.*;

public class secondlargest {
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
        int larg1 = 0,larg2 = 0;
        for(int i=0; i<n; i++) {
            if(a[i]>larg1) {
                larg2 = larg1;
                larg1 = a[i];
            }
            else if(a[i]>larg2 && a[i] != larg1)  {
                larg2 = a[i];
            }
        }
        System.out.println("First largest is : "+larg1);
        System.out.print("Second largets is : "+larg2);
        input.close();
    } 
}
