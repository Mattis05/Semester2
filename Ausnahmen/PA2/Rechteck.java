package Ausnahmen.PA2;

public class Rechteck {
    int a;
    int b;

    public Rechteck(int a, int b) {
        try{
            if(a<0){
                throw new Negative_Kantenlaenge("--------------A muss Positiv sein--------------");
            }
            if(b<0){
                throw new Negative_Kantenlaenge("--------------B muss Positiv sein--------------");
            }
            this.a=a;
            this.b=b;

        } catch (Negative_Kantenlaenge e) {
            System.out.println(e.getMessage());
        }

    }
    public void flaeche(){
        int erg;
        erg=a*b;
        System.out.println("Flaecheninhalt lautet : "+erg +"m²");

    }

    @Override
    public String toString() {
        return "Rechteck{" + "a=" + a + ", b=" + b + '}';
    }

    public static void main(String[] args) {
        Rechteck R1 = new Rechteck(40,20);
        System.out.println(R1);
        R1.flaeche();
        Rechteck R2 = new Rechteck(20,-40);
        System.out.println(R2);
        R2.flaeche();

    }
}
