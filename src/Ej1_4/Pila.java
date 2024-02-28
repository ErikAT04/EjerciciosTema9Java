package Ej1_4;

public class Pila {
    Lista listaPilas;
    public Pila(){
        listaPilas = new Lista();
    }
    public void apilar(int dato){
        listaPilas.aniadirAlFinal(dato);
    }
    public void retirar(){
        listaPilas.eliminarPorParametro(listaPilas.lista.length-1);
    }
}
