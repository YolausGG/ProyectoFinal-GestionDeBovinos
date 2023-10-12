/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.BajaLogicaBovino;
import java.util.ArrayList;

public class dBajaLogicaBovino {

    public static boolean altaBajaLogicaBovino(BajaLogicaBovino pBajaLogicaBovino) {

        return persistencia.pBajaLogicaBovino.altaBajaLogicaBovino(pBajaLogicaBovino);
    }

    public static BajaLogicaBovino buscarBajaLogicaBovino(int idBajaLogicaBovino) {

        return persistencia.pBajaLogicaBovino.buscarBajaLogicaBovino(idBajaLogicaBovino);
    }

    public static ArrayList<BajaLogicaBovino> listarBajasLogicaBovinos() {

        return persistencia.pBajaLogicaBovino.listarBajasLogicaBovinos();
    }

}
