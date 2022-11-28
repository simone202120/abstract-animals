package org.animals.abs;

public class Aquilla extends Animals implements IVolante {
	@Override 
	 public void verso() {
	 System.out.println("hu hu");
	 }
	 
	 @Override
	 public void mangia() {
		 System.out.println("topi");
	 }
	 
	 
	 @Override
	 public void vola() {
		 System.out.println("sto volando");
	 }

}
