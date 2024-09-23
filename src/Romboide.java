
public class Romboide {
    private String nombre;
    private double base1;
    private double base2;
    private double altura1;
    private double altura2;

    public Romboide(String nombre, double base1, double base2, double altura1, double altura2) {
        this.nombre = nombre;
        this.base1 = base1;
        this.base2 = base2;
        this.altura1 = altura1;
        this.altura2 = altura2;
    } // constructor

    // methods
    public double calcularArea() {
        return base1 * altura1; 
    } // area

    public double calcularPerimetro() {
        return 2 * (base1 + base2); 
    } // perimetro

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getAltura1() {
        return altura1;
    }

    public void setAltura1(double altura1) {
        this.altura1 = altura1;
    }

    public double getAltura2() {
        return altura2;
    }

    public void setAltura2(double altura2) {
        this.altura2 = altura2;
    }

    @Override
    public String toString() {
        return "Romboide [nombre=" + nombre + ", base1=" + base1 + ", base2=" + base2 + 
               ", altura1=" + altura1 + ", altura2=" + altura2 + "]";
    } // toString
    
} // class Romboide
