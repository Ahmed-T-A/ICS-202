public class StudentTest {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[10];
        for(int i = 0; i < 10; i=i+2){
            int id = (int)(Math.random() * 999999);
            double gpa = Math.random() * 4.00;
            gpa = (double)Math.round(gpa * 100) / 100;
            int id2 = (int)(Math.random() * 999999);
            double gpa2 = Math.random() * 4.00;
            gpa2 = (double)Math.round(gpa * 100) / 100;
            students[i] = new Undergraduate(id, gpa);
            students[i + 1] = new Graduate(id2, gpa2);
        }

        System.out.println("************************************");
        for (Student k : students){
            if (k instanceof Graduate){
                System.out.println("Graduate: " + k.displayStudent());
            }
            else{
                System.out.println("Undergraduate: " + k.displayStudent());
            }
        }
        System.out.println("************************************");
    }
}
