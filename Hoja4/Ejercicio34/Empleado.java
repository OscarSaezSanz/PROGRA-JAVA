package Ejercicio34;

public class Empleado {
	public String nombre;
	private double salario;
	protected String departamento;
	
	public Empleado (String nombre, double salario, String departamento) {
		this.nombre = nombre;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " +nombre+ "\nSalario: " +salario+ "\nDepartamento: " +departamento);	

	}
	
	public double getsalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
	
	
	
