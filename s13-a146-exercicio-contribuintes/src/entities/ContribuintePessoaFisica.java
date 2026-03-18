package entities;

public class ContribuintePessoaFisica extends Contribuinte{

	private Double gastoComSaude;
	
	public ContribuintePessoaFisica() {
		super();
	}
	
	public ContribuintePessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double calculaImposto() {
		if(getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15;
		}
		else {
			return (getRendaAnual() * 0.25) - (gastoComSaude * 0.5);
		}
		
	}

}
