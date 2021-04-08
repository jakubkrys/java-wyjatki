package pl.jakubkrys.exceptions.customexceptions;

public class EmailException extends Exception{

    public EmailException() {
        super("Incorrect e-mail");
    }
}
