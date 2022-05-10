package Collections;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {

    String firstname;
    String lastname;
    int points;

    public Student(String firstname, String lastname, int points){
        this.firstname=firstname;
        this.lastname=lastname;
        this.points=points;
    }


    @Override
    public int compareTo(Student o) {
        if (this.points>o.points){
            return -1;
        }
        if (this.points<o.points) {
            return 1;
        }
        return 0;
    }





}
