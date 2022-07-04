package Hashing;

import java.net.PasswordAuthentication;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.security.MessageDigest;



public class Adresse{
String strasse;
int hausnummer;
int postleitzahl;

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public Adresse(String strasse, int hausnummer, int postleitzahl) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
    }

    @Override
    public boolean equals(Object o) {
        //Obj referenzen gleich ?
        if (this == o) {
            return true;
        }
        //2. null prüfen
        if (o == null) {
            return false;
        }
        //3. Klassen identisch?
        if (getClass() != o.getClass()) {
            return false;
        }
        //4. Typkonvertierung
        Adresse adresse = (Adresse) o;
        //5. Attribute vergleichen
        return this.strasse == adresse.strasse && this.hausnummer == adresse.hausnummer && this.postleitzahl == adresse.postleitzahl;
    }

        @Override
        public int hashCode() {
            return Objects.hash(strasse,hausnummer,postleitzahl);

    }




    @Override
    public String toString() {
        return "\nAdresse:" + "strasse='" + strasse + '\'' + ", hausnummer=" + hausnummer + ", postleitzahl=" + postleitzahl+" Baujahr :";
    }
        public static void main(String[] args) {
            Adresse a1 = new Adresse("Alteburgstrasse",150,72762);
            Adresse a2 = new Adresse("Alteburgstrasse",150,72762);
            Adresse a3 = new Adresse("Alteburgstrasse",151,72762);
            String test = " hallo ";



        System.out.println("-------------------------------------");
        System.out.println(a1.getStrasse().hashCode());
        System.out.println("-------------------------------------");
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.equals(a3));
        System.out.println(a3.hashCode());
        System.out.println("-------------------------------------");


        HashMap<Adresse,Integer> grundbuch= new HashMap();
        grundbuch.put(a1,1917);
        grundbuch.put(a2,2019);
        grundbuch.put(a3,2020);
        System.out.println(grundbuch);
        System.out.println("-------------------------------------");








    }
}

