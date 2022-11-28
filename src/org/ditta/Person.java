package org.ditta;

import java.time.LocalDate;
import java.util.Random;

	public abstract class Person {
	private String nome;
	private String cognome;
	private LocalDate complanno;
	private String codiceAzienda;
	
	public abstract int getYearIncome();
	
	public Person(String nome, String cognome, LocalDate compleanno) {
		
		setNome(nome);
		setCognome(cognome);
		setCompleanno(compleanno);
		generaCodice();		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getCompleanno() {
		return complanno;
	}

	public void setCompleanno(LocalDate complanno) {
		this.complanno = complanno;
	}

	public String getCodiceAzienda() {
		return codiceAzienda;
	}

	public void setCodiceAzienda(String codicezienda) {
		this.codiceAzienda = codicezienda;
	}
	
	public void generaCodice() {
		Random rnd= new Random();
		int codice= rnd.nextInt(10000, 100000);
		String codiceString=String.valueOf(codice);
		setCodiceAzienda(codiceString);
	}
	
	public String nomecompleto() {
		return getNome() + getCognome() + "CODICe azienda: " + getCodiceAzienda();
	}
	
	@Override
	public String toString() {
		return nomecompleto() + "\nData di compleanno: " + getCompleanno();
	}
	
	
}
