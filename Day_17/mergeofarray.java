import java.util.Scanner;

public class mergeofarray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter number of elements in first array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        int[] result = new int[n1+n2];

        //taking first array from user 
        for(int i=0; i<n1; i++) {
            System.out.print("Enter arr1["+i+"]: ");
            arr1[i] = input.nextInt();
        }
        //taking second array from user 
         for(int i=0; i<n2; i++) {
            System.out.print("Enter arr2["+i+"]: ");
            arr2[i] = input.nextInt();
        }
        for(int i=0; i<n1; i++) {
            result[i] = arr1[i];
        }
        for(int i=0; i<n2; i++) {
            result[n1+i] = arr2[i];
        }
        for(int i=0; i<n1+n2; i++) {
            System.out.print(result[i]+" ");
        }
        input.close();

    }
}
