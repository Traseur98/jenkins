package examenII.examenII;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class Employee extends Person implements EmployeeIntr {

  private LocalDate releaseDate, departureDay;
  private String position;
  private Double netSalary, salary;
  private Long days;
  private Boolean rotation;

  public Employee(
    String name,
    String surname,
    String sexo,
    String adress,
    Integer age,
    LocalDate releaseDate,
    LocalDate departureDay,
    String posicion,
    Double salary
  ) {
    super(name, surname, sexo, adress, age);
    this.releaseDate = releaseDate;
    this.departureDay = departureDay;
    this.position = posicion;
    this.salary = salary;
    rotation = Rotation();
    netSalary = getNetSalary(0.83);
    days = getDaysInJob();
  }

  @Override
  public String toString() {
    return (
      "Employee [releaseDate=" +
      releaseDate +
      ", departureDay=" +
      departureDay +
      ", position=" +
      position +
      ", netSalary=" +
      netSalary +
      ", salary=" +
      salary +
      ", days=" +
      days +
      ", rotation=" +
      rotation +
      ", toString()=" +
      super.toString() +
      "]"
    );
  }

  @Override
  public Double getNetSalary(Double per) {
    return salary * per;
  }

  @Override
  public Long getDaysInJob() {
    return DAYS.between(releaseDate, LocalDate.now());
  }

  @Override
  public Boolean Rotation() {
    if (position.equals("Ingeniero") && getDaysInJob() >= 530) {
      return true;
    } else {
      return false;
    }
  }
}
