package com.chafison.directorio.model;

public enum TipoDeCuenta {
    CRÉDITO("Crédito"),
    DEBITO("Débito"),
    EFECTIVO("Efectivo"),
    ;

    private final String tipoDeCuenta;


    TipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public String getTipoDeCuenta(){
        return this.tipoDeCuenta;
    }
}
