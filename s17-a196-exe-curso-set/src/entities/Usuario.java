package entities;

public abstract class Usuario {

	private Integer codigo;

	public Usuario(Integer codigo) {
		this.setCodigo(codigo);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
}
