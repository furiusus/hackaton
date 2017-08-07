package pe.edu.britanico.intranet.alumno.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.britanico.intranet.alumno.daomain.alumno.Alumno;
import pe.edu.britanico.intranet.alumno.daomain.autentificacion.DatosRequest;
import pe.edu.britanico.intranet.alumno.daomain.autentificacion.DatosResponse;
import pe.edu.britanico.intranet.alumno.daomain.curso.Curso;

import java.util.ArrayList;

/**
 * Created by furiusus on 8/6/17.
 */
@Controller
@RequestMapping(value = "servicioAutentificacion")
public class datosController {
    @RequestMapping(value = "autenticarDatos",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody DatosResponse autenticarDatos(@RequestBody DatosRequest datosRequest){
        DatosResponse datosResponse=new DatosResponse();
        if (datosRequest.getCodigo().equals("77402")&&datosRequest.getClave().equals("20477")){
            datosResponse.setAlumno(new Alumno());
            Curso cursoObj1= new Curso();
            cursoObj1.setAnio("2016");
            cursoObj1.setMes("Diciembre");
            cursoObj1.setCursoCiclo("B001");
            cursoObj1.setCentro("Los Jardines");
            cursoObj1.setProfesor("Lorena");
            cursoObj1.setNota((float)86);
            Curso cursoObj2= new Curso();
            cursoObj2.setAnio("2017");
            cursoObj2.setMes("Enero");
            cursoObj2.setCursoCiclo("B002");
            cursoObj2.setCentro("Los Jardines");
            cursoObj2.setProfesor("Milagros");
            cursoObj2.setNota((float)96);
            Curso cursoObj3= new Curso();
            cursoObj3.setAnio("2017");
            cursoObj3.setMes("Febrero");
            cursoObj3.setCursoCiclo("B003");
            cursoObj3.setCentro("Los Jardines");
            cursoObj3.setProfesor("Rosa");
            cursoObj3.setNota((float)86);
            Alumno alumnoObj= new Alumno();
            alumnoObj.setNombre("Ronny Daniel");
            alumnoObj.setApellidoM("Herrera");
            alumnoObj.setApellidoP("Herrera");
            alumnoObj.setCorreo("ronad_1997@hotmail.com");
            alumnoObj.setDni(71197765);
            alumnoObj.setCodigo(datosRequest.getCodigo());
            alumnoObj.setClave(datosRequest.getClave());
            alumnoObj.setListaNotas(new ArrayList<Curso>());
            alumnoObj.getListaNotas().add(cursoObj1);
            alumnoObj.getListaNotas().add(cursoObj2);
            alumnoObj.getListaNotas().add(cursoObj3);
            datosResponse.setAlumno(alumnoObj);
        }
        return datosResponse;
    }
}
