package model.exeptions;

public class AccountExeption extends RuntimeException {
    public AccountExeption(String message) {
        super(message);
    }
}
