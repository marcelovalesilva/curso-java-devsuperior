package entities;

public class Aluno extends Usuario implements Comparable<Aluno> {

	public Aluno(Integer codigo) {
		super(codigo);
	}

	@Override
	public String toString() {
		return String.format("%d", super.getCodigo());
	}

	@Override
	public int compareTo(Aluno other) {
		return super.getCodigo().compareTo(other.getCodigo());
	}

	
}
