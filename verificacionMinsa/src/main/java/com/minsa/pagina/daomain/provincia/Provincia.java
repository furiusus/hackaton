package com.minsa.pagina.daomain.provincia;

/**
 * Created by furiusus on 8/29/17.
 */
public class Provincia {
    private String co_provincia;
    private String no_provincia;
    private String co_departamento;

    public String getCo_departamento() {
        return co_departamento;
    }

    public void setCo_departamento(String co_departamento) {
        this.co_departamento = co_departamento;
    }

    public String getCo_provincia() {
        return co_provincia;
    }

    public void setCo_provincia(String co_provincia) {
        this.co_provincia = co_provincia;
    }

    public String getNo_provincia() {
        return no_provincia;
    }

    public void setNo_provincia(String no_provincia) {
        this.no_provincia = no_provincia;
    }
}
