package org.ditta;

import java.time.LocalDate;
import org.ditta.impl.boss;
import org.ditta.impl.employee;


public class main {
	
	public main(String[] args) {
		employee e1= new employee ("Gino", "Marino", LocalDate.now(),1200,14);
		System.out.println(e1);
		employee e2= new employee ("Mario", "Ginuzzi", LocalDate.now(),1300,14);
		System.out.println(e2);
		employee e3= new employee ("Antonio", "Astri", LocalDate.now(),1400,14);
		System.out.println(e3);

		
		boss b1= new boss("Michele", "Stefanelli", LocalDate.now(),2500,10000);
		System.out.println(b1);
		boss b2= new boss("Giovanni", "Antoni", LocalDate.now(),2300,15000);
		System.out.println(b2);
		boss b3= new boss("Antonia", "Renato", LocalDate.now(),3000,9000);
		System.out.println(b3);
		
		Person[] ps= {e1, e2, e3, b1, b2, b3};
		
		int stipendioMassimo = Integer.MIN_VALUE;
		Person pmax=null;
		
		for(int i=0;i<ps.length;i++) {
			
			Person p=ps[i];
			int reddito= p.getYearIncome();
			if(stipendioMassimo<reddito) {
				stipendioMassimo=reddito;
				pmax=p;
			}
		}
		System.out.println("La persona che guadagna di più è: " + pmax.getNome());
		
		int stipendioMinimo = Integer.MAX_VALUE;
		Person pmin=null;
		
		for(int i=0;i<ps.length;i++) {
			
			Person p=ps[i];
			int reddito= p.getYearIncome();
			if(stipendioMinimo>reddito) {
				stipendioMassimo=reddito;
				pmin=p;
			}
		}
		System.out.println("La persona che guadagna di meno è: " + pmin.getNome());
		
		int CostoAzienda =0;
		
		for (int x=0;x<ps.length;x++) {
			Person p = ps[x];
			int reddito = p.getYearIncome();
			CostoAzienda +=reddito;
		}
		int MediaCostoAz= CostoAzienda/ps.length;
		System.out.println("Costo annuale azienda: " + CostoAzienda);
		System.out.println("Costo medio azienda: " + MediaCostoAz);

	}
}
