package VererbungTheorie1;

    class Tier {
        private int anzahlBeine;
        private String name;

        public Tier(String name, int anzahlBeine){
            this.name=name;
            this.anzahlBeine=anzahlBeine;
        }

        public String getName(){
            return name;
        }
        public int getAnzahlBeine(){
            return anzahlBeine;
        }
}
class Hund extends Tier{


    public Hund(String name, int anzahlBeine) {
        super(name, anzahlBeine);
    }

    @Override
    public String toString(){
        String s = "Hund: Name : " + getName()+"; # Beine: "+ getAnzahlBeine();
        return s;
    }

}