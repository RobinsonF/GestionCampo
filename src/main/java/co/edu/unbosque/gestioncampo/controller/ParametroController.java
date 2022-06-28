package co.edu.unbosque.gestioncampo.controller;

import co.edu.unbosque.gestioncampo.entity.Parametro;
import co.edu.unbosque.gestioncampo.service.ParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/parametro")
@CrossOrigin(origins = "http://localhost:4200")
public class ParametroController {

    @Autowired
    ParametroService parametroService;

    @GetMapping("/Intento")
    public Parametro listaOrden(@RequestParam String tipo){
        return parametroService.obtenerParametro(tipo);
    }
}
