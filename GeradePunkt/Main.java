package GeradePunkt;

import GeradePunkt.Gerade;
import GeradePunkt.Punkt;

public class Main {

    public static void main(String[] args) {
        Punkt p1= new Punkt(1,2);
        Punkt p2= new Punkt(5,4);
        Punkt p3= new Punkt(90,80);
        Punkt p4= new Punkt(5,2 );

        Gerade g1 = new Gerade(p1, p2);
        Gerade g2 = new Gerade(p3, p4);

        System.out.println("Test 1 = "+g1);
        System.out.println("Test 2="+g2);
        System.out.println("Test 3="+g1.berechneSchnittpunkt(g2));




    }
}
