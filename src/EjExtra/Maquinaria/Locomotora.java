package EjExtra.Maquinaria;

import EjExtra.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private double potencia;
    private String nombreMecanico;
    public Locomotora(Mecanico mecanico, String matricula, double potencia){
        this.nombreMecanico = mecanico.getNombre();
        this.matricula = matricula;
        this.potencia = potencia;
    }
    public String getMatricula(){
        return this.matricula;
    }
}
