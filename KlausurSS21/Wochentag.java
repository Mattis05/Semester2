package KlausurSS21;

public enum Wochentag {
    MONTAG(false),
    DIENSTAG(false),
    MITTWOCH(false),
    DONNERSTAG(false),
    FREITAG(false),
    SAMSTAG(true),
    SONNTAG(true);


    public boolean istWochenende;

   Wochentag(boolean istWochenende){
       this.istWochenende=istWochenende;

   }

}
