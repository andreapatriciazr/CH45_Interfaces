public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
        Triangulo t2 = new Triangulo("T", 30, 20, 7);
        Rombo r = new Rombo("Diamante", 10, 15);
        Romboide ro = new Romboide("Romboide", 10, 20, 5, 5);
        Rectangulo rect = new Rectangulo("Rectángulo", 10, 5);
        Cuadrado cuadra = new Cuadrado("Cuadrado", 4);
        
        imprimirCalculo(t1);
        imprimirCalculo(t2);
        imprimirCalculo(r);
        imprimirCalculo(ro);
        imprimirCalculo(rect);
        imprimirCalculo(cuadra);
    }

    public static void imprimirCalculo(FiguraGeometrica figura) {
        System.out.println(figura);
        System.out.println("+-----------------------");
        System.out.println("El área de [" + figura.getNombre() + "] es " + figura.calcularArea());
        System.out.println("El perímetro de [" + figura.getNombre() + "] es " + figura.calcularPerimetro());
        System.out.println("+-----------------------");
    }
}
