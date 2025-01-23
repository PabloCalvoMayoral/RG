package edu.alonso.tema3.banco.modelo;

public class Transferencia extends OperacionBancaria {
	
	private String ibanDestino;
	
	public Transferencia(Persona cliente, Domicilio domicilio) {
		super(cliente, domicilio);
		this.ibanDestino = generaIban();
	}


	public String getIbanDestino() {
		return ibanDestino;
	}


	@Override
	public String toString() {
		return "Transferencia: " + super.toString() + ", ibanDestino=" + ibanDestino;
	}


}
