package Collections;


    public enum Wochentage2 {
        MONTAG(false),
        DIENSTAG(false),
        MITTWOCH(false),
        DONNERSTAG(false),
        FREITAG(false),
        SAMSTAG(true),
        SONNTAG(true);


        public boolean istWochenende;

        private Wochentage2(boolean istWochenende){
            this.istWochenende=istWochenende;
        }

    }
