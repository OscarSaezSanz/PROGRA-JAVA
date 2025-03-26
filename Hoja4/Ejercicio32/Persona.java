package Ejercicio32;

public class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
	}
	
	public Persona() {
		nombre = "desconocido";
		edad = 0;
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	
	void mostrarDatos() {
		System.out.println ("El Nombre de la persona es: " +nombre + "\nY su Edad es: " +edad + " Años");
	
	}	
}
