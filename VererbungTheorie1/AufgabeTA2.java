package VererbungTheorie1;

interface Nameable{
    public String getName();
    public void setName(String name);
}

class Animal implements Nameable{
    private String name;
    private String owner;

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}

class Dog extends Animal{
    private String race;

    public Dog(String name, String owner, String race) {
        super(name, owner);
        this.race = race;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
}

public class AufgabeTA2 {
    public static void main(String[] args) {
        Dog dog= new Dog("Bello","peter","Labrador");
        Animal animal = new Animal("Elsa", "Paul");
        Nameable nameable;

       // dog= (Dog) animal;
        //dog.getRace();
       nameable = dog;
        ((Animal)nameable).getOwner();
    }


}