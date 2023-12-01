package integrador.integrador;

import java.util.List;

public class Jenkins {

  public static String generateJenkinsfile(List<Film> films) {
    StringBuilder jenkinsfile = new StringBuilder();

    jenkinsfile.append("pipeline {\n");
    jenkinsfile.append("    agent any\n");
    jenkinsfile.append("    stages {\n");
    jenkinsfile.append("        stage('Ejemplo') {\n");
    jenkinsfile.append("            steps {\n");
    jenkinsfile.append("                script {\n");
    for (Film f : films) {
      jenkinsfile.append(
        "                    echo \"Pelicula:" + f.toString() + "\n"
      );
    }
    jenkinsfile.append("                }\n");
    jenkinsfile.append("            }\n");
    jenkinsfile.append("        }\n");
    jenkinsfile.append("    }\n");
    jenkinsfile.append("}\n");

    return jenkinsfile.toString();
  }
}
