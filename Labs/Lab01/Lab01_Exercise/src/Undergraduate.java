public class Undergraduate extends Student {
  
  // Data field
  private String status;
  
  // Constructor
  public Undergraduate(int id, double gpa){
    super(id, gpa);
  }

  // Mehtods
  public String getStatus(){
    if (super.getGpa() >= 3.0){
      status = "Honor";
    }
    else if(super.getGpa() >= 2.0){
      status = "Good";
    }
    else{
      status = "Probation";
    }
    return status;
  }
}
