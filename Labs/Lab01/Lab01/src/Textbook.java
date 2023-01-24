public class Textbook extends Book {

  // Data field
  private String course;
  
  // Constructor
  public Textbook(String title, int pages, String course){
    super(title, pages);
    this.course = course;
  }

  // Methods
  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public String toString(){
    return super.toString() + ", Course = " + course;
  }
}
