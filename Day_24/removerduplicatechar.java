import java.util.*;

public class removerduplicatechar {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        // this is for cover all into lower case
        for(int i=0; i<ch.length; i++) {
            if(ch[i]>='A' && ch[i]<='Z') {
                ch[i] = (char)(ch[i]+32);
            }
        }

        for(int i=0; i<ch.length; i++) {
            int count = 0;
            for(int j=0; j<i; j++) {
                if(ch[i] == ch[j]) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                System.out.print(ch[i]);
            }
        }
        input.close();
    }
}
