import java.util.*;

public class evenoddarray {
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
        int even = 0, odd = 0;
        for(int i=0; i<n; i++) {
            if(a[i] % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even elements is : "+even);
        System.out.print("Number of odd elements is : "+odd);
        input.close();
    } 
}
