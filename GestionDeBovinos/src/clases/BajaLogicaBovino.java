/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

public class BajaLogicaBovino {

    private int idBajaBovino;
    private Bovino bovino;
    private Date fechaBaja;
    private String motivo;

    public int getIdBajaBovino() {
        return idBajaBovino;
    }

    public void setIdBajaBovino(int idBajaBovino) {
        this.idBajaBovino = idBajaBovino;
    }

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public BajaLogicaBovino(Bovino bovino, Date fechaBaja, String motivo) {
        this.bovino = bovino;
        this.fechaBaja = fechaBaja;
        this.motivo = motivo;
    }

    public BajaLogicaBovino(int idBajaBovino, Bovino bovino, Date fechaBaja, String motivo) {
        this.idBajaBovino = idBajaBovino;
        this.bovino = bovino;
        this.fechaBaja = fechaBaja;
        this.motivo = motivo;
    }

}
