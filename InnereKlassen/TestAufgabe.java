package InnereKlassen;
interface Mitarbeiter{
    void arbeiten();
    void ausruhen();
}

class Aufgabe {
    Mitarbeiter a;

    public Aufgabe(Mitarbeiter a) {
        this.a=a;
    }
    public void erledigen(){
        a.arbeiten();
    }
    public void pausieren(){
        a.ausruhen();
    }
}

public class TestAufgabe {
    public static void main(String[] args) {
        Mitarbeiter job = new Mitarbeiter() {
            @Override
            public void arbeiten() {
                System.out.println("Arbeiten");
            }

            @Override
            public void ausruhen() {
                System.out.println("Ausruhen");

            }
        };
        Aufgabe aufgabe = new Aufgabe(job);


        aufgabe.erledigen();
        aufgabe.pausieren();
    }
}
