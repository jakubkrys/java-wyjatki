package pl.jakubkrys.exceptions.customexceptions;

public class PeselException extends Exception{

    public PeselException() {
        super("Incorrect pesel");
    }
}
