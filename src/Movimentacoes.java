
public interface Movimentacoes {
	
    void saque(double valor);
    
    void pix (double valor);
	
	void depositar(double valor);
	
	void transferencia(double valor, Movimentacoes contaDestino);
	
	void imprimirExtrato();

}
