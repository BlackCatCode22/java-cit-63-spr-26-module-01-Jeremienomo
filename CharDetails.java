// CharDetails25jan.java
// char, conditional operators, string operations.

import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        int unicodeValue = ch;


        String type = Character.isLetter(ch) ? "Letter" :
                Character.isDigit(ch) ? "Digit" :
                        "Neither letter nor digit";

        System.out.println("Character entered: " + ch);
        System.out.println("Unicode value: " + unicodeValue);
        System.out.println("Character type: " + type);

        sc.close();
    }
}