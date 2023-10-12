/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Bovino;
import clases.Parentesco;
import java.util.ArrayList;
import persistencia.pParentesco;

public class dParentesco {

    public static boolean altaParentesco(int idBovinoHijo, int idBovinoPadre, String pParentesco) {

        return persistencia.pParentesco.altaParentesco(idBovinoHijo, idBovinoPadre, pParentesco);
    }

    public static boolean bajaParentesco(int idBovinoHijo, int idBovinoPadre) {

        return pParentesco.bajaParentesco(idBovinoHijo, idBovinoPadre);
    }

    public static boolean bajaParentescos(int idBovinoPadre) {

        return pParentesco.bajaParentescos(idBovinoPadre);
    }

    public static boolean modificarParentesco(int idBovinoHijo, int idBovinoPadre, String pParentesco) {

        return persistencia.pParentesco.modificarParentesco(idBovinoHijo, idBovinoPadre, pParentesco);
    }

    public static Parentesco buscarParentesco(int idBovinoHijo, int idBovinoPadre) {

        return pParentesco.buscarParentesco(idBovinoHijo, idBovinoPadre);
    }

    public static Parentesco buscarParentescoMadre(int idBovinoHijo) {

        return pParentesco.buscarParentescoMadre(idBovinoHijo);
    }

    public static Parentesco buscarParentescoPadre(int idBovinoHijo) {

        return pParentesco.buscarParentescoPadre(idBovinoHijo);
    }

    public static ArrayList<Bovino> buscarPadres(int pIdBovino) {

        return persistencia.pParentesco.buscarPadres(pIdBovino);
    }

    public static ArrayList<Bovino> buscarHijos(int pIdBovino) {

        return persistencia.pParentesco.buscarHijos(pIdBovino);
    }
}
