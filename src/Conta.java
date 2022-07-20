

public class Conta implements  Movimentacoes{

	private static final int AGENCIA_PADRAO = 001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	


	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	

	@Override
	public void saque(double valor) {
		saldo -=valor * 0.12;
		
	}
	
	 

	@Override
	public void depositar (double valor) {
		saldo +=valor;
		
	}

	@Override
	public void transferencia(double valor, Movimentacoes contaDestino) {
		
		this.saque(valor);
		contaDestino.depositar(valor);
		
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	
	}




	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public void imprimirExtrato() {
	
	}


	@Override
	public void pix(double valor) {
		saldo -=valor;
	}


	
	

}
