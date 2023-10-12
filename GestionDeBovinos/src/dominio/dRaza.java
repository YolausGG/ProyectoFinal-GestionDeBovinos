package dominio;

import clases.Raza;
import java.util.ArrayList;
import persistencia.pRaza;

public class dRaza {

    public static ArrayList<Raza> listarRazas() {

        return pRaza.buscarRazas();
    }

}
