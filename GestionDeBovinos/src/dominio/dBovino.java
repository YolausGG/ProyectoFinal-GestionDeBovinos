package dominio;

import clases.Bovino;
import java.util.ArrayList;
import persistencia.pBovino;

public class dBovino {

    public static boolean altaBovino(Bovino pBovino) {

        return persistencia.pBovino.altaBovino(pBovino);
    }

    public static boolean altaBovinoFoto(Bovino pBovino) {

        return persistencia.pBovino.altaBovinoFoto(pBovino);
    }

    public static boolean bajaBovino(int idBovino) {

        return persistencia.pBovino.bajaBovino(idBovino);
    }

    public static boolean bajaRealBovino(int idBovino) {

        return persistencia.pBovino.bajaRealBovino(idBovino);
    }

    public static boolean altaLogicaBovino(int idBovino) {

        return persistencia.pBovino.altaLogicaBovino(idBovino);
    }

    public static boolean modificarBovino(Bovino pBovino) {

        return persistencia.pBovino.modificarBovino(pBovino);
    }

    public static boolean modificarBovinoFoto(Bovino pBovino) {

        return persistencia.pBovino.modificarBovinoFoto(pBovino);
    }

    public static Bovino buscarBovinoCaravana(String pCaravanaBovino) {

        return persistencia.pBovino.buscarBovinoCaravana(pCaravanaBovino);
    }

    public static Bovino buscarBovinoBajaLogicaCaravana(String pCaravanaBovino) {

        return persistencia.pBovino.buscarBovinoBajaLogicaCaravana(pCaravanaBovino);
    }

    public static Bovino buscarBovinoCaravanaCompleto(String pCaravanaBovino) {

        return persistencia.pBovino.buscarBovinoCaravanaCompleto(pCaravanaBovino);
    }

    public static Bovino buscarBovinoId(int idBovino) {

        return persistencia.pBovino.buscarBovinoId(idBovino);
    }

    public static ArrayList<Bovino> buscarBovinoCaravanaLIKE(String pCaravana) {

        return pBovino.buscarBovinoCaravanaLIKE(pCaravana);
    }

    public static ArrayList<Bovino> buscarBovinoCaravanaLIKETodos(String pCaravana) {

        return pBovino.buscarBovinoCaravanaLIKETodos(pCaravana);
    }

    public static ArrayList<Bovino> listarBovinos() {

        return persistencia.pBovino.listarBovinos();
    }

}
