package com.minsa.pagina.controller;

import com.minsa.pagina.daomain.centroMedico.CentroMedico;
import com.minsa.pagina.daomain.centroMedico.CentroMedicoRequest;
import com.minsa.pagina.daomain.centroMedico.CentroMedicoResponse;
import com.minsa.pagina.daomain.departamento.DepartamentoRequest;
import com.minsa.pagina.daomain.provincia.ProvinciaRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by furiusus on 8/29/17.
 */
@Controller
public class controladorCentros {
    @RequestMapping(value = "/busquedaCentro",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody CentroMedicoResponse busquedaCentro(@RequestBody CentroMedicoRequest centroMedicoRequest){
        CentroMedicoResponse centroMedicoResponse=new CentroMedicoResponse();
        centroMedicoResponse.setListaCentroMedico(new ArrayList<CentroMedico>());

        if(centroMedicoRequest.getCo_departamento().equals("l01")){
            CentroMedico centroMedicoObj= new CentroMedico();
            centroMedicoObj.setCo_centro("C01");
            centroMedicoObj.setCo_departamento(centroMedicoRequest.getCo_departamento());
            centroMedicoObj.setCo_provincia("P01");
            centroMedicoObj.setNo_centro("Loaysa");
            centroMedicoObj.setNo_provincia("Lima");
            centroMedicoResponse.getListaCentroMedico().add(centroMedicoObj);
        }
        if(centroMedicoRequest.getCo_departamento().equals("I01")){
            CentroMedico centroMedicoObj= new CentroMedico();
            centroMedicoObj.setCo_centro("C02");
            centroMedicoObj.setCo_departamento(centroMedicoRequest.getCo_departamento());
            centroMedicoObj.setCo_provincia("P02");
            centroMedicoObj.setNo_centro("Negreiro");
            centroMedicoObj.setNo_provincia("Ica");
            centroMedicoResponse.getListaCentroMedico().add(centroMedicoObj);
        }
        return centroMedicoResponse;
    }
}
