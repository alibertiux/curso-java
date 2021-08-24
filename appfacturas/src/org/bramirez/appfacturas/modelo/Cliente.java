package org.bramirez.appfacturas.modelo;

public class Cliente {
    //================== atributos ==============

    private String nombre;
    private String nif;

    //============== metodos ===================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
