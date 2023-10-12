/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

public class EventoFuturo {

    private int idEventoFuturo;
    private Hembra hembra;
    private String tipo;
    private Date fechaPrevista;

    public int getIdEventoFuturo() {
        return idEventoFuturo;
    }

    public void setIdEventoFuturo(int idEventoFuturo) {
        this.idEventoFuturo = idEventoFuturo;
    }

    public Hembra getHembra() {
        return hembra;
    }

    public void setHembra(Hembra hembra) {
        this.hembra = hembra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(Date fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

    public EventoFuturo(int idEventoFuturo, Hembra hembra, String tipo, Date fechaPrevista) {
        this.idEventoFuturo = idEventoFuturo;
        this.hembra = hembra;
        this.tipo = tipo;
        this.fechaPrevista = fechaPrevista;
    }

    public EventoFuturo(Hembra hembra, String tipo, Date fechaPrevista) {
        this.hembra = hembra;
        this.tipo = tipo;
        this.fechaPrevista = fechaPrevista;
    }

}
