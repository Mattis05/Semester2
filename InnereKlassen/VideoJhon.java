package InnereKlassen;

import jdk.incubator.vector.VectorOperators;

import java.util.ArrayList;

public class VideoJhon {
    int number = 5;
    public void hey(){
        System.out.println("Heyy");

        }



    public static void main(String[] args) {
        VideoJhon v1 = new VideoJhon();

        ArrayList<VideoJhon> liste = new ArrayList<>();
        liste.add(new VideoJhon());
        Testarbeitert t1 = new Testarbeitert() {
            @Override
            public void machlaut() {

            }
        };

        for(int i = 0; i<liste.size();i++){
            liste.get(i).hey();

        }


        }

}
}
