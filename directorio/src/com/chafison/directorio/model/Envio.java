package com.chafison.directorio.model;
// ==================== CLASE CLIENTE ===================

// ==================== INICIAN ATRIBUTOS ============================
public class Envio {
    private String domicilioDeEnvio;
    private String códigoPostalDeEnvio;
    private String télefonoDeEnvio;
    private String municipioDeEnvio;
    private String estadoDeEnvio;
    private String correoDeEnvio;



// ==================== TERMINAN ATRIBUTOS ============================
// ==================== INICIA CONSTRUCTORES ============================

    public Envio(){
    }

    public Envio(String domicilioDeEnvio, String códigoPostalDeEnvio, String télefonoDeEnvio, String municipioDeEnvio,
                 String estadoDeEnvio, String correoDeEnvio) {
        this.domicilioDeEnvio = domicilioDeEnvio;
        this.códigoPostalDeEnvio = códigoPostalDeEnvio;
        this.télefonoDeEnvio = télefonoDeEnvio;
        this.municipioDeEnvio = municipioDeEnvio;
        this.estadoDeEnvio = estadoDeEnvio;
        this.correoDeEnvio = correoDeEnvio;
    }


// ==================== TERMINAN CONSTRUCTORES ============================
// ======================= INICIA MÉTODOS ===============================




    public String getDomicilioDeEnvio() {
        return domicilioDeEnvio;
    }

    public void setDomicilioDeEnvio(String domicilioDeEnvio) {
        this.domicilioDeEnvio = domicilioDeEnvio;
    }

    public String getCódigoPostalDeEnvio() {
        return códigoPostalDeEnvio;
    }

    public void setCódigoPostalDeEnvio(String códigoPostalDeEnvio) {
        this.códigoPostalDeEnvio = códigoPostalDeEnvio;
    }

    public String getTélefonoDeEnvio() {
        return télefonoDeEnvio;
    }

    public void setTélefonoDeEnvio(String télefonoDeEnvio) {
        this.télefonoDeEnvio = télefonoDeEnvio;
    }

    public String getMunicipioDeEnvio() {
        return municipioDeEnvio;
    }

    public void setMunicipioDeEnvio(String municipioDeEnvio) {
        this.municipioDeEnvio = municipioDeEnvio;
    }

    public String getEstadoDeEnvio() {
        return estadoDeEnvio;
    }

    public void setEstadoDeEnvio(String estadoDeEnvio) {
        this.estadoDeEnvio = estadoDeEnvio;
    }

    public String getCorreoDeEnvio() {
        return correoDeEnvio;
    }

    public void setCorreoDeEnvio(String correoDeEnvio) {
        this.correoDeEnvio = correoDeEnvio;
    }


// ======================= TERMINAN MÉTODOS ===============================
// ======================= INICIA MÉTODOS DE OPERACIÓN ===============================



// ======================= TERMINAN MÉTODOS DE OPERACIÓN ===============================
}