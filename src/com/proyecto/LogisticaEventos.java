package com.proyecto;

public class LogisticaEventos {
    private Evento[] eventosUnab;
    private int cantidadDeEventos;

    public LogisticaEventos(){
        eventosUnab = new Evento[5];
        cantidadDeEventos = 0;
    }

    public void imprimirEventos(){
        for(int i = 0; i<cantidadDeEventos; i++){
            System.out.println(eventosUnab[i].getNombreEvento() + eventosUnab[i].getFecha() + eventosUnab[i].getLugar() + eventosUnab[i].getHorasLibresEvento());
        }
    }

    public void agregarEventos(Evento evento){
        eventosUnab[cantidadDeEventos] = evento;
        cantidadDeEventos++;
    }

    public void eliminarEventos(){

    }
}



