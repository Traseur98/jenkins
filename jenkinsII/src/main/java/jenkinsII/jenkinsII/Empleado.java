package jenkinsII.jenkinsII;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String posicion;
    private double sueldo;
    private String horarioIngreso;

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getHorarioIngreso() {
		return horarioIngreso;
	}

	public void setHorarioIngreso(String horarioIngreso) {
		this.horarioIngreso = horarioIngreso;
	}

	public Empleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre:");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese posición (CEO, Jefe, Ingeniero, Analista, Scrum Master, RRHH):");
        this.posicion = scanner.nextLine();

        System.out.println("Ingrese sueldo:");
        this.sueldo = scanner.nextDouble();

        System.out.println("Ingrese horario de ingreso (hh:mm):");
        this.horarioIngreso = scanner.next();
        scanner.close();
    }
}