package br.fepi.ads;

import javax.swing.JOptionPane;

class ExerciseF {

	public static void main(String[] args) {
	
String total=",";
int i;

for(i=1;i<200;i++) {
	if(i%4==0)
		total+=i+",";
	
}

JOptionPane.showMessageDialog(null, total,"Resultado",JOptionPane.PLAIN_MESSAGE);

	}

}
