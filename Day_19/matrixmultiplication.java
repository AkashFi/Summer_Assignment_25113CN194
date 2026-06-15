import java.util.*;

public class matrixmultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row of first matrix: ");
        int r1 = input.nextInt();
        System.out.print("Enter column of first matrix: ");
        int c1 = input.nextInt();
        System.out.print("Enter row of first matrix: ");
        int r2 = input.nextInt();
        System.out.print("Enter column of first matrix: ");
        int c2 = input.nextInt();
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];

        if(c1 == r2) {
            // taking input of first matrix from user
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c1; j++) {
                    System.out.print("Enter a["+i+","+j+"]: ");
                    a[i][j] = input.nextInt();
                }
            }
            // taking input of secodn matrix from user
            for(int i=0; i<r2; i++) {
                for(int j=0; j<c2; j++) {
                    System.out.print("Enter b["+i+","+j+"]: ");
                    b[i][j] = input.nextInt();
                }
            }
            // multiplication of matrix
            int[][] c = new  int[r1][c2];
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c2; j++) {
                    c[i][j]=0;
                    for(int k=0; k<c1; k++) {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            // display of matrix 
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.print("Multiplication is not possible");
        }
        input.close();
    }   
}
