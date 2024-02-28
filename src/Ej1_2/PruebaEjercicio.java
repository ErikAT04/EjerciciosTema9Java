package Ej1_2;

import java.util.Arrays;

public class PruebaEjercicio {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.aniadirAlFinal(1);
        lista.verNumElementosLista();
        System.out.println(Arrays.toString(lista.lista));
        lista.aniadirAlPrincipio(3);
        System.out.println(Arrays.toString(lista.lista));
        lista.aniadirEnMedio(5, 1);
        System.out.println(Arrays.toString(lista.lista));
        lista.aniadirDeOtraLista(0);
        System.out.println(Arrays.toString(lista.lista));
        System.out.println("El numero esta en el hueco " + lista.buscarNumEnArray(5));
        System.out.println(Arrays.toString(lista.lista));
        lista.verElementoIndice(6);
        System.out.println(Arrays.toString(lista.lista));
        lista.eliminarPorParametro(3);
        System.out.println(Arrays.toString(lista.lista));
    }
}
