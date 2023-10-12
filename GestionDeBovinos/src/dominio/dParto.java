/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Parto;
import java.util.ArrayList;
import persistencia.pParto;

public class dParto {

    public static boolean altaParto(Parto pParto) {

        return persistencia.pParto.altaParto(pParto);
    }

    public static boolean bajaParto(int idParto) {

        return pParto.bajaParto(idParto);
    }

    public static boolean modificarParto(int idParto, Parto pParto) {

        return persistencia.pParto.modificarParto(idParto, pParto);
    }

    public static Parto buscarParto(int idParto) {

        return pParto.buscarParto(idParto);
    }

    public static ArrayList<Parto> listarPartos() {

        return pParto.listarPartos();
    }

    public static ArrayList<Parto> listarPartosPorCaravana(String pCaravanaHembra) {

        return pParto.listarPartosPorCaravana(pCaravanaHembra);
    }

}
