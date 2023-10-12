package clases;

public class Enfermedad {

    private int idEnfermedad;
    private String nombre;

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Enfermedad(int idEnfermedad, String nombre) {
        this.idEnfermedad = idEnfermedad;
        this.nombre = nombre;
    }

    public Enfermedad(String nombre) {
        this.nombre = nombre;

    }

}
