package examenII.examenII;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Util {

  private BufferedWriter bf;

  public Util(String route) {
    try {
      this.bf = new BufferedWriter(new FileWriter(route));
    } catch (IOException e) {
      System.err.println(
        "There was a problem while creating this file: " + e.getMessage()
      );
    }
  }

  public void WriteOneTxt(Object o) {
    this.WriteTxt(o);
    try {
      this.bf.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
    public void WriteAllTxt(List<?> o) {
    for (Object obj : o) {
      this.WriteTxt(obj);
    }
    try {
      this.bf.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void WriteTxt(Object o) {
    try {
      bf.write(o.toString());
      bf.newLine();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}