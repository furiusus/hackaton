package com.prueba.test1.daomain;

import java.util.List;

/**
 * Created by furiusus on 8/4/17.
 */
public class ClienteResponse {
    private List<Cliente> listaCliente;

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
