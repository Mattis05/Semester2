package Streams;




import java.util.Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Contact {
    String name;
    String[] numbers;

    public Contact(String name, String[] numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Contact{" + "name='" + name + '\'' + ", numbers=" + Arrays.toString(numbers) + '}';
    }

    public static void main(String[] args) {
        Contact friseur = new Contact("Friseur", new String[]{"0506"});

        System.out.println(friseur);


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.json"));
            writer.write("ssda");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
