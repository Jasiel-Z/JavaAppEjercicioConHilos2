package Ejercicio2;

public class HiloMundo extends Thread{
    public void run(){
        while (true) {
        System.out.print(" mundo ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }    
}
