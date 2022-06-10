package Ausnahmen.PA2;

public class Negative_Kantenlaenge extends Throwable {
    public Negative_Kantenlaenge() {
        super("INVALID");
    }

    public Negative_Kantenlaenge(String message) {
        super(message);
    }
}
