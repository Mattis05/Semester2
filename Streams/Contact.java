package Streams;




import java.io.*;
import java.util.Arrays;

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

        String FriseurString ="";
        String[] Kontakte ={FriseurString};




        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Friseur.json"));
            for (String i:Kontakte){
                writer.write("\n"+i);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("nachbar.json"));
            String line;
            while((line= reader.readLine()) !=null)
                System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}