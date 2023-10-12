/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Hembra;
import java.util.ArrayList;
import persistencia.pHembra;

public class dHembra {

    public static boolean altaHembra(Hembra pHembra) {

        return persistencia.pHembra.altaHembra(pHembra);
    }

    public static boolean bajaHembra(int idHembra) {

        return pHembra.bajaHembra(idHembra);
    }

    public static Hembra buscarHembraPorId(int idHembra) {

        return pHembra.buscarHembraPorId(idHembra);
    }

    public static Hembra buscarHembraPorCaravana(String pCaravanaHembra) {

        return pHembra.buscarHembraPorCaravana(pCaravanaHembra);
    }

    public static Hembra buscarHembraPorCaravanaCompleta(String pCaravanaHembra) {

        return pHembra.buscarHembraPorCaravanaCompleta(pCaravanaHembra);
    }

    public static Hembra buscarUltimaHembra() {

        return pHembra.buscarUltimaHembra();
    }

    public static ArrayList<Hembra> buscarHembrasCaravanaLIKE(String pCaravana) {

        return pHembra.buscarHembrasCaravanaLIKE(pCaravana);
    }

    public static ArrayList<Hembra> listarHembras() {

        return pHembra.listarHembras();
    }

}
