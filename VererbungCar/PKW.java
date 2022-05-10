package VererbungCar;

import java.sql.SQLOutput;

public class PKW extends Kraftwagen{
    int personen=0;
    int Maxpersonen=5;
    void transporieren(){

    }
    void aussteigen(){
        if (personen>0){
            personen-=1;
            System.out.println("Ausgestiegen!, personen :" + personen);
        }
        else{
            System.out.println("Alle ausgestiegen");
        }

    }
    void einsteigen(){
        if(personen+1<=Maxpersonen){
            personen+=1;
            System.out.println("Eingestiegen, personen :"+ personen);
        }
        else{
            System.out.println("Auto ist voll!");
        }

    }
}
