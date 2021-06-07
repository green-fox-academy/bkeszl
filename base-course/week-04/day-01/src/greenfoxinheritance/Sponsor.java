package greenfoxinheritance;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super("Jane Doe", 30, "female");
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hy, I'm " +super.getName() + " a " + super.getAge() + " year old "
    + super.getGender() + " who represents " + this.company + " and hired " + this.hiredStudents
    + " so far.");
  }

  public void hire() {
    hiredStudents++;
  }
}
