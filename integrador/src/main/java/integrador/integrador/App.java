package integrador.integrador;

import java.util.List;

public class App {

  public static void main(String[] args) {
    Util util = new Util(
      "C:\\Users\\pablo\\Desktop\\Cursos Pablo\\Java\\Repo\\integrador\\films.txt"
    );
    List<Film> films2022 = util.readCSV();
    List<Film> films2023 = films2022
      .stream()
      .peek(f -> {
        f.setIncomings(f.getIncomings() / 2);
        f.setRooms(f.getRooms() / 2);
      })
      .toList();
    for (Film l : films2023) {
      System.out.println(l.toString());
    }
    Writter wr = new Writter(
      "C:\\Users\\pablo\\Desktop\\Cursos Pablo\\Java\\Repo\\integrador\\JenkinsFile"
    );
    wr.WriteOneTxt(Jenkins.generateJenkinsfile(films2023));
  }
}
