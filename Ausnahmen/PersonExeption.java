package Ausnahmen;

public class PersonExeption extends Throwable {
    public PersonExeption() {
        super("INVALID");

    }

    public PersonExeption(String message){
        super(message);

    }
}
