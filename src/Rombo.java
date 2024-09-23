
public class Rombo {
	private String nombre;
	private double diagonalMenor;
	private double diagonalMayor;
	
	public Rombo(String nombre, double diagonalMenor, double diagonalMayor) {
		super();
		this.nombre = nombre;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	} // constructor
	
	// methods
	public double calcularArea () {
		return (diagonalMenor * diagonalMayor) / 2; 
	} // area
	
	 public double calcularPerimetroPorDiagonales() {
	        double lado = Math.sqrt(Math.pow(diagonalMenor / 2, 2) + Math.pow(diagonalMayor / 2, 2));
	        return 4 * lado; // Perímetro
	} // perimetro
	 
	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor=" + diagonalMayor
				+ ", getNombre()=" + getNombre() + ", getDiagonalMenor()=" + getDiagonalMenor()
				+ ", getDiagonalMayor()=" + getDiagonalMayor() + "]";
	} // toString

} // class Rombo
