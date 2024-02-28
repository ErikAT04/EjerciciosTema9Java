package EjExtra.Personal;

public class Mecanico {
    private String nombre;
    private int telefono;
    private String especialidad;

    public String getNombre() {
        return nombre;
    }

    public Mecanico(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}
