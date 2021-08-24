package com.chafison.directorio.model;
// ==================== CLASE PERSONA ===================

// ==================== INICIAN ATRIBUTOS ============================
public class DatosDeFacturacion {
    private String nombreFiscal;
    private String rfc;
    private String domicilioFiscal;
    private String teléfonoFiscal;
    private String códigoPostalFiscal;
    private String municipioFiscal;
    private String estadoFiscal;
    private String usoDeCdfi;
    private TipoDeCuenta númeroDeCuenta;

// ==================== TERMINAN ATRIBUTOS ============================
// ==================== INICIA CONSTRUCTORES ============================


// ==================== TERMINAN CONSTRUCTORES ============================
// ======================= INICIA MÉTODOS ===============================

    public String getNombreFiscal() {
        return nombreFiscal;
    }

    public void setNombreFiscal(String nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public String getTeléfonoFiscal() {
        return teléfonoFiscal;
    }

    public void setTeléfonoFiscal(String teléfonoFiscal) {
        this.teléfonoFiscal = teléfonoFiscal;
    }

    public String getCódigoPostalFiscal() {
        return códigoPostalFiscal;
    }

    public void setCódigoPostalFiscal(String códigoPostalFiscal) {
        this.códigoPostalFiscal = códigoPostalFiscal;
    }

    public String getMunicipioFiscal() {
        return municipioFiscal;
    }

    public void setMunicipioFiscal(String municipioFiscal) {
        this.municipioFiscal = municipioFiscal;
    }

    public String getEstadoFiscal() {
        return estadoFiscal;
    }

    public void setEstadoFiscal(String estadoFiscal) {
        this.estadoFiscal = estadoFiscal;
    }

    public String getUsoDeCdfi() {
        return usoDeCdfi;
    }

    public void setUsoDeCdfi(String usoDeCdfi) {
        this.usoDeCdfi = usoDeCdfi;
    }

    public TipoDeCuenta getNúmeroDeCuenta() {
        return númeroDeCuenta;
    }

    public void setNúmeroDeCuenta(TipoDeCuenta númeroDeCuenta) {
        this.númeroDeCuenta = númeroDeCuenta;
    }


// ======================= TERMINAN MÉTODOS ===============================
// ======================= INICIA MÉTODOS DE OPERACIÓN ===============================



// ======================= TERMINAN MÉTODOS DE OPERACIÓN ===============================
}