package examen.examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    Book book1 = new Book("The Catcher in the Rye", "Fiction", "J.D. Salinger");
    Book book2 = new Book("To Kill a Mockingbird", "Fiction", "Harper Lee");
    Book book3 = new Book("1984", "Dystopian", "George Orwell");
    Book book4 = new Book("The Great Gatsby", "Classic", "F. Scott Fitzgerald");
    Book book5 = new Book("Harry Potter", "Fantasy", "J.K. Rowling");

    User user1 = new User(
      "John",
      "Doe",
      "123 Main St",
      25,
      1,
      LocalDate.of(2022, 1, 15)
    );
    User user2 = new User(
      "Jane",
      "Smith",
      "456 Oak St",
      30,
      2,
      LocalDate.of(2021, 8, 20)
    );
    User user3 = new User(
      "Bob",
      "Johnson",
      "789 Pine St",
      22,
      3,
      LocalDate.of(2023, 3, 5)
    );
    User user4 = new User(
      "Alice",
      "Williams",
      "101 Elm St",
      28,
      4,
      LocalDate.of(2020, 11, 10)
    );
    User user5 = new User(
      "Charlie",
      "Brown",
      "202 Cedar St",
      35,
      5,
      LocalDate.of(2022, 5, 2)
    );

    Booking booking1 = new Booking(LocalDate.of(2023, 1, 1), user1, book1);
    Booking booking2 = new Booking(LocalDate.of(2023, 2, 5), user2, book2);
    Booking booking3 = new Booking(LocalDate.of(2023, 3, 10), user3, book3);
    Booking booking4 = new Booking(LocalDate.of(2023, 4, 15), user4, book4);
    Booking booking5 = new Booking(LocalDate.of(2023, 5, 20), user5, book5);
    Booking booking6 = new Booking(LocalDate.of(2023, 6, 25), user1, book2);
    Booking booking7 = new Booking(LocalDate.of(2023, 7, 30), user2, book3);
    Booking booking8 = new Booking(LocalDate.of(2023, 8, 5), user3, book4);
    Booking booking9 = new Booking(LocalDate.of(2023, 12, 1), user4, book5);
    Booking booking10 = new Booking(LocalDate.of(2023, 11, 25), user5, book1);

    List<Booking> lb = List.of(
      booking1,
      booking2,
      booking3,
      booking4,
      booking5,
      booking6,
      booking7,
      booking8,
      booking9,
      booking10
    );
    Util u = new Util(
      "C:\\Users\\pablo\\Desktop\\Cursos Pablo\\Java\\Repo\\examen\\inventario_y_vencimiento_fechaHoy"
    );
    u.WriteAllTxt(lb);
  }
}
