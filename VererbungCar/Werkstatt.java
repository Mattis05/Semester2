package VererbungCar;

public class Werkstatt {
    public static void main(String[] args) {
        Motorrad motorrad1 = new Motorrad();
        LKW LKW1 = new LKW();
        Biocar biocar1 = new Biocar();

        testbar[] testliste = new testbar[3];

        testliste[0]= motorrad1;
        testliste[1]= LKW1;
        testliste[2]= biocar1;

        for(testbar x : testliste){
            x.test();

        }
    }
}
