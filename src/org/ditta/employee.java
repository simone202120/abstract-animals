package org.ditta;

import java.time.LocalDate;

public class employee extends Person {
	private int stipendio;
	private int mensilita;
	
	public employee(String nome, String cognome, LocalDate compleanno, int stipendio, int stipendioMensile) {
		
		super(nome,cognome,compleanno);
		setStipendio(stipendio);
		setMensilita(mensilita);
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public int getMensilita() {
		return mensilita;
	}

	public void setMensilita(int mensilita) {
		this.mensilita = mensilita;
	}

	@Override
	public int getYearIncome() {
		
		return getStipendio() * getMensilita();
	}
	
	@Override
	public String toString() {
		return "Impiegato: "+ super.toString() + "\nStipendio annuo: " + getYearIncome();
	}
	
}
