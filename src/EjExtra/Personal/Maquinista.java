package EjExtra.Personal;

public class Maquinista {
    private String nombre;
    private double sueldo;
    private String rango;
    public Maquinista(String nombre, double sueldo, String rango){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    public String getNombre(){
        return this.nombre;
    }
}
