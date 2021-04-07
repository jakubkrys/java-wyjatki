package pl.jakubkrys.exceptions;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FirstException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        int a = 5;
        int b = 0;

        try {
            int result = a / b; // wyjątek nieoznaczony
            result += 10;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by 0 moron!");
        }


        try {
            FileInputStream fileInputStream = new FileInputStream("to/ma/byc/sciezka/plik.txt"); // wyjątek oznaczony
        } catch (FileNotFoundException e) {
            System.out.println("This file do not exist");
        }

        try {
            System.out.print("Insert number 1: ");
            a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Insert number 2: ");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a/b);

            System.out.print("Insert path to file: ");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e){
            System.out.println("This file do not exist");
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by 0 moron!");
        }

        try {
            System.out.print("Insert number 1: ");
            a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Insert number 2: ");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a/b);

            System.out.print("Insert path to file: ");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException | ArithmeticException e){
            System.out.println("Incorrect data");
        }

        try {
            System.out.print("Insert number 1: ");
            a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Insert number 2: ");
            b = scanner.nextInt();
            scanner.nextLine();

            System.out.println(a/b);

            System.out.print("Insert path to file: ");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (Exception e){
            System.out.println("Incorrect data");
        }

        scanner.close();
    }
}
