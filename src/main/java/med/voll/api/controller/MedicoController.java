package med.voll.api.controller;

import med.voll.api.medico.DatosRegistroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    //(Request body): permite reconocer los datos enviados desde el cliente
    /*{
	"nombre": "perencejito",
	"email": "perencejito@gmail.com",
	"documento": "1088326788",
	"especialidad": "ORTOPEDIA",
	"direccion": {
	"calle": "calle 2b",
	"barrio": "hernando velez",
	"ciudad": "pereira",
	"numero": "07",
	"complemento": "carrera 7 bis"
	}
}*/
    public void registrarMedico(@RequestBody DatosRegistroMedico datosRegistroMedico){
        System.out.println(datosRegistroMedico);
    }
}
