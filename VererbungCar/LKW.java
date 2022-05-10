package VererbungCar;

public class LKW extends Kraftwagen{
    int passagiere;
    int fracht;
    int Maxfracht=150;


    void transporieren(){

    }
    void aussteigen(){
        if (fracht>0){
            fracht-=50;
            System.out.println("Fracht liegt jetzt bei "+fracht);
        }
        else{
            System.out.println("Alles entladet");
        }

    }
    void einsteigen(){
        if(fracht+50<=Maxfracht){
            fracht+=50;
            System.out.println("Fracht liegt jetzt bei"+ fracht);
        }
        else{
            System.out.println("LKW ist voll!");
        }

    }

}
