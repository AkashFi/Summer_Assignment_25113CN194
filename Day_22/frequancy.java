import java.util.*;

public class frequancy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        System.out.print("Enter character: ");
        char ch1 = input.next().charAt(0);

        int count = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ch1) {
                count++;
            }
        }
        System.out.print("Frequency is: "+count);
        input.close();
    }
}
