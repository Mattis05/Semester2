package VererbungP1;

public class Werkstatt {

    public static void main(String[] args) {
        Motorrad m = new Motorrad();
        LKW l = new LKW();
        Biocar b = new Biocar();

        testbar[] test = new testbar[3];

        test[0]=m;
        test[1]=l;
        test[2]=b;

        for (testbar x: test){
            x.test();
        }
    }
}
