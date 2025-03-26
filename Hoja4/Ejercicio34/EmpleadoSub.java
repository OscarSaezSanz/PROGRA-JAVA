package Ejercicio34;

public class EmpleadoSub extends Empleado {
	
	
	public EmpleadoSub(String nombre, double salario, String departamento) {
		super(nombre, salario, departamento);
	}
	
	public void mostrarDatos() {
		System.out.println("Esto un empleado mostrado desde una subclase: \nNombre: " +nombre+ "\nSalario: " +getsalario()+ "\nDepartamento: " +departamento);
	}
}
