package com.prueba.test1.controller;

import com.prueba.test1.daomain.Cliente;
import com.prueba.test1.daomain.ClienteRequest;
import com.prueba.test1.daomain.ClienteResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by furiusus on 8/4/17.
 */
@Controller
@RequestMapping(value = "servicio")
public class ClienteController {
    @RequestMapping(value = "obtenerCliente", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ClienteResponse obtenerCliente(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse clienteResponse =new ClienteResponse();
        if(clienteRequest.getTelefono().equals("71197765")){
            Cliente clienteobj = new Cliente();
            clienteobj.setApellido("Herrera");
            clienteobj.setNombre("Ronny");
            clienteobj.setDni(9603244);
            clienteobj.setTelefono(Integer.parseInt(clienteRequest.getTelefono()));
            clienteResponse.setListaCliente(new ArrayList<Cliente>());
            clienteResponse.getListaCliente().add(clienteobj);
        }
        return clienteResponse;
    }
    @RequestMapping(value = "obtenerClientess", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ClienteResponse obtenerClientes(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse clienteResponse =new ClienteResponse();
        if(clienteRequest.getTelefono().equals("71197765")){
            Cliente clienteobj = new Cliente();
            clienteobj.setApellido("Hancco");
            clienteobj.setNombre("Rony");
            clienteobj.setDni(9603244);
            clienteobj.setTelefono(Integer.parseInt(clienteRequest.getTelefono()));
            clienteResponse.setListaCliente(new ArrayList<Cliente>());
            clienteResponse.getListaCliente().add(clienteobj);
        }
        return clienteResponse;
    }

}
