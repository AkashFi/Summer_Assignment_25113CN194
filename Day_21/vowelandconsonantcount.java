import java.util.*;

public class vowelandconsonantcount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        
       int v = 0, c = 0;
       for(int i=0; i<ch.length; i++) {
        if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z'))  {
            if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i]== 'u')) {
                v++;
            }
            else{
                c++;
            }
        }
       }
       System.out.print("Vowels: "+v+"\nConsonant: "+c);
       input.close();
        
    }
}
