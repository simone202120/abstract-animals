package org.animals.abs;

public class Passerotto  extends Animals implements IVolante{
	
	@Override 
	 public void verso() {
	 System.out.println("cip cip");
	 }
	 
	 @Override
	 public void mangia() {
		 System.out.println("vermi");
	 }
	 
	 
	 @Override
	 public void vola() {
		 System.out.println("sto volando");
	 }

}
