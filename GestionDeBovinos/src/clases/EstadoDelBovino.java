package clases;

public class EstadoDelBovino {

    private int idEstadoDelBovino;
    private String estado;

    public int getIdEstadoDelBovino() {
        return idEstadoDelBovino;
    }

    public void setIdEstadoDelBovino(int idEstadoDelBovino) {
        this.idEstadoDelBovino = idEstadoDelBovino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado;
    }

    public EstadoDelBovino(int idEstadoDelBovino, String estado) {
        this.idEstadoDelBovino = idEstadoDelBovino;
        this.estado = estado;
    }

    public EstadoDelBovino(String estado) {
        this.estado = estado;
    }

}
