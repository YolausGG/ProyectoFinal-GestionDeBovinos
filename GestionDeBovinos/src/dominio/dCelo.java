/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Celo;
import java.util.ArrayList;
import persistencia.pCelo;

public class dCelo {

    public static boolean altaCelo(Celo pCelo) {

        return persistencia.pCelo.altaCelo(pCelo);
    }

    public static boolean bajaCelo(int idCelo) {

        return pCelo.bajaCelo(idCelo);
    }

    public static boolean modificarCelo(int idCelo, Celo pCelo) {

        return persistencia.pCelo.modificarCelo(idCelo, pCelo);
    }

    public static Celo buscarCelo(int idCelo) {

        return pCelo.buscarCelo(idCelo);
    }

    public static ArrayList<Celo> listarCelos() {

        return pCelo.listarCelos();
    }

    public static ArrayList<Celo> listarCelosPorCaravana(String pCaravanaHembra) {

        return pCelo.listarCelosPorCaravana(pCaravanaHembra);
    }

}
