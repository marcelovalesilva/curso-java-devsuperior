package entities;

public class Conta {

	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}
	
	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.0;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor; 
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0; 
	}

	@Override
	public String toString() {
		return "Account " 
				+ numConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}

	
}
