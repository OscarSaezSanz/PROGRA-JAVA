package Ejercicio34;

public class EmpleadoPrincipal {
	
	public static void main(String[] args) {
	Empleado empleado1 = new Empleado ("Oscar",1760,"Ejecutivo");
	empleado1.mostrarDatos();
	
	EmpleadoSub empleado2 = new EmpleadoSub ("Alonso", 1200, "Pollito");
	empleado2.mostrarDatos();
	}
	
}