 package oop_portal2;

public class Principal {

	public static void main(String[] args) {
		
	AreaCirculo c1 = new AreaCirculo();
	
	c1.setRaio(3);
	System.out.println("A �rea de c1 �: "+c1.getArea());
	System.out.println("O pi � : "+c1.getPi());
	
	System.out.println("____________________________________");
	
	AreaCirculo c2 = new AreaCirculo();
	c2.setRaio(5);
	System.out.println("A �rea de c1 �: "+c2.getArea());
	System.out.println("O pi � : "+c2.getPi());
	


	}

}
