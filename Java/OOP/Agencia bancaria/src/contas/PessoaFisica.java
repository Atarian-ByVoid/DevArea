package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente ("Carlos Alberto");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println("-------------------------------------------");
		Conta cc2 = new Conta();
		cc2.setCliente("Pedro");
		cc2.setSaldo (6578);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(1000);
		cc2.exibirSaldo();
		System.out.println("-------------------------------------------");
		System.out.println("Transf�rencia");
		System.out.println("Clinte: " + cc1.getCliente());
		System.out.println("Favoreccido: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("-------------------------------------------");
		System.out.println("Relatorio gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas: R$ " + relatorio);
				
				
	}

}
