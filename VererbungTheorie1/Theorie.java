package VererbungTheorie1;


import java.sql.SQLOutput;

interface I {
    default public void m(){
        System.out.println("m() vib I");
    }

}
class A implements I{
    public void m(String s){
        System.out.println("m(" + s + ") von A");
    }
}

class B extends A{
    public void m(){
        System.out.println("m() von B");
    }
}

public class Theorie {
    public static void main(String[] args) {
        A a = new B();
        a.m();

       //B b = new A(); //kompelier fehler funktioniert garnicht
        //b.m();



        I i = new A();
        ((A)i).m("test"); // funktioniert weil 34 richtig ist aber I nur m() hat ohne m(string) laufzeitfehler
    }
}

