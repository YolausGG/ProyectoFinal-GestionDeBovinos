/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

public class EstadoBovino {

    private int idEstadoDelBovino;
    private int idBovino;
    private Date fechaInicio;
    private Date fechaFinalizacion;

    public int getIdEstadoDelBovino() {
        return idEstadoDelBovino;
    }

    public void setIdEstadoDelBovino(int idEstadoDelBovino) {
        this.idEstadoDelBovino = idEstadoDelBovino;
    }

    public int getIdBovino() {
        return idBovino;
    }

    public void setIdBovino(int idBovino) {
        this.idBovino = idBovino;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public EstadoBovino(int idEstadoDelBovino, int idBovino, Date fechaInicio, Date fechaFinalizacion) {
        this.idEstadoDelBovino = idEstadoDelBovino;
        this.idBovino = idBovino;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public EstadoBovino(int idEstadoDelBovino, int idBovino, Date fechaInicio) {
        this.idEstadoDelBovino = idEstadoDelBovino;
        this.idBovino = idBovino;
        this.fechaInicio = fechaInicio;
    }

    public EstadoBovino() {

    }

}
