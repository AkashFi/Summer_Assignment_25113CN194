public class p37 {
    public static void main(String[] args) {


        int n = 9;

        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=n; k>=2*i-1; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
      
    }   
}
