package InnereKlassen;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayComparator {
   static <T> void sort(T[] a, Comparator<? super T> c){

   }
    public static void main(String[] args) {
        String[] kette = new String[5];
        kette[0]="ZebraTier";
        kette[1]="Mammut";
        kette[2]="Einhornpferd";
        kette[3]="Lapradorhundfeini";
        kette[4]="Eidechse";

        Arrays.sort(kette,Comparator.comparingInt(String::length));
/*
        for (int i=0;i< kette.length;i++){
           System.out.println(kette[kette.length-1-i]);
        }

 */
        // create a comparator

        Comparator<String> comp = Collections.reverseOrder();

        // sorting array with reverse order using comparator from 0 to 2

      //  Arrays.sort(kette, 0,2,comp);

        // let us print all the elements available in list

        for ( String x : kette) {
            System.out.println("Array = " + x);
        }
    }
}

