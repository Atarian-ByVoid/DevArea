package br.fepi.sistemas.matriz;

public class Matriz {
	public static void main (String[] args) {
		
		String [] [] cadastro = {
				{"Leandro","MG", "902392-092303"},
				{"João","SP", "23232-092303"},
				{"Joaquim","SP", "23452-908557"},

		};
		
		
		double [][] coordenadas = new double [2][2];
		coordenadas [0][0]= -22.2323;
		coordenadas [0][1]= -90.543;

		System.out.println("Latitude: "+coordenadas[0][1]+"\nLongitude"+coordenadas);
		
		System.out.println(cadastro [0][1]);
		cadastro[1][0]="Joaquim";
		
		System.out.println(cadastro.length);
		System.out.println(cadastro[0].length);
	}

}
