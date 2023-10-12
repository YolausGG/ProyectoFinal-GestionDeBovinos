package clases;

import java.util.ArrayList;
import java.util.Date;

public class Bovino {

    private int idBovino;
    private String caravanaBovino;
    private Date fechaNacimiento;
    private Hembra madre;
    private Macho padre;
    private Raza raza;
    private byte[] foto;
    private ArrayList<EstadoDelBovino> estadosDelBovino;

    public int getIdBovino() {
        return idBovino;
    }

    public void setIdBovino(int idBovino) {
        this.idBovino = idBovino;
    }

    public String getCaravanaBovino() {
        return caravanaBovino;
    }

    public void setCaravanaBovino(String caravanaBovino) {
        this.caravanaBovino = caravanaBovino;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Hembra getMadre() {
        return madre;
    }

    public void setMadre(Hembra madre) {
        this.madre = madre;
    }

    public Macho getPadre() {
        return padre;
    }

    public void setPadre(Macho padre) {
        this.padre = padre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public ArrayList<EstadoDelBovino> getEstadosDelBovino() {
        return estadosDelBovino;
    }

    public void setEstadosDelBovino(ArrayList<EstadoDelBovino> estadosDelBovino) {
        this.estadosDelBovino = estadosDelBovino;
    }

    public String toString() {
        return caravanaBovino;
    }

    public Bovino(int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, ArrayList<EstadoDelBovino> estadosDelBovino) {
        this.idBovino = idBovino;
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
        this.raza = raza;
        this.estadosDelBovino = estadosDelBovino;
    }

    public Bovino(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza) {
        this.idBovino = idBovino;
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
    }

    public Bovino(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, Hembra madre, Macho padre) {
        this.idBovino = idBovino;
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.madre = madre;
        this.padre = padre;
    }

    public Bovino(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, ArrayList<EstadoDelBovino> estadosDelBovino) {
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
        this.raza = raza;
        this.estadosDelBovino = estadosDelBovino;
    }

    public Bovino(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza) {
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
        this.raza = raza;
    }

    public Bovino(String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto) {
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
        this.raza = raza;
        this.foto = foto;
    }

    public Bovino(int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto) {
        this.idBovino = idBovino;
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
        this.raza = raza;
        this.foto = foto;
    }

    public Bovino(int idBovino, String caravanaBovino, Date fechaNacimiento, Hembra madre, Macho padre, Raza raza, byte[] foto, ArrayList<EstadoDelBovino> estadosDelBovino) {
        this.idBovino = idBovino;
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.madre = madre;
        this.padre = padre;
        this.raza = raza;
        this.foto = foto;
        this.estadosDelBovino = estadosDelBovino;
    }

    public Bovino(int idBovino, String caravanaBovino, Date fechaNacimiento, Raza raza, byte[] foto) {
        this.idBovino = idBovino;
        this.caravanaBovino = caravanaBovino;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
        this.foto = foto;
    }

    public Bovino() {
    }

}
