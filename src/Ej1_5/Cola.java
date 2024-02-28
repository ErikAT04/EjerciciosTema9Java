package Ej1_5;

public class Cola {
    Lista lista1;
    public Cola(){
        lista1 = new Lista();
    }
    public void encolar(int dato){
        lista1.aniadirAlFinal(dato);
    }
    public void desencolar(){
        lista1.eliminarPorParametro(0);
    }
}
