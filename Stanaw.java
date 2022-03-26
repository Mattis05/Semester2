public class Stanaw {

    public static void main(String[] args){
        int []zahlen=new int[10];

        zahlen[0]=3;
        zahlen[1]=3;
        zahlen[2]=3;
        zahlen[3]=3;
        zahlen[4]=3;
        zahlen[5]=3;
        zahlen[6]=3;
        zahlen[7]=3;
        zahlen[8]=3;
        zahlen[9]=3;


        int Maximum=0;

        for(int i=0; i < zahlen.length-1;i++){
            if (Maximum < zahlen[i]){
                Maximum=zahlen[i];
            }

        }
        System.out.println("Das Max. ist "+Maximum);

        int Minimum=zahlen[0];

        for(int i=0; i < zahlen.length-1;i++){
            if (Minimum > zahlen[i]){
                Minimum=zahlen[i];
            }

        }
        System.out.println("Das Minimum ist"+Minimum);


        double durchschnitt=0;
        double richtige;
        for(int i=0; i < zahlen.length;i++){
            durchschnitt=durchschnitt+zahlen[i];

        }
        richtige=durchschnitt/zahlen.length;
        System.out.println("Durchschnitt"+richtige);



        double sum = 0;

        for(int i : zahlen){
            sum+=Math.pow(i-richtige, 2);
        }

        double ergebnis2=Math.sqrt(sum/( zahlen.length -1 ));
        System.out.println("Standartabwichung"+ergebnis2);

    }

}


