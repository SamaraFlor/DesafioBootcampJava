
public class Main {

	public static void main(String[] args) {
		
	
		Cliente samara = new Cliente();
		samara.setNome("Samara");
		samara.setCpf("338-098-876-89");
	   
	
	
		Conta corrente = new ContaCorrente(samara);
		Conta poupanca = new ContaPoupanca(samara);

         corrente.depositar(1000);
		 corrente.transferencia(100, poupanca);
		 corrente.pix(500.00);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
