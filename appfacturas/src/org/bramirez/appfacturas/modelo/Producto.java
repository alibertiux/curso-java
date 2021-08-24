package org.bramirez.appfacturas.modelo;

public class Producto {
    //================== atributos ==============

    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;

    //=========== constructores ===============

    public Producto() {
        this.codigo = ++ultimoCodigo; // para incrementar
    }

    //============== metodos ===================

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio ;
                }
    }

