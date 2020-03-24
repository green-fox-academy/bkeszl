package cloneable;

public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + super.getName() + " a " + super.getAge() + " year old "
        + super.getGender() + " from " + this.previousOrganization + " who skipped "
        + this.skippedDays + " days already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super("Jane Doe", 30, "female");
    this.previousOrganization = "School of Life";
    this.skippedDays = 0;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
