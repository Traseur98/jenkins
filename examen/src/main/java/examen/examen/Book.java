package examen.examen;

public class Book {

  private String name, category, author;

  public Book(String name, String category, String author) {
    this.name = name;
    this.category = category;
    this.author = author;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book [name=" + name + ", category=" + category + ", author=" + author + "]";
  }
}
