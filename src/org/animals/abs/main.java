package org.animals.abs;

public class main {
	
	public main(String [] args) {
		
		Cane c1= new Cane();
		c1.dormi();
		c1.verso();
		c1.mangia();
		
		Passerotto p1= new Passerotto();
		p1.dormi();
		p1.verso();
		p1.mangia();
		
		faiVolare(p1);
		faiNuotare(c1);

	}
	
	public static void faiVolare(IVolante animaleVolante) {
		animaleVolante.vola();
	}
	
	public static void faiNuotare(InUOTANTE animaleNuotante) {
		animaleNuotante.nuota();
	}
}
