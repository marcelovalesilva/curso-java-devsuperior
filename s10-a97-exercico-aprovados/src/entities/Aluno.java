package entities;

public class Aluno {

	private String nome;
	private double notaSem1;
	private double notaSem2;
	
	public Aluno(){
		
	}

	public Aluno(String nome, double notaSem1, double notaSem2) {
		this.nome = nome;
		this.notaSem1 = notaSem1;
		this.notaSem2 = notaSem2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaSem1() {
		return notaSem1;
	}

	public void setNotaSem1(double notaSem1) {
		this.notaSem1 = notaSem1;
	}

	public double getNotaSem2() {
		return notaSem2;
	}

	public void setNotaSem2(double notaSem2) {
		this.notaSem2 = notaSem2;
	}
	
	public double calculaMedia() {
		return (notaSem1 + notaSem2) / 2;
	}
	
	
}
