public class Gerade {
    Punkt p1;
    Punkt p2;

    Gerade(Punkt p1,Punkt p2){
        this.p1=p1;
        this.p2=p2;
    }
    public void setPunkt1(Punkt p) {
        this.p1=p;
    }

    public void setPunkt2(Punkt p) {
        this.p2=p;
    }

    public Punkt getPunkt1() {
        return p1;
    }

    public Punkt getPunkt2() {
        return p2;
    }
    public double Steigung(){ //m*x+b
        double m= (getPunkt2().x - getPunkt1().x)/(getPunkt2().y - getPunkt1().y);
        //double b1=getPunkt1().y-m*getPunkt1().x;
        //double b2=getPunkt2().y-m*getPunkt2().x;
        return m;
    }


    public Punkt berechneSchnittpunkt (Gerade g, double m){



    }

    public static void main(String[] args) {
        System.out.println();

    }

}
