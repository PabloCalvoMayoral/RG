package edu.alonso.tema3.banco.modelo;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String dni;

	public Persona(String nombre, String apellido1, int edad, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.edad = edad;
		this.dni = dni;
	}

	public Persona(String nombre, String apellido1, String apellido2, int edad, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", dni=" + dni;
	}

}
