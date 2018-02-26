package patata;

public class ClaseSegunda {
	private int numDos;

	public ClaseSegunda(int numDos) {
		super();
		this.numDos = numDos;
		ClasePrimera clasePrimera= new ClasePrimera(2, 6);
	}

	public int getNumDos() {
		return numDos;
	}

	public void setNumDos(int numDos) {
		this.numDos = numDos;
	}
	
}
