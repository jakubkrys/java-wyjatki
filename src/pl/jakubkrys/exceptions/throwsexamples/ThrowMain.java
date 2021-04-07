package pl.jakubkrys.exceptions.throwsexamples;

import java.util.Locale;
import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter month number: ");
            number = scanner.nextInt();
            scanner.nextLine();
            try {
                String month = Utils.monthNameByNumber(number);
                System.out.println(month);
            } catch (IllegalArgumentException e) {
                System.out.println("Such month does not exist");
            }
        } while (number != 0);

        System.out.print("Name : ");
        String name = scanner.nextLine();
        try {
            boolean isNameCorrect = Utils.checkName(name.toUpperCase());
            System.out.println(isNameCorrect);
        } catch (IllegalArgumentException e) {
            System.out.println(false);
        }

    }
}
