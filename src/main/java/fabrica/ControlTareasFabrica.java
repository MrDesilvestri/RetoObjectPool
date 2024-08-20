package main.java.fabrica;

import main.java.administracion.ControlTareas;

public class ControlTareasFabrica implements InterfaceFabrica<ControlTareas> {

    public ControlTareas createNew(){
        return new ControlTareas();
    }
}
