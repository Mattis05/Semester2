package Collections;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.*;



public class Classlist {
    List<Student> students = new ArrayList();  // Was heißt der Hinweis hier? Raw use of parameterized class 'ArrayList'

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

}
