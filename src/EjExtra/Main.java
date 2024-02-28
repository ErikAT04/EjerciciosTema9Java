package EjExtra;
import EjExtra.Maquinaria.*;
import EjExtra.Personal.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tren tren;
        Vagon vagon;
        JefeEstacion jefeEstacion = new JefeEstacion("Jose", "72333111J", LocalDate.now());
        Maquinista maquinista = new Maquinista("Paco", 1080, "Larga Distancia");
        Mecanico mecanico = new Mecanico("Juan", 234123222, "Motores");
        Locomotora locomotora = new Locomotora(mecanico, "1234PPP", 250);
        System.out.println("Para crear el tren, elige el número de vagones que va a tener además de la locomotora");
        int numVagones=-1;
        while (numVagones>5||numVagones<0) {
            numVagones = sc.nextInt();
            if (numVagones>5||numVagones<0){
                System.out.println("Número inválido. Tiene que estar entre 0 y 5");
            }
        }
        sc.nextLine();
        tren = new Tren(numVagones, locomotora, maquinista);
        for(int i = 0; i <numVagones; i++){
            System.out.println("VAGÓN " + i + ":");
            System.out.println("Elige la carga máxima");
            double cargaMax = Double.parseDouble(sc.nextLine());
            System.out.println("Elige la carga actual");
            double cargaAct = Double.parseDouble(sc.nextLine());
            System.out.println("Elige el tipo de mercancia que lleva:");
            String tipoMercancia = sc.nextLine();
            vagon = new Vagon(i, cargaMax, cargaAct, tipoMercancia);
            Vagon[] aux = tren.getVagones();
            aux[i] = vagon;
            tren.setVagones(aux);
        }
    }
}