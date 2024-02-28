package EjExtra.Maquinaria;

public class Vagon {
    private int numVagon;
    private double cargaMax;
    private double cargaAct;
    private String tipoMercancia;
    public Vagon(int numVagon, double cargaMax, double cargaAct, String tipoMercancia){
        this.numVagon = numVagon;
        this.cargaAct = cargaAct;
        this.cargaMax= cargaMax;
        this.tipoMercancia = tipoMercancia;
    }
}
