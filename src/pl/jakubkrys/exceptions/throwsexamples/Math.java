package pl.jakubkrys.exceptions.throwsexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class Math {

    public static int div(int a, int b) throws ArithmeticException {
        return a/b;
    }

//    public static FileInputStream correctPath (FileInputStream fileInputStream) throws FileNotFoundException {
//        return fileInputStream;
//    }
}
