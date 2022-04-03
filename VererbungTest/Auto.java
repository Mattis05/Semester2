package VererbungTest;

import java.sql.SQLOutput;

public class Auto extends Fahrzeug{
    String marke;


    public Auto(String name, String marke){
        super(name,4);
        this.marke=marke;

    }
    public String getMarke(){
        return this.marke;
    }
    public void fahren(){
        System.out.println("Das Auto " + marke + " " + name + " fährt.");
    }

    public static void main(String[] args) {
        Fahrzeug fahrzeug= new Fahrzeug("Mein Fahrrad",2);
        Auto auto = new Auto("Golf", "VW");

        fahrzeug.setName("Ein Fahrrad");
        String vw=auto.getMarke();

        fahrzeug.fahren();
        auto.fahren();
        Fahrzeug einAutoImFahrzeug= new Auto("1er", "BMW");
        String nameDesAutos = einAutoImFahrzeug.name;
        einAutoImFahrzeug.fahren();
    }
}
