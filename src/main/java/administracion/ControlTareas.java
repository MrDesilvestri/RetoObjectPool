package main.java.administracion;


public class ControlTareas implements InterfaceGestion {
    private int eventos;
    private static int invalidar;
    private static int contador;

    public void execute() {
        int c = ++contador;
        eventos++;
        System.out.println("Ejecución ==> " + c);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println("Fin de la Ejecución ==> " + c);
    }

    @Override
    public boolean validate() {
        return eventos < 2;
    }

    @Override
    public void invalidate() {
        invalidar++;
        System.out.println("Invalidar contador ==> " + invalidar);
    }
}
