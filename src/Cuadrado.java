
public class Cuadrado {
	private String nombre;
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	} // constructor
	
	// methods
	public double calcularArea () {
		return (getLado()*2);
	} // area
	
	public double calcularPerimetro () {
		return (getLado() + getLado () + getLado () + getLado());
	} // perimetro
	
	// getters and setters
	public String getNombre() {
		return nombre;
	} // nombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} // nombre

	public double getLado() {
		return lado;
	} // lado

	public void setLado(double lado) {
		this.lado = lado;
	} // lado

	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + ", calcularArea()=" + calcularArea()
				+ ", calcularPerimetro()=" + calcularPerimetro() + ", getNombre()=" + getNombre() + ", getLado()="
				+ getLado() + "]";
	} // toString
} // class Cuadrado
