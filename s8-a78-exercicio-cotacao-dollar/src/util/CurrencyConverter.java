package util;

public class CurrencyConverter {
	
	public static final double TAXA_IOF = 0.06;
	
	public static double converteRealEmDollar(double cotacaoDollar, double quantidadeDollar) {
		double valorParcial = cotacaoDollar * quantidadeDollar;
		double valorTotal = valorParcial + (valorParcial * TAXA_IOF);
		return valorTotal;
	}

}
