package integrador.integrador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Util {

  private String route;
  private FileInputStream fs;
  private BufferedReader br;

  public Util(String route) {
    super();
    this.route = route;
    try {
      FileInputStream fs = new FileInputStream(route);
      this.fs = fs;
      BufferedReader d = new BufferedReader(new InputStreamReader(fs));
      br = d;
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  public List<Film> readCSV() {
    String s;
    List<Film> l = new ArrayList<>();
    int first = 0;
    while (true) {
      try {
        s = br.readLine();
        if (s == null) break;
        if (first != 0) {
          String[] splitted = s.split(";");
          Film f = new Film(
            Integer.parseInt(splitted[1]),
            Integer.parseInt(splitted[2]),
            Double.parseDouble(splitted[3] + ".0"),
            splitted[0]
          );
          l.add(f);
        }
        first++;
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    try {
      this.fs.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return l;
  }
}
