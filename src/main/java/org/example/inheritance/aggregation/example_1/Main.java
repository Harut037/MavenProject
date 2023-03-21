package org.example.inheritance.aggregation.example_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    5. Aggregation - child can exist independently of the parent.
//       Example: Bank and Employee, delete the Bank and the Employee still exist
    public static void main(String[] args) {
        //Aggregation
        Person student1 = new Person("Harut", 20);
        Person student2 = new Person("Arman", 21);
        Person student3 = new Person("Hayk", 17);

        List<Person> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Education school = new Education();
        school.setStudents(students);
        for (Person person : school.getStudents()) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
