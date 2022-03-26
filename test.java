public class test {

    public static void main(String[] args){
        int []zahlen=new int[10];

        zahlen[0]=4;
        zahlen[1]=10;
        zahlen[2]=0;
        zahlen[3]=33;
        zahlen[4]=-21;
        zahlen[5]=92;
        zahlen[6]=3;
        zahlen[7]=-2;
        zahlen[8]=43;
        zahlen[9]=87;


        int Maximum=0;

        for(int i=0; i < zahlen.length-1;i++){
            if (Maximum < zahlen[i]){
                Maximum=zahlen[i];
            }

        }
        System.out.println("Das Max. ist "+Maximum);

        int Minimum=0;

        for(int i=0; i < zahlen.length-1;i++){
            if (Minimum > zahlen[i]){
                Minimum=zahlen[i];
            }

        }
        System.out.println("Das Minimum ist"+Minimum);


        int durchschnitt=0;
        double richtige;
        for(int i=0; i < zahlen.length;i++){
            durchschnitt=durchschnitt+zahlen[i];

            }
        richtige=durchschnitt/zahlen.length;
        System.out.println(richtige);

        }

    }



