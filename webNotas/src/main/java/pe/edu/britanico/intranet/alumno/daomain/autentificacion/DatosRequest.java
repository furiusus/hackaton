package pe.edu.britanico.intranet.alumno.daomain.autentificacion;

/**
 * Created by furiusus on 8/6/17.
 */
public class DatosRequest {
    private String codigo;
    private String clave;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
