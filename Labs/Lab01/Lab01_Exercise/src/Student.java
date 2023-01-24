public abstract class Student {

  // Data field:
  private int id;
  private double gpa;

  // Constructor
  public Student(int id, double gpa){
    this.id = id;
    this.gpa = gpa;
  }

  // Methods
  public abstract String getStatus();

  

  public int getId() {
    return id;
  }

  public double getGpa() {
    return gpa;
  }

  public final String displayStudent(){
    return "ID: " + id + ", GPA: " + gpa + ", Status: " + getStatus();
  }
}
