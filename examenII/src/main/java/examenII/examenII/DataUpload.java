package examenII.examenII;

import java.time.LocalDate;
import java.util.Scanner;

public class DataUpload {

  private Employee employee;

  public DataUpload() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter employee details:");

    System.out.println("Name: ");
    String name = scanner.nextLine();

    System.out.print("Surname: ");
    String surname = scanner.nextLine();

    System.out.print("Gender: ");
    String gender = scanner.nextLine();

    System.out.print("Address: ");
    String address = scanner.nextLine();

    System.out.print("Age: ");
    Integer age = Integer.parseInt(scanner.nextLine());

    System.out.print("Position: ");
    String position = scanner.nextLine();

    System.out.print("Start date (YYYY-MM-DD): ");
    LocalDate startDate = LocalDate.parse(scanner.nextLine());

    System.out.print("Last day (YYYY-MM-DD): ");
    LocalDate lastDay = LocalDate.parse(scanner.nextLine());

    System.out.print("Salary: ");
    double salary = Double.parseDouble(scanner.nextLine());
    scanner.close();
    Employee employee = new Employee(
      name,
      surname,
      gender,
      address,
      age,
      startDate,
      lastDay,
      position,
      salary
    );
    System.out.println(employee);
    this.employee = employee;
  }

  public Employee getEmployee() {
    return employee;
  }

}
