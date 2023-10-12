package clases;

import java.util.ArrayList;
import java.util.Date;

public class Macho extends Bovino {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Macho(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, String tipo) {
        super(idBovino, caravanaBovino, fechaNacimiento, raza);
        this.tipo = tipo;
    }

    public Macho(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, String tipo, Hembra madre, Macho padre) {
        super(idBovino, caravanaBovino, fechaNacimiento, raza, madre, padre);
        this.tipo = tipo;
    }

    public Macho(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, ArrayList<EstadoDelBovino> estadosDelBovino, String tipo) {
        super(caravanaBovino, fechaNacimiento, madre, padre, raza, estadosDelBovino);
        this.tipo = tipo;
    }

    public Macho(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, String tipo) {
        super(caravanaBovino, fechaNacimiento, madre, padre, raza);
        this.tipo = tipo;
    }

    public Macho(String tipo, int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto) {
        super(idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, foto);
        this.tipo = tipo;
    }

    public Macho(String tipo, int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto, ArrayList<EstadoDelBovino> estadosDelBovino) {
        super(idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, foto, estadosDelBovino);
        this.tipo = tipo;
    }

    public Macho(String tipo, int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, byte[] foto) {
        super(idBovino, caravanaBovino, fechaNacimiento, raza, foto);
        this.tipo = tipo;
    }

}
