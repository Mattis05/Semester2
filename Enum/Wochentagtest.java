package Enum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wochentagtest {
    List<Wochentag> aktuell = new ArrayList();

    public Wochentagtest(){
        for(int i=0;i<20;i++){
            Random zufall  = new Random();
            int zufallszahl = zufall.nextInt(6);
            switch(zufallszahl){
                case 0: aktuell.add(Wochentag.MONTAG);
                break;
                case 1: aktuell.add(Wochentag.DIENSTAG);
                    break;
                case 2: aktuell.add(Wochentag.MITTWOCH);
                    break;
                case 3: aktuell.add(Wochentag.DONNERSTAG);
                    break;
                case 4: aktuell.add(Wochentag.FREITAG);
                    break;
                case 5: aktuell.add(Wochentag.SAMSTAG);
                    break;
                case 6: aktuell.add(Wochentag.SONNTAG);
                    break;

            }

        }
    }


    void printer(){
        for (Wochentag x:aktuell){
            System.out.println(x);

        }
    }
    public int Ausgabenzahl() {
        int erg = 0;
        for (Wochentag i:aktuell) {

            if (i.istWochenende == true) {
                erg += 1;
            }
        }
        return erg;
    }

    public static void main(String[] args) {
        Wochentagtest c= new Wochentagtest();
        c.printer();
        System.out.println(c.Ausgabenzahl());

    }
}
