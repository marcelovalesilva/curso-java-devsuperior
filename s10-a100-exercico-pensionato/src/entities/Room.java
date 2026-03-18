package entities;

public class Room {

	private int numRoom;
	private Estudante estudante;
	
	public Room() {
		
	}

	public Room(int numRoom, Estudante estudante) {
		this.numRoom = numRoom;
		this.estudante = estudante;
	}
	
	public int getNumRoom() {
		return numRoom;
	}

	public void setNumRoom(int numRoom) {
		this.numRoom = numRoom;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	@Override
	public String toString() {
		return "Room [numRoom=" + numRoom + ", estudante=" + estudante + "]";
	}
	
}
