package edu.alonso.tema3.banco.modelo;

public class Domicilio {

	private String calle;
	private int numero;
	private int piso;
	private char letra;
	private String ciudad;
	private String provincia;
	private int codigoPostal;
	
	public Domicilio(String calle, int numero, String ciudad, String provincia,
			int codigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}

	public Domicilio(String calle, int numero, int piso, char letra, String ciudad, String provincia,
			int codigoPostal) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.letra = letra;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", letra=" + letra + ", ciudad="
				+ ciudad + ", provincia=" + provincia + ", codigoPostal=" + codigoPostal;
	}

}
