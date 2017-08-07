package pe.edu.britanico.intranet.alumno.daomain.alumno;

import pe.edu.britanico.intranet.alumno.daomain.curso.Curso;

import java.util.List;

/**
 * Created by furiusus on 8/6/17.
 */
public class Alumno {
    private String codigo;
    private String clave;
    private String nombre;
    private String apellidoM;
    private String apellidoP;
    private Integer dni;
    private String correo;
    private List<Curso> listaNotas;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Curso> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Curso> listaNotas) {
        this.listaNotas = listaNotas;
    }
}
