package clases;

public class Pedigree {

    private Bovino bovino;
    private String numeroPedigree;

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }

    public String getNumeroPedigree() {
        return numeroPedigree;
    }

    public void setNumeroPedigree(String numeroPedigree) {
        this.numeroPedigree = numeroPedigree;
    }

    @Override
    public String toString() {
        return "Pedigree{" + "bovino=" + bovino + ", numeroPedigree=" + numeroPedigree + '}';
    }

    public Pedigree(Bovino bovino, String numeroPedigree) {
        this.bovino = bovino;
        this.numeroPedigree = numeroPedigree;
    }

}
