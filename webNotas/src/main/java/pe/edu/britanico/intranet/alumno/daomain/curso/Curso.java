package pe.edu.britanico.intranet.alumno.daomain.curso;

/**
 * Created by furiusus on 8/6/17.
 */
public class Curso {
    private String cursoCiclo;
    private String profesor;
    private String centro;
    private String anio;
    private String mes;
    private Float nota;

    public String getCursoCiclo() {
        return cursoCiclo;
    }

    public void setCursoCiclo(String cursoCiclo) {
        this.cursoCiclo = cursoCiclo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
}
