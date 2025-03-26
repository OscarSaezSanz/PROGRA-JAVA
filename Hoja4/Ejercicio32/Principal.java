package Ejercicio32;

public class Principal {
	public static void main (String[] args) {
		Persona persona1 = new Persona();
		persona1.mostrarDatos();
		
		Persona persona2 = new Persona("Oscar");
		persona2.mostrarDatos();
		
		Persona persona3 = new Persona("Oscar", 19);
		persona3.mostrarDatos();
	}
}
