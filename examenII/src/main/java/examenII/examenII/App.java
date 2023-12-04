package examenII.examenII;

import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    Util u = new Util("C:\\Users\\pablo\\Desktop\\Cursos Pablo\\Java\\Repo\\examenII\\empelados.txt");
    LocalDate startDate = LocalDate.of(2022, 1, 1);
    LocalDate lastDay = LocalDate.of(2023, 1, 1);
    Employee employee = new Employee("John", "Doe", "Male","123 Main St",20, startDate, lastDay,"Developer", 50000.0);
    //DataUpload dt = new DataUpload();
    JsonConventer json = new JsonConventer(employee);
    System.out.println(employee.toString());
    
    u.WriteOneTxt(json.getJson());
  }
}
