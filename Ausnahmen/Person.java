package Ausnahmen;

public class Person {
    String name;
    int alter;

    public Person(String name, int alter) {
            try{
                if(alter>130 || alter<1){
                    throw new PersonExeption("Nummer nicht zwischen 0 und 130");
                }
                if(name ==null){
                    throw new PersonExeption("Name darf nicht null sein");
                }
                this.name = name;
                this.alter = alter;

            }catch (PersonExeption e){
                System.out.println(e.getMessage());
            }
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", alter=" + alter + '}';
    }


    public static void main(String[] args) {
        Person p1 = new Person("Max",500);
        System.out.println(p1);
        Person p2 = new Person(null,20);
        System.out.println(p2);
        Person p3 = new Person("TEst",13);
        System.out.println(p3);

    }
}
