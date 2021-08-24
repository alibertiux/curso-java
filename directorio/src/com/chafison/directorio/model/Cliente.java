package com.chafison.directorio.model;
// ==================== CLASE CLIENTE ===================

// ==================== INICIAN ATRIBUTOS ============================
public class Cliente extends Persona{


    private String nombreComercial;
    private String  domicilioComercial;
    private String códigoPostalComercial;
    private String teléfonoComercial;
    private String correoComerical;

    private Envio envio;
    private DatosDeFacturacion datosDeFacturacion;
    private TipoDeCuenta tipoDeCuenta;




// ==================== TERMINAN ATRIBUTOS ============================
// ==================== INICIA CONSTRUCTORES ============================


// ==================== TERMINAN CONSTRUCTORES ============================
// ======================= INICIA MÉTODOS ===============================



    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDomicilioComercial() {
        return domicilioComercial;
    }

    public void setDomicilioComercial(String domicilioComercial) {
        this.domicilioComercial = domicilioComercial;
    }

    public String getCódigoPostalComercial() {
        return códigoPostalComercial;
    }

    public void setCódigoPostalComercial(String códigoPostalComercial) {
        this.códigoPostalComercial = códigoPostalComercial;
    }

    public String getTeléfonoComercial() {
        return teléfonoComercial;
    }

    public void setTeléfonoComercial(String teléfonoComercial) {
        this.teléfonoComercial = teléfonoComercial;
    }

    public String getCorreoComerical() {
        return correoComerical;
    }

    public void setCorreoComerical(String correoComerical) {
        this.correoComerical = correoComerical;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public DatosDeFacturacion getDatosDeFacturacion() {
        return datosDeFacturacion;
    }

    public void setDatosDeFacturacion(DatosDeFacturacion datosDeFacturacion) {
        this.datosDeFacturacion = datosDeFacturacion;
    }

    public TipoDeCuenta getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(TipoDeCuenta tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }


// ======================= TERMINAN MÉTODOS ===============================
// ======================= INICIA MÉTODOS DE OPERACIÓN ===============================



// ======================= TERMINAN MÉTODOS DE OPERACIÓN ===============================
}