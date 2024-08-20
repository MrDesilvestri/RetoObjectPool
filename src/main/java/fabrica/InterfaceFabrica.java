package main.java.fabrica;

import main.java.administracion.InterfaceGestion;

public interface InterfaceFabrica<T extends InterfaceGestion> {
    public T createNew();
}
