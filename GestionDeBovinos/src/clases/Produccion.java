package clases;

import java.util.Date;

public class Produccion {

    private int idProduccion;
    private Double primeraProduccion;
    private Double segundaProduccion;
    private Double produccionTotal;
    private Double proteina;
    private Double grasa;
    private int celulaSomatica;
    private Date fecha;
    private Hembra hembra;

    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Double getPrimeraProduccion() {
        return primeraProduccion;
    }

    public void setPrimeraProduccion(Double primeraProduccion) {
        this.primeraProduccion = primeraProduccion;
    }

    public Double getSegundaProduccion() {
        return segundaProduccion;
    }

    public void setSegundaProduccion(Double segundaProduccion) {
        this.segundaProduccion = segundaProduccion;
    }

    public Double getProduccionTotal() {
        return produccionTotal;
    }

    public Double getProteina() {
        return proteina;
    }

    public void setProteina(Double proteina) {
        this.proteina = proteina;
    }

    public Double getGrasa() {
        return grasa;
    }

    public void setGrasa(Double grasa) {
        this.grasa = grasa;
    }

    public int getCelulaSomatica() {
        return celulaSomatica;
    }

    public void setCelulaSomatica(int celulaSomatica) {
        this.celulaSomatica = celulaSomatica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Hembra getHembra() {
        return hembra;
    }

    public void setHembra(Hembra hembra) {
        this.hembra = hembra;
    }

    @Override
    public String toString() {
        return "Produccion{"
                + "idProduccion=" + idProduccion
                + ", primeraProduccion=" + primeraProduccion
                + ", segundaProduccion=" + segundaProduccion
                + ", produccionTotal=" + produccionTotal
                + ", proteina=" + proteina
                + ", grasa=" + grasa
                + ", celulaSomatica=" + celulaSomatica
                + ", fecha=" + fecha
                + ", hembra=" + hembra
                + '}';
    }

    public Produccion(int idProduccion, Double primeraProduccion, Double segundaProduccion, Double produccionTotal, Double proteina, Double grasa, int celulaSomatica, Date fecha, Hembra hembra) {
        this.idProduccion = idProduccion;
        this.primeraProduccion = primeraProduccion;
        this.segundaProduccion = segundaProduccion;
        this.proteina = proteina;
        this.grasa = grasa;
        this.celulaSomatica = celulaSomatica;
        this.fecha = fecha;
        this.hembra = hembra;
        this.produccionTotal = produccionTotal;
    }

    public Produccion(Double primeraProduccion, Double segundaProduccion, Double proteina, Double grasa, int celulaSomatica, Date fecha, Hembra hembra) {
        this.primeraProduccion = primeraProduccion;
        this.segundaProduccion = segundaProduccion;
        this.proteina = proteina;
        this.grasa = grasa;
        this.celulaSomatica = celulaSomatica;
        this.fecha = fecha;
        this.hembra = hembra;
    }

    public Double calcularProduccionTotal() {
        return primeraProduccion + segundaProduccion;
    }

}
