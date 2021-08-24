package com.chafison.directorio.model;
// ==================== CLASE PERSONA ===================

// ==================== INICIAN ATRIBUTOS ============================


public class Persona {
    private String nombre;
    private String domiciio;
    private String telefono;
    private String codigoPostal;
    private String correo;


// ==================== TERMINAN ATRIBUTOS ============================
// ==================== INICIA CONSTRUCTORES ============================


// ==================== TERMINAN CONSTRUCTORES ============================
// ======================= INICIA MÉTODOS ===============================

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomiciio() {
        return domiciio;
    }

    public void setDomiciio(String domiciio) {
        this.domiciio = domiciio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


// ======================= TERMINAN MÉTODOS ===============================
// ======================= INICIA MÉTODOS DE OPERACIÓN ===============================


// ======================= TERMINAN MÉTODOS DE OPERACIÓN ===============================
}