package clases;

import java.util.Date;

public class Tacto extends EventoDeSanidad {

    private String resultado;
    private String diagnostico;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Tacto(int idEventoDeSanidad, Date fecha, String descripcion, Hembra hembra, String resultado, String diagnostico) {
        super(idEventoDeSanidad, fecha, descripcion, hembra);
        this.resultado = resultado;
        this.diagnostico = diagnostico;
    }

    public Tacto(Date fecha, String descripcion, Hembra hembra, String resultado, String diagnostico) {
        super(fecha, descripcion, hembra);
        this.resultado = resultado;
        this.diagnostico = diagnostico;
    }

}
