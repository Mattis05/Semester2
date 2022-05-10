package Collections;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.*;



public class Classlist {
    List<Student> students = new ArrayList();

    public void addStudent(Student toAdd) {
        students.add(toAdd);
    }

    public void printStudents() {
        for(Student x: students) {
            System.out.println(x.firstname + " " + x.lastname + ": " + x.points);
        }
    }

   public void sort() {
        Collections.sort(students);
    }
    public static void main(String[] args) {
        Classlist c = new Classlist();
        Student s1 = new Student("Max", "Mueller", 10);
        Student s2 = new Student("Lara", "Klose", 30);

        c.addStudent(s1);
        c.addStudent(s2);

        c.printStudents();

        c.sort();
        c.printStudents();



    }

}
