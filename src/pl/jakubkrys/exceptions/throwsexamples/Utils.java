package pl.jakubkrys.exceptions.throwsexamples;

import pl.jakubkrys.exceptions.customexceptions.*;

public final class Utils {

    public static String monthNameByNumber(int number) throws IllegalArgumentException {
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean checkName(String name) throws IllegalArgumentException {
        char[] nameTable = name.toCharArray();
        for (char c : nameTable) {
            if (c < 65 || c > 90){
                throw new IllegalArgumentException();
            }
        }
        return true;
    }

    public static boolean isValidPassword (String password1, String password2) throws PasswordException {
        if (!password1.equals(password2)){
            throw new PasswordException();
        } else {
            return true;
        }
    }

    public static boolean isValidEmail (String email) throws EmailException {
        if (email.length() < 10 || !email.contains("@")){
            throw new EmailException();
        } else {
            return true;
        }
    }

    public static boolean isValidPesel(String pesel) throws PeselException{
        if (pesel.length() == 11 && pesel.substring(0).matches("[0-9]*")) {
            return true;
        } else {
            throw new PeselException();
        }
    }
}
