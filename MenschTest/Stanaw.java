package MenschTest;

public class Stanaw {
    public static void main(String[] args) {

        Punkt p1 = new Punkt(3, 2);

        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.setX(5);
        System.out.println(p1.getX());
        System.out.println(p1);

    }



    public static class Punkt {
        double x;
        double y;

        Punkt(double x, double y) {
            this.x = x;
            this.y = y;
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

        public double getY(){
            return y;
        }

        @Override
        public String toString() {
            return "Koordinate X ist: " + String.valueOf(x) +  " Koordinate Y ist: " + String.valueOf(y);
        }
    }

}