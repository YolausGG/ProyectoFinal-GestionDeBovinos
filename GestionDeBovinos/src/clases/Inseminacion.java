package clases;

import java.util.Date;

public class Inseminacion extends EventoDeSanidad {

    private Macho macho;

    public Macho getMacho() {
        return macho;
    }

    public void setMacho(Macho macho) {
        this.macho = macho;
    }

    public Inseminacion(int idEventoDeSanidad, Date fecha, String descripcion, Hembra hembra, Macho macho) {
        super(idEventoDeSanidad, fecha, descripcion, hembra);
        this.macho = macho;
    }

    public Inseminacion(Date fecha, String descripcion, Hembra hembra, Macho macho) {
        super(fecha, descripcion, hembra);
        this.macho = macho;
    }

}
