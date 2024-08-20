package main.java.implementacion;

import main.java.administracion.InterfaceGestion;

public interface InterfaceObjectPool<T extends InterfaceGestion> {
    public T getObject() throws ManejoExcepciones;
    public void releaceObject(T pooledObject);
}
