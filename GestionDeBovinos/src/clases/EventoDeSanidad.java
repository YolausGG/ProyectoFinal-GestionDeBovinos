package clases;

import java.util.Date;

public class EventoDeSanidad {

    private int idEventoDeSanidad;
    private Date fecha;
    private String detalle;
    private Hembra hembra;

    public int getIdEventoDeSanidad() {
        return idEventoDeSanidad;
    }

    public void setIdEventoDeSanidad(int idEventoDeSanidad) {
        this.idEventoDeSanidad = idEventoDeSanidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String descripcion) {
        this.detalle = descripcion;
    }

    public Hembra getHembra() {
        return hembra;
    }

    public void setHembra(Hembra hembra) {
        this.hembra = hembra;
    }

    public EventoDeSanidad(int idEventoDeSanidad, Date fecha, String descripcion, Hembra hembra) {
        this.idEventoDeSanidad = idEventoDeSanidad;
        this.fecha = fecha;
        this.detalle = descripcion;
        this.hembra = hembra;
    }

    public EventoDeSanidad(Date fecha, String descripcion, Hembra hembra) {
        this.fecha = fecha;
        this.detalle = descripcion;
        this.hembra = hembra;
    }

}
