package Day_30_Exceptions.UserDefined;

public class InsufficientException extends Exception{

    String message;
    public InsufficientException() {
        this.message = "Insufficient Amount";
    }

    public String toString(){
        return message;
    }

}
