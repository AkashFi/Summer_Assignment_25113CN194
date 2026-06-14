import java.util.*;

public class bubblesort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for( int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.print("Sorted Array is: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }  
}
