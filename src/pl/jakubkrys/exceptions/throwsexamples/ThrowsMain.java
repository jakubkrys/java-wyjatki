package pl.jakubkrys.exceptions.throwsexamples;

import java.io.*;
import java.util.Scanner;

public class ThrowsMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = null;
        String correctFilePath = "";

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        try {
            int result = Math.div(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e){
            System.out.println("Do not divide by 0.");
        }

//        System.out.print("File path: ");
//        File fileInputStream = scanner.nextFileInputStream();
//        try {
//            fileInputStream = new FileInputStream(fileInputStream);
//        } catch (FileNotFoundException e) {
//            System.out.println(path+" is incorrect path");
//        }
//        try {
//            correctFilePath = Math.correctPath(fileInputStream);
//        } catch (FileNotFoundException e) {
//            System.out.println(correctFilePath+" is incorrect path");
//        }
//
//


    }
}