package NochmalStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    List<Student> liste = new ArrayList<>();

    public void addStudent(Student toadd){
        liste.add(toadd);
    }
    public void printStudent(){
        for( Student x:liste){
            System.out.println(x.firstname+" "+ x.lastname+" "+x.points);
        }
    }

    public void sort(){
        Collections.sort(liste);
    }

    public static void main(String[] args) {
        Exam e = new Exam();
        Student s1= new Student("Mattis","Hahn",10);
        Student s2= new Student("Lars","shesh",84);
        Student s3= new Student("Olga","Kek",4);

        e.addStudent(s1);
        e.addStudent(s2);
        e.addStudent(s3);
        e.printStudent();
        e.sort();
        e.printStudent();

    }
}
