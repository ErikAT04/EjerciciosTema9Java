package EjExtra.Maquinaria;

import EjExtra.Personal.Maquinista;

public class Tren {
    Vagon[] vagones;
    private String matrLocomotora;
    private String nombreMaquinista;

    public Tren(int numVagones, Locomotora locomotora, Maquinista maquinista){
        vagones = new Vagon[numVagones];
        matrLocomotora = locomotora.getMatricula();
        nombreMaquinista = maquinista.getNombre();
    }
    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }
}
