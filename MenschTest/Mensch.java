package MenschTest;

public class Mensch {
    String name;
    int alter;
    int kalorienvorrat;

    Mensch(String name,int alter){
        this.name=name;
        this.alter=alter;
        this.kalorienvorrat=1100;
    }
    Mensch(String name){
        this(name,0);


    }
    Mensch(){
        this("Noch ohne Name ");
    }

    void stellDichvor() {
        System.out.println("Hallo ich bin der " + this.name + " und bin "+ this.alter + " Jahre alt ");
    }
    void stellDichvor(Mensch gegenüber) {
        System.out.println("Hallo "  +  gegenüber.name + " ich bin der " + this.name + " und bin "+ this.alter + " Jahre alt ");
    }

    String getName(){
        return name;
    }
    void iss(Essen essen){
        System.out.println(this.name + " isst " + essen.name);
        this.kalorienvorrat=this.kalorienvorrat + essen.kalorien;


    }

    public static void main(String[] args) {
        Mensch m1= new Mensch("Mattis",20);
        m1.stellDichvor();
        Mensch m2=new Mensch("Jonas");
        m2.stellDichvor(m1);
        Mensch unbenannt = new Mensch();


        String nameVonm1 =m1.getName();
        System.out.println(nameVonm1);

        Essen essen = new Essen();
        essen.name="kuchen";
        essen.kalorien=800;

        m1.iss(essen);
        System.out.println(unbenannt.kalorienvorrat);






    }
}
