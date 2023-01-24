public class BookTest {
    public static void main(String[] args) throws Exception {
        Book[] books = new Book[10];
        books[0] = new Book("Data Structures", 700);
        books[1] = new Textbook("Python", 300, "ICS 104");
        books[2] = new Book("Java", 450);
        books[3] = new Textbook("Introduction to software", 800, "SWE 206");
        books[4] = new Book("Data Science", 500);
        books[5] = new Textbook("Differencial Equation", 630, "MATH 208");
        books[6] = new Book("introduction to report writing", 250);
        books[7] = new Textbook("discrete Math", 375, "ICS 253");
        books[8] = new Book("Mips", 200);
        books[9] = new Textbook("introduction to physics", 1000, "Phys 101");

        int textBookCounter = 0;
        int bookCounter = 0;

        for(int i = 0; i < books.length; i++){
            if (books[i] instanceof Textbook ){
                textBookCounter++;
            }
            else{
                bookCounter++;
            }
        }

        //-----------------------
        System.out.println("*******************************");
        for(Book i : books){
            if(i instanceof Textbook){
                System.out.println("Text Book: " + i.toString());
            }
            else{
                System.out.println("Book: " + i.toString());
            }
        }
        System.out.println("\nNumber of Books = " + bookCounter);
        System.out.println("Number of TextBooks = " + textBookCounter);
        System.out.println("*******************************");

    }
}
