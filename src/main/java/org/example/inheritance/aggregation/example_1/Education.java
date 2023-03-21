package org.example.inheritance.aggregation.example_1;


import java.util.List;

public class Education {
  private List<Person> students;

    public Education() {
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }
}
