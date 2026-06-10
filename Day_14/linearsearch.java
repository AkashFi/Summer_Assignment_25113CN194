import java.util.*;

public class linearsearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = input.nextInt();
        System.out.print("Enter searching element : ");
        int key = input.nextInt();

        int a[] = new int[n];
        // for input of an array
        for(int i=0; i<n; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = input.nextInt();
        }
        int loc = -1;
        for(int i=0; i<n; i++) {
            if(a[i]==key) {
                loc = i;
                System.out.print(key+" element is found at the index "+loc);
                break;
            }
        }
        if(loc==-1) {
            System.out.print(key+" element is not found");
        }
        input.close();
    } 
}
