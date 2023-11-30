package jenkinsII.jenkinsII;

public class App 
{
    public static void main( String[] args )
    {
    	ControlCalidad.agregarEmpleado(new Empleado());
        ControlCalidad.agregarEmpleado(new Empleado());
        ControlCalidad.verificarInfracciones();
    }
}
