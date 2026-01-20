// MadLibs25jan.java
// String concatenation, input.


import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb (past tense): ");
        String verb = input.nextLine();

        System.out.print("Enter a place: ");
        String place = input.nextLine();

        String story = "One day, a " + adjective + " " + noun +
                " " + verb + " all the way to " + place +
                ". Everyone there was very surprised!";

        System.out.println("\n--- Your Mad Lib Story ---");
        System.out.println(story);

        input.close();
    }
}