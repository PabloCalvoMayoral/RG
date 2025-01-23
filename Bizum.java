package edu.alonso.tema3.banco.modelo;

public class Bizum extends OperacionBancaria {

	private long tfnoOrigen;
	private long tfnoDestino;

	public Bizum(Persona cliente, Domicilio domicilio, long tfnoOrigen, long tfnoDestino) {
		super(cliente, domicilio);
		this.tfnoDestino = tfnoDestino;
		this.tfnoOrigen = tfnoOrigen;

	}

	public long getTfnoOrigen() {
		return tfnoOrigen;
	}

	public void setTfnoOrigen(long tfnoOrigen) {
		this.tfnoOrigen = tfnoOrigen;
	}

	public long getTfnoDestino() {
		return tfnoDestino;
	}

	public void setTfnoDestino(long tfnoDestino) {
		this.tfnoDestino = tfnoDestino;
	}

	@Override
	public String toString() {
		
		//return "Bizum " + super.toString() + ",tfnoOrigen=" + tfnoOrigen + ", tfnoDestino=" + tfnoDestino;
		return "Bizum: cliente {" + getCliente() + "}, iban: " + this.getIban() + ", domicilio {" + super.getDomicilio() + "},tfnoOrigen=" + tfnoOrigen + ", tfnoDestino=" + tfnoDestino;
	}

}
