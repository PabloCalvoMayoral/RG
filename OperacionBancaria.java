package edu.alonso.tema3.banco.modelo;

import java.util.Random;

public class OperacionBancaria {

	private Persona cliente;
	private String iban;
	private Domicilio domicilio;

	public OperacionBancaria(Persona cliente, Domicilio domicilio) {
		this.cliente = cliente;
		this.domicilio = domicilio;
		this.iban = generaIban2();
	}

	protected String generaIban2() {
		final String PREFIJO1 = "ES91";
		final String PREFIJO2 = "ES32";
		final String PREFIJO3 = "ES45";

		String iban = null;

		Random r = new Random();
		
		int aleatorio = r.nextInt(3);
		switch (aleatorio) {
		case 0:
			iban = PREFIJO1;
			break;
		case 1:
			iban = PREFIJO2;
			break;
		case 2:
			iban = PREFIJO3;
			break;
		}

		for (int i = 0; i < 20; i++) {
			iban += r.nextInt(10);
		}
		return iban;
	}
	
	protected String generaIban() {
		final String PREFIJO1 = "ES91";
		final String PREFIJO2 = "ES32";
		final String PREFIJO3 = "ES45";

		String iban = null;

		Random r = new Random();
		
		int aleatorio = r.nextInt(3);
		switch (aleatorio) {
		case 0:
			iban = PREFIJO1;
			break;
		case 1:
			iban = PREFIJO2;
			break;
		case 2:
			iban = PREFIJO3;
			break;
		}

		for (int i = 0; i < 5; i++) {
			aleatorio = r.nextInt(10000);
			String textoGenerado = "";
			if (aleatorio < 10) {
				textoGenerado = "000" + aleatorio;
			} else if (aleatorio < 100) {
				textoGenerado = "00" + aleatorio;
			} else if (aleatorio < 1000) {
				textoGenerado = "0" + aleatorio;
			} else {
				textoGenerado = Integer.valueOf(aleatorio).toString();
			}

			iban += textoGenerado;
		}
		return iban;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public String getIban() {
		return iban;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "cliente [" + cliente.toString() + "], iban=" + iban + ", domicilio=[" + domicilio.toString() + "]";
	}

}
