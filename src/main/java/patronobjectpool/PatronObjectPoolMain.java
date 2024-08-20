package main.java.patronobjectpool;

import main.java.administracion.ControlTareas;
import main.java.fabrica.ControlTareasFabrica;
import main.java.implementacion.ManejoExcepciones;
import main.java.implementacion.PoolHilos;

public class PatronObjectPoolMain {

    public static void main(String[] args) {

        final PoolHilos pool = new PoolHilos(2, 6, 1000*100, new ControlTareasFabrica());

        for (int c = 0; c < 10; c++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ControlTareas task = pool.getObject();
                        task.execute();
                        pool.releaceObject(task);
                    } catch (ManejoExcepciones e) {
                        System.out.println("Error ==> " + e.getMessage());
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        try {
            System.in.read();
            System.out.println(pool);
        } catch (Exception e) {
            System.out.println("Out disponible");
        }
    }
}
