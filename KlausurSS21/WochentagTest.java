package KlausurSS21;

import java.util.ArrayList;
import java.util.*;

public class WochentagTest {

    List<Wochentag> liste2 = new ArrayList();

    public WochentagTest(){
        for (int i = 0; i <= 20; i++) {
            Random zufall = new Random();
            int zufallszahl = zufall.nextInt(7);
            switch (zufallszahl) {
                case 0:
                    liste2.add(Wochentag.MONTAG);
                    break;
                case 1:
                    liste2.add(Wochentag.DIENSTAG);
                    break;
                case 2:
                    liste2.add(Wochentag.MITTWOCH);
                    break;
                case 3:
                    liste2.add(Wochentag.DONNERSTAG);
                    break;
                case 4:
                    liste2.add(Wochentag.FREITAG);
                    break;
                case 5:
                    liste2.add(Wochentag.SAMSTAG);
                    break;
                case 6:
                    liste2.add(Wochentag.FREITAG);
                    break;
            }

        }
    }

        void printer() {
            for (Wochentag x : liste2) {
                System.out.println(x);

            }
        }
        public int Wochenendeprinter () {
            int erg = 0;
            for (Wochentag i : liste2) {

                if (i.istWochenende == true) {
                    erg += 1;
                }
            }
            return erg;
        }



    public static void main(String[] args) {
        WochentagTest c = new WochentagTest();
        c.printer();
        System.out.println(c.Wochenendeprinter());

    }
}
