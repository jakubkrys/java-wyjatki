package pl.jakubkrys.exceptions.customexceptions;

public class PasswordException extends Exception {

    public PasswordException() {
        super("Incorrect password");
    }
}
