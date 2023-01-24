public class Graduate extends Student {
  // Data field
  private String status;
  
  // Constructor
  public Graduate(int id, double gpa){
    super(id, gpa);
  }

  // Mehtods
  public String getStatus(){
    if (super.getGpa() >= 3.0){
      status = "Good";
    }
    else{
      status = "Probation";
    }
    return status;
  }
}
