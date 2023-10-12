/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Macho;
import java.util.ArrayList;
import persistencia.pMacho;

public class dMacho {

    public static boolean altaMacho(Macho pMacho) {

        return persistencia.pMacho.altaMacho(pMacho);
    }

    public static boolean bajaMacho(int idMacho) {

        return pMacho.bajaMacho(idMacho);
    }

    public static boolean modificarMacho(Macho pMacho) {

        return persistencia.pMacho.modificarMacho(pMacho);
    }

    public static Macho buscarMachoPorId(int idMacho) {

        return pMacho.buscarMachoPorId(idMacho);
    }

    public static Macho buscarMachoPorCaravana(String pCaravanaMacho) {

        return pMacho.buscarMachoPorCaravana(pCaravanaMacho);
    }

    public static Macho buscarMachoPorCaravanaCompleto(String pCaravanaMacho) {

        return pMacho.buscarMachoPorCaravanaCompleto(pCaravanaMacho);
    }

    public static Macho buscarUltimoMacho() {

        return pMacho.buscarUltimoMacho();
    }

    public static ArrayList<Macho> buscarMachosCaravanaLIKE(String pCaravana) {

        return pMacho.buscarMachosCaravanaLIKE(pCaravana);
    }

    public static ArrayList<Macho> listarMachos() {

        return pMacho.listarMachos();
    }

}
