package clases;

import java.util.ArrayList;
import java.util.Date;

public class Hembra extends Bovino {

    public Hembra(int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, ArrayList<EstadoDelBovino> estadosDelBovino) {
        super(idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, estadosDelBovino);
    }

    public Hembra(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, Hembra madre, Macho padre) {
        super(idBovino, caravanaBovino, fechaNacimiento, raza, madre, padre);
    }

    public Hembra(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza) {
        super(idBovino, caravanaBovino, fechaNacimiento, raza);
    }

    public Hembra(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, ArrayList<EstadoDelBovino> estadosDelBovino) {
        super(caravanaBovino, fechaNacimiento, madre, padre, raza, estadosDelBovino);
    }

    public Hembra(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza) {
        super(caravanaBovino, fechaNacimiento, madre, padre, raza);
    }

    public Hembra(int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto) {
        super(idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, foto);
    }

    public Hembra(int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto, ArrayList<EstadoDelBovino> estadosDelBovino) {
        super(idBovino, caravanaBovino, fechaNacimiento, madre, padre, raza, foto, estadosDelBovino);
    }

    public Hembra(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, byte[] foto) {
        super(idBovino, caravanaBovino, fechaNacimiento, raza, foto);
    }

}
