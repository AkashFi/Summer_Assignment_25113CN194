import java.util.*;

public class stringcompress {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

    
        int count = 0;
        for(int i=0; i<ch.length; i++) {
            count = 1;
            while(i<ch.length-1 && ch[i] == ch[i+1]) {
                count++;
                i++;
            }
            System.out.print(ch[i]);
            if(count>1) {
                System.out.print(count);
            }
        }
        input.close();
    }
}
