package clases;

import java.util.Date;

public class Tratamiento {

    private int idTratamiento;
    private Padece padece;
    private String detalle;
    private Date fechaInicio;
    private Date fechaFinalizacion;

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Padece getPadece() {
        return padece;
    }

    public void setPadece(Padece padece) {
        this.padece = padece;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
        return "Tratamiento{"
                + "idTratamiento=" + idTratamiento
                + ", padece=" + padece
                + ", detalle='" + detalle + '\''
                + ", fechaInicio=" + fechaInicio
                + ", fechaFinalizacion=" + fechaFinalizacion
                + '}';
    }

    public Tratamiento(int idTratamiento, Padece padece, String detalle, Date fechaInicio, Date fechaFinalizacion) {
        this.idTratamiento = idTratamiento;
        this.padece = padece;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Tratamiento(int idTratamiento, Padece padece, String detalle, Date fechaInicio) {
        this.idTratamiento = idTratamiento;
        this.padece = padece;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;

    }

    public Tratamiento(Padece padece, String detalle, Date fechaInicio, Date fechaFinalizacion) {
        this.padece = padece;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Tratamiento(Padece padece, String detalle, Date fechaInicio) {
        this.padece = padece;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;

    }

    public Tratamiento() {

    }

}
