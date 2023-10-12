package clases;

import java.util.Date;

public class Aborto extends EventoDeSanidad {

    private String causa;

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Aborto(int idEventoDeSanidad, Date fecha, String descripcion, Hembra hembra, String causa) {
        super(idEventoDeSanidad, fecha, descripcion, hembra);
        this.causa = causa;
    }

    public Aborto(Date fecha, String descripcion, Hembra hembra, String causa) {
        super(fecha, descripcion, hembra);
        this.causa = causa;
    }

}
