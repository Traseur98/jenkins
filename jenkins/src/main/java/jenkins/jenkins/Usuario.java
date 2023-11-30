package jenkins.jenkins;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private String ciudad;
    private int edad;

    public Usuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese apellido:");
        this.apellido = scanner.nextLine();

        System.out.println("Ingrese ciudad:");
        this.ciudad = scanner.nextLine();

        System.out.println("Ingrese edad:");
        this.edad = scanner.nextInt();
    }

    // Getters y Setters (puedes generarlos automáticamente en tu IDE)
}

