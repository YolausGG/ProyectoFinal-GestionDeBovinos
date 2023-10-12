package clases;

import java.util.Date;

public class Parto extends EventoDeSanidad {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Parto(int idEventoDeSanidad, Date fecha, String descripcion, Hembra hembra, String tipo) {
        super(idEventoDeSanidad, fecha, descripcion, hembra);
        this.tipo = tipo;
    }

    public Parto(Date fecha, String descripcion, Hembra hembra, String tipo) {
        super(fecha, descripcion, hembra);
        this.tipo = tipo;
    }

}
