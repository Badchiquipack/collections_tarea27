package com.marriaga.collections.model;

import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHora;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaHora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaHora=" + fechaHora +
                ", pasajeros=" + pasajeros;
    }
}
