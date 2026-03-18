package entities;

public class ContribuintePessoaJuridica extends Contribuinte{

	private Integer quantidadeFuncionario;
	
	public ContribuintePessoaJuridica() {
		super();
	}
	
	public ContribuintePessoaJuridica(String nome, Double rendaAnual, Integer quantidadeFuncionario) {
		super(nome, rendaAnual);
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	public Integer getQuantidadeFuncionario() {
		return quantidadeFuncionario;
	}

	public void setQuantidadeFuncionario(Integer quantidadeFuncionario) {
		this.quantidadeFuncionario = quantidadeFuncionario;
	}

	@Override
	public Double calculaImposto() {
		if(quantidadeFuncionario > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}

}
