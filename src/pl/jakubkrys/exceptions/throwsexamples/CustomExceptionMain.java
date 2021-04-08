package pl.jakubkrys.exceptions.throwsexamples;

import pl.jakubkrys.exceptions.customexceptions.*;

public class CustomExceptionMain {
    public static void main(String[] args) {

        String password1 = "ABC";
        String password2 = "ABC";
        String pesel = "90878422316";

        try{
            Utils.isValidPassword(password1, password2);
        } catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        try {
            Utils.isValidEmail("babcia@ania.pl");
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }

        try {
            Utils.isValidPesel(pesel);
        } catch (PeselException e) {
            System.out.println(e.getMessage());
        }
    }
}
