// TempConverter25jan.java
// Variables, arithmetic, formatted output.

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();


        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);

        input.close();
    }
}