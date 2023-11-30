package jenkinsII.jenkinsII;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ControlCalidad {
    private static List<Empleado> empleados = new ArrayList<>();

    public static void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public static void verificarInfracciones() {
        System.out.println("Empleados con infracción:");

        for (Empleado empleado : empleados) {
            if (!estaEnHorario(empleado)) {
                aplicarDescuento(empleado);
                System.out.println("Nombre: " + empleado.getNombre() +
                        ", Posición: " + empleado.getPosicion() +
                        ", Descuento: " + calcularDescuento(empleado) * 100 + "%");
            }
        }
    }

    private static boolean estaEnHorario(Empleado empleado) {
        try {
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

            Date horarioIngresoEstipulado = (Date) formatoHora.parse(obtenerHorarioIngresoEstipulado(empleado.getPosicion()));
            Date horarioEgresoEstipulado = (Date) formatoHora.parse(obtenerHorarioEgresoEstipulado(empleado.getPosicion()));

            Date horarioIngresoEmpleado = (Date) formatoHora.parse(empleado.getHorarioIngreso());
            Date horarioEgresoEmpleado = (Date) formatoHora.parse(empleado.getHorarioIngreso());

            return horarioIngresoEmpleado.equals(horarioIngresoEstipulado) || horarioIngresoEmpleado.after(horarioIngresoEstipulado)
                    && horarioEgresoEmpleado.equals(horarioEgresoEstipulado) || horarioEgresoEmpleado.before(horarioEgresoEstipulado);

        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static String obtenerHorarioIngresoEstipulado(String posicion) {
        switch (posicion) {
            case "CEO":
                return "07:00";
            case "Jefe":
                return "08:00";
            case "Ingeniero":
            case "Analista":
            case "Scrum Master":
            case "RRHH":
                return "09:00";
            default:
                return "";
        }
    }

    private static String obtenerHorarioEgresoEstipulado(String posicion) {
        switch (posicion) {
            case "CEO":
            case "Jefe":
                return "18:00";
            case "Ingeniero":
            case "Scrum Master":
            case "RRHH":
                return "18:00";
            case "Analista":
                return "17:00";
            default:
                return "";
        }
    }
    

    private static void aplicarDescuento(Empleado empleado) {
        empleado.setSueldo(empleado.getSueldo() * (1 - calcularDescuento(empleado)));
    }

    private static double calcularDescuento(Empleado empleado) {
        switch (empleado.getPosicion()) {
            case "CEO":
                return 0.01;
            case "Jefe":
                return 0.05;
            case "Ingeniero":
                return 0.15;
            case "Analista":
                return 0.20;
            case "Scrum Master":
                return 0.10;
            case "RRHH":
                return 0.09;
            default:
                return 0.0;
        }
    
    }
}
