package Ejercicio2;
public class Programa2{
    public static void main(String[]  args){

        HiloHola hilo1 = new HiloHola();
        HiloMundo hilo2 = new HiloMundo();

        hilo1.start();
        hilo2.start();
    }
}