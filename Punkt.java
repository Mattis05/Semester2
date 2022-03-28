import jdk.dynalink.linker.MethodTypeConversionStrategy;

public class Punkt {
    double x;
    double y;


    Punkt(double x, double y){
        this.x=x;
        this.y=x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public double getY() {

        return y;
    }
    void Punktausgabe(){
        System.out.println("Punkt liegt bei x= "+ this.x + " y = " + this.y);
    }

    public static void main(String[] args) {
        Punkt p1= new Punkt(3,2);
        //p1.Punktausgabe();
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.setX(6);
        p1.setY(33);
        System.out.println(p1);
        System.out.println(p1.toString());
    }

    @Override
    public String toString() {
        return "Koordinate X ist: "+ x +  " Koordinate Y ist: " + y;
       // return "x: " + x + ", y: " + y;
    }

}
