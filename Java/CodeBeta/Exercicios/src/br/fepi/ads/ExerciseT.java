package br.fepi.ads;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ExerciseT {

	public static void main(String[] args) {
		
		DecimalFormat numberFormat = new DecimalFormat("#.00");
	
		double Vel;
		double Temp;
		double Dist;
		
	
		
	
		Temp = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo"));
		
		Dist = Double.parseDouble(JOptionPane.showInputDialog("informe a distançia"));
		
		Vel = (Dist * 1000) / (Temp * 60);
			
		System.out.println("Resultado em metros P/s : " + numberFormat.format(Vel));
		
		
		
		
		
	}

}
