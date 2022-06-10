package Baum;

public class Tree {

         Tree links,rechts;
         int daten;

        public Tree(int daten){
            this.daten=daten;
        }

        public Tree(){
        }
/*
    public void insert(int value){
        if(root==null){

            root= new Tree(value);
        }
        else{
            insert(root,value);
        }
    }

 */
    public void insert( int wert) {
        if (wert <= daten) {
            if (links == null) {
                links = new Tree(wert);
            } else {
                links.insert(wert);
            }
        } else {

            if (rechts == null) {
                rechts = new Tree(wert);
            }

        else{
            rechts.insert(wert);
        }
    }


    }
    public void printInOrder(){
        if(links!=null){
            links.printInOrder();
        }
        System.out.println(daten+ "");
        if(rechts!=null){
            rechts.printInOrder();
        }
    }
    public int random(){
            return (int)(Math.random()*201);
    }

    public static void main(String[] args) {
            Tree t1 = new Tree();

          for(int i =0;i<20;i++){
            t1.insert(t1.random());
         }
        t1.printInOrder();
    }

}
