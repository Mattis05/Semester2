package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    List<Wochentage2> aktuell = new ArrayList<>();

    public Main2(){
        for(int i=0;i<20;i++){
            Random zufall=new Random();
            int zufallszahl=zufall.nextInt(6);
            switch(zufallszahl){
                case 0:
                    aktuell.add(Wochentage2.MONTAG);
                    break;
                case 1:
                    aktuell.add(Wochentage2.DIENSTAG);
                    break;
                case 2:
                    aktuell.add(Wochentage2.MITTWOCH);
                    break;
                case 3:
                    aktuell.add(Wochentage2.DONNERSTAG);
                    break;
                case 4:
                    aktuell.add(Wochentage2.FREITAG);
                    break;
                case 5:
                    aktuell.add(Wochentage2.SAMSTAG);
                    break;
                case 6:
                    aktuell.add(Wochentage2.SONNTAG);
                    break;
            }
        }
    }
    public void Wochentagprinten() {
        for (Wochentage2 i : aktuell) {
            System.out.println("Wochentag : " + i);
        }
    }

        public int WochentagAnzahl(){
            int anzahl = 0 ;
            for (Wochentage2 i : aktuell) {
                if (i.istWochenende== true) {
                    anzahl +=1;
                }

            }
            return anzahl;
    }



        public static void main(String[] args) {
        Main2 liste = new Main2();
        liste.Wochentagprinten();
            System.out.println(liste.WochentagAnzahl());

    }
}
