package greenfoxinheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
  private String name;
  private List<Student> students;
  private List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = new ArrayList<Student>();
    this.mentors = new ArrayList<Mentor>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + this.name + " cohort has " + students.size() + " students and "
    + mentors.size() + " mentors.");
  }
}
