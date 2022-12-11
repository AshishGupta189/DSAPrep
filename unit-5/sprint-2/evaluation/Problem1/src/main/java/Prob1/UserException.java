package Prob1;

public class UserException extends Exception {
    public UserException() {
    }

    public UserException(String message) {
        System.out.println(message);
    }
}
