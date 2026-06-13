import java.util.Scanner;

public class commonofarray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter number of elements in first array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        
        //taking first array from user 
        for(int i=0; i<n1; i++) {
            System.out.print("Enter arr1["+i+"]: ");
            arr1[i] = input.nextInt();
        }
        //taking second array from user 
         for(int j=0; j<n2; j++) {
            System.out.print("Enter arr2["+j+"]: ");
            arr2[j] = input.nextInt();
        }
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                }
            }
        }
        input.close();

    }
}
