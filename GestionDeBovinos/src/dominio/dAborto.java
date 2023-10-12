/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Aborto;
import java.util.ArrayList;
import persistencia.pAborto;

public class dAborto {

    public static boolean altaAborto(Aborto pAborto) {

        return persistencia.pAborto.altaAborto(pAborto);
    }

    public static boolean bajaAborto(int idAborto) {

        return pAborto.bajaAborto(idAborto);
    }

    public static boolean modificarAborto(int idAborto, Aborto pAborto) {

        return persistencia.pAborto.modificarAborto(idAborto, pAborto);
    }

    public static Aborto buscarAborto(int idAborto) {

        return pAborto.buscarAborto(idAborto);
    }

    public static ArrayList<Aborto> listarAbortos() {

        return pAborto.listarAbortos();
    }

    public static ArrayList<Aborto> listarAbortosPorCaravana(String pCaravanaHembra) {

        return pAborto.listarAbortosPorCaravana(pCaravanaHembra);
    }

}
