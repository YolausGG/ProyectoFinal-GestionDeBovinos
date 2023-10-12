/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Pedigree;
import java.util.ArrayList;

public class dPedigree {

    public static boolean altaPedigree(Pedigree pPedigree) {

        return persistencia.pPedigree.altaPedigree(pPedigree);
    }

    public static boolean bajaPedigree(int idBovino) {

        return persistencia.pPedigree.bajaPedigree(idBovino);
    }

    public static boolean modificarPedigree(Pedigree pPedigree) {

        return persistencia.pPedigree.modificarPedigree(pPedigree);
    }

    public static Pedigree buscarPedigreeIdBovino(int idBovino) {

        return persistencia.pPedigree.buscarPedigreeIdBovino(idBovino);
    }

    public static Pedigree buscarPedigreeNumeroPedigree(String numeroPedigree) {

        return persistencia.pPedigree.buscarPedigreeNumeroPedigree(numeroPedigree);
    }

    public static ArrayList<Pedigree> listarPedigrees() {

        return persistencia.pPedigree.listarPedigrees();
    }

}
