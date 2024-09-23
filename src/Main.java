
public class Main {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("T", 30, 20, 7);
		imprimirCalculo(t1);
		imprimirCalculo(t);

	} // main
	
	public static void imprimirCalculo(Triangulo t) {
		System.out.println(t);
		System.out.println("+-----------------------");
		System.out.println("El área de [ " + t.getNombre() + "] es t.calcularArea()");
		System.out.println("El perimetro de [ " + t.getNombre() + "] es t.calcularPerimetro()");
		System.out.println("+-----------------------");

	}
}
