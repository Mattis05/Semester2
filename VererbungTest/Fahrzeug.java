package VererbungTest;

public class Fahrzeug {
    String name;
    int anzahlRaeder;

    public Fahrzeug(String name, int anzahlRaeder){
            this.name=name;
            this.anzahlRaeder=anzahlRaeder;
    }
    public void setName(String name){
        this.name=name;
    }
    public void fahren(){
        System.out.println("Das fahrzeug " + name +" fährt");
    }
}
