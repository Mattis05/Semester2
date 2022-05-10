package VererbungCar;

public class Biocar extends PKW implements recycle{
    void bioabbaubar(){
        System.out.println("ich bin bioabbaubar");
    }

    @Override
    public void recycle() {
        System.out.println("RECYCLEN");
    }
}
