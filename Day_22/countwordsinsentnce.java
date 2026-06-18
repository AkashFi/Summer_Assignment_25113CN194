import java.util.*;

public class countwordsinsentnce {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        int count = 1;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ') {
                count++;
            }
        }
        // Number of words is equal to space+1
        System.out.print("Number of Words is: "+count);
        input.close();
    }
}
