package Ejercicio2;

public class HiloHola extends Thread{
    public void run(){
        while (true) {
        System.out.print(" hola ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}