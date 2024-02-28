package Ej1_1;

public class Bombilla {
    private boolean onOff;
    private static boolean interruptorGlobal;

    public static void setInterruptorGlobal(boolean interruptorGlobal) {
        Bombilla.interruptorGlobal = interruptorGlobal;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void verEstado(){
        if (onOff&&interruptorGlobal){
            System.out.println("La bombilla está encendida");
        } else {
            System.out.println("La bombilla está apagada");
        }
    }
}