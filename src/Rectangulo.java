
public class Rectangulo {
	private String nombre;
	private double base;
	private double altura;
	
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	} // constructor
	
	// methods
	public double calcularArea () {
		return (getBase()*getAltura());
	} // area
	
	public double calcularPerimetro () {
		return ((getBase()*2) + (getAltura()*2));
	} // perimetro

	//getters and setters
	public String getNombre() {
		return nombre;
	} // nombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} // nombre

	public double getBase() {
		return base;
	} // base

	public void setBase(double base) {
		this.base = base;
	} // base

	public double getAltura() {
		return altura;
	} // altura

	public void setAltura(double altura) {
		this.altura = altura;
	} // altura

	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", calcularArea()="
				+ calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + ", getNombre()=" + getNombre()
				+ ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	} // toString
	
} // class Rectangle
