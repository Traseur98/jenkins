package examen.examen;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class Booking implements BookingIntr {

  private LocalDate bookingDate;
  private LocalDate bookingEndDate;

  private User user;
  private Book book;

  public Booking(LocalDate bookingDate, User user, Book book) {
    this.bookingDate = bookingDate;
    this.user = user;
    this.book = book;
    this.bookingEndDate = bookingDate.plusDays(10);
  }

  public LocalDate getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public LocalDate getBookingEndDate() {
    return bookingEndDate;
  }

  public void setBookingEndDate(LocalDate bookingEndDate) {
    this.bookingEndDate = bookingEndDate;
  }

  @Override
  public long MoneyToPay() {
    long payment = 0;
    if (IsDefaulter()) {
      payment = DaysOfDefaulter();
    }
    return payment;
  }

  @Override
  public Boolean IsDefaulter() {
    Boolean res = false;
    if (LocalDate.now().isAfter(bookingEndDate)) res = true;
    return res;
  }

  @Override
  public long DaysOfDefaulter() {
    long days = 0;
    if (IsDefaulter()) {
      days = DAYS.between(bookingEndDate, LocalDate.now());
    }
    return days;
  }

  @Override
  public String toString() {
    String defaulter = (IsDefaulter()) ? "SI" : "NO";
    String state = (IsDefaulter()) ? "VENCIDO" : "EN REGLA";
    return (
      "Booking [bookingDate=" +
      bookingDate +
      ", bookingEndDate=" +
      bookingEndDate +
      ", user=" +
      user.toString() +
      ", days of defaulter=" +
      DaysOfDefaulter() +
      ", Defaulter=" +
      defaulter +
      ", State=" +
      state +
      ", State=" +
      MoneyToPay() +
      "euros , book=" +
      book.toString() +
      "]"
    );
  }
}
