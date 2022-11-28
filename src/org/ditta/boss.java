package org.ditta;

import java.time.LocalDate;

public class boss extends Person {
	private int stipendio;
	private int bonus;
	
	public boss(String nome, String cognome, LocalDate compleanno, int stipendio, int bonus) {
		super(nome,cognome,compleanno);
		
		setStipendio(stipendio);
		setBonus(bonus);
	}
	
	

	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}


	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;r 
	}

	@Override
	public int getYearIncome() {
		
		return getStipendio() * 12 + getBonus();
	}
	
	@Override
	public String toString() {
		return "Boss: " + super.toString() + "\nStipendio annuo: " + getYearIncome();
	}
}
