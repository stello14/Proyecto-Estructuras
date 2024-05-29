package com.proyecto;

public class Evento {
    private String nombreEvento;
    private String fecha;
    private String lugar;
    private int horasLibresEvento;

    public Evento(String nombreEvento, String fecha, String lugar, int horasLibresEvento){
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;
        this.horasLibresEvento = horasLibresEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHorasLibresEvento() {
        return horasLibresEvento;
    }

    public void setHorasLibresEvento(int horasLibresEvento) {
        this.horasLibresEvento = horasLibresEvento;
    }
}
