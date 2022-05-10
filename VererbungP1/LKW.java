package VererbungP1;

public class LKW extends Kraftwagen {
    int maxLast = 7500;
    int Ladung= 0 ;

    void Ltransportieren() {

    }

    boolean beladen(int k) {
        if (Ladung + k > maxLast){
            return false;
        }
        else{
            Ladung+=k;
            return true;
        }

    }

    void entladen(int k) {
        Ladung -= k;

    }
}