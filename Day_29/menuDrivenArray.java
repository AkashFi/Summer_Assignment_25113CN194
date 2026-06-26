import java.util.Scanner;

public class menuDrivenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];
        int size  = 0;
        int choice;

        do{
            System.out.println("---Welcome To Driven Array Menu---");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Element");
            System.out.println("3. Search Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");

            System.out.println("Enter Choice");

            choice = sc.nextInt();
            
            switch(choice) {

                case 1:
                    System.out.println("Enter Element: ");
                    arr[size] = sc.nextInt();
                    size++;
                    System.out.println("Element Inserted");
                    break;
                case 2:
                    if(size == 0) {
                        System.out.println("Array Is Empty");
                    }
                    else{
                        System.out.println("Array Elements: ");
                        for(int i=0; i<size; i++) {
                            System.out.println(arr[i]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter Element To Search: ");
                    int n = sc.nextInt();
                    for(int i = 0; i<size; i++) {
                        if(arr[i] == n) {
                            System.out.println("Element Found");
                        }
                    }
                    System.out.println("Element Is Not Found");
                    break;
                case 4:
                    System.out.println("Enter Element To Delete");
                    int del = sc.nextInt();
                    int loc = -1;
                    for(int i = 0; i<size; i++) {
                        if(arr[i] == del) {
                            loc = i;
                            break;
                        }
                    }
                    if(loc == -1) {
                        System.out.println("Element Not Found");
                    }
                    else{
                        for(int i= loc; i<size-1; i++) {
                            arr[i] = arr[i+1];
                        }
                        size--;
                    }
                    System.out.println("Element Deleted");
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Wrong choice");
                    break;
            } 
        }while(choice != 5);
        sc.close();
    }
}
