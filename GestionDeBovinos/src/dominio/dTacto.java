/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Tacto;
import java.util.ArrayList;
import persistencia.pTacto;

public class dTacto {

    public static boolean altaTacto(Tacto pTacto) {

        return persistencia.pTacto.altaTacto(pTacto);
    }

    public static boolean bajaTacto(int idTacto) {

        return pTacto.bajaTacto(idTacto);
    }

    public static boolean modificarTacto(int idTacto, Tacto pTacto) {

        return persistencia.pTacto.modificarTacto(idTacto, pTacto);
    }

    public static Tacto buscarTacto(int idTacto) {

        return pTacto.buscarTacto(idTacto);
    }

    public static ArrayList<Tacto> listarTactos() {

        return pTacto.listarTactos();
    }

    public static ArrayList<Tacto> listarTactosPorCaravana(String pCaravanaHembra) {

        return pTacto.listarTactosPorCaravana(pCaravanaHembra);
    }

}
