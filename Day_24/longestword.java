import java.util.*;

public class longestword {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        int max = 0, p = 0;

        String longSt = "", presentSt = "";

        for (int i = 0; i <= ch.length; i++) {
            if (i < ch.length && ch[i] != ' ') {
                presentSt += ch[i];
                p++;
            } else {
                if (p > max) {
                    max = p;
                    longSt = presentSt;
                }
                presentSt = "";
                p = 0;

            }
        }
        System.out.print("Longest word is " + longSt + "\nIt is of Length " + max);

        input.close();
    }

}