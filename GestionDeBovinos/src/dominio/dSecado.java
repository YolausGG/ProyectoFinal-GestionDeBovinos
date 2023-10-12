/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Secado;
import java.util.ArrayList;
import persistencia.pSecado;

public class dSecado {

    public static boolean altaSecado(Secado pSecado) {

        return persistencia.pSecado.altaSecado(pSecado);
    }

    public static boolean bajaSecado(int idSecado) {

        return pSecado.bajaSecado(idSecado);
    }

    public static boolean modificarSecado(int idSecado, Secado pSecado) {

        return persistencia.pSecado.modificarSecado(idSecado, pSecado);
    }

    public static Secado buscarSecado(int idSecado) {

        return pSecado.buscarSecado(idSecado);
    }

    public static ArrayList<Secado> listarSecados() {

        return pSecado.listarSecados();
    }

    public static ArrayList<Secado> listarSecadosPorCaravana(String pCaravanaHembra) {

        return pSecado.listarSecadosPorCaravana(pCaravanaHembra);
    }

}
