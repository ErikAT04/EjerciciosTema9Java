package EjExtra.Personal;

import java.time.LocalDate;
import java.util.Date;

public class JefeEstacion {
    private String nombre;
    private String DNI;
    private LocalDate fechaNombrado;

    public JefeEstacion(String nombre, String DNI, LocalDate fechaNombrado) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombrado = fechaNombrado;
    }
}
