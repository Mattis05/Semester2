package GeradePunkt;

public class Gerade {
    private Punkt p1;
    private Punkt p2;

    public Gerade(Punkt p1, Punkt p2){
        this.p1= p1;
        this.p2= p2;
    }
    public void setPunkt1(Punkt p1) {
        this.p1=p1;
    }

    public void setPunkt2(Punkt p2) {
        this.p2=p2;
    }

    public Punkt getPunkt1() {
        return p1;
    }

    public Punkt getPunkt2() {
        return p2;
    }
    public Punkt berechneSchnittpunkt(Gerade g){

        double m1 = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        double c1 = p1.getY() - p1.getX() * m1;
        Math.abs(m1);

        double m2 = (g.p2.getY() - g.p1.getY()) / (g.p1.getX() - g.p2.getY());
        Math.abs(m2);
        double c2 = g.p1.getY() - g.p1.getX() * m2;

        double s1 = (c2 - c1) / (m2 - m1); //vll m1-m2
        double s2 = m1 * s1 + c1;

        return new Punkt(s1,s2);

    }

    @Override
    public String toString() {
        return this.p1.toString() + "\n" + this.p2.toString();
    }





}


