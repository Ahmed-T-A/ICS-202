public class Book {
  
  // Data field
  private String title;
  private int pages;

  // Constructor
  public Book(String title, int pages){
    this.title = title;
    this.pages = pages;
  }

  // Methods
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public String toString(){
    return title + ", # Pages = " + pages;
  }
}
