package clases;

public class Raza {

    private int idRaza;
    private String tipo;

    public int getIdRaza() {
        return idRaza;
    }

    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

    public Raza(int idRaza, String tipo) {
        this.idRaza = idRaza;
        this.tipo = tipo;
    }

}
