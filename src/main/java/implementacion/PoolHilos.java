package main.java.implementacion;

import main.java.administracion.ControlTareas;
import main.java.fabrica.InterfaceFabrica;

public class PoolHilos extends AbstraccionObjectPool<ControlTareas> {
    public PoolHilos(int minInstances, int maxInstances, int waitTime, InterfaceFabrica<ControlTareas> poolableObjectFactory) {
        super(minInstances, maxInstances, waitTime, poolableObjectFactory);
    }
}
