package clases;

import java.util.Date;

public class Padece {

    private int idEnfermedad;
    private int idBovino;
    private Date fechaInicio;
    private Date fechaFinalizacion;

    public Padece(Enfermedad enfermedad, int idBovino, Date fechaInicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
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

    @Override
    public String toString() {
        return "Padece{"
                + "idEnfermedad=" + idEnfermedad
                + ", idBovino=" + idBovino
                + ", fechaInicio=" + fechaInicio
                + ", fechaFinalizacion=" + fechaFinalizacion + '}';
    }

    public Padece(int idEnfermedad, int idBovino, Date fechaInicio, Date fechaFinalizacion) {
        this.idEnfermedad = idEnfermedad;
        this.idBovino = idBovino;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Padece(int idEnfermedad, int idBovino, Date fechaInicio) {
        this.idEnfermedad = idEnfermedad;
        this.idBovino = idBovino;
        this.fechaInicio = fechaInicio;

    }

    public Padece() {

    }
}
