package InnereKlassen;

public class Test2 {
    public static void main(String[] args) {
        Printable d = new Printable() {
            @Override
            public void print() {
                System.out.println("Das hier wurde ├╝berschrieben333");

            }
        };
        d.print();
        print(new Printable() {
            @Override
            public void print() {
                System.out.println("Das hier wurde ├╝berschrieben");

            }
        });
    }


    public static void print(Printable printable){
        printable.print();
    }
}
