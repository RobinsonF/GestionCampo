package co.edu.unbosque.gestioncampo.controller;

import co.edu.unbosque.gestioncampo.dto.CiudadDTO;
import co.edu.unbosque.gestioncampo.dto.EstadoDTO;
import co.edu.unbosque.gestioncampo.entity.Ciudad;
import co.edu.unbosque.gestioncampo.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ciudad")
@CrossOrigin(origins = "http://localhost:4200")
public class CiudadController {
    @Autowired
    CiudadService ciudadService;

    @GetMapping("/listaCiudad")
    public ResponseEntity<List<CiudadDTO>> listaCiudad(){

        List<Ciudad> ciudades = ciudadService.listaCiudad();
        List<CiudadDTO> listaCiudades = new ArrayList<>();
        for (Ciudad ciudad: ciudades) {
            listaCiudades.add(
                    new CiudadDTO(ciudad.getIdCiudad(),ciudad.getNombre(),ciudad.getDepartamento().getNombre())
            );
        }
        return new ResponseEntity<List<CiudadDTO>>(listaCiudades, HttpStatus.OK);
    }

    @PostMapping("/crearCiudad")
    public EstadoDTO crearCiudad(@RequestBody CiudadDTO ciudadDTO){
        System.out.println(ciudadDTO.getNombre() + "  " + ciudadDTO.getNombreDepartamento());
        EstadoDTO estadoDTO = new EstadoDTO();
        String mensaje = ciudadService.registrarCiudad(ciudadDTO);
        estadoDTO.setMensaje(mensaje);
        return estadoDTO;
    }

    @PostMapping("/obtenerId/{id}")
    public Integer obtenerId(@RequestBody CiudadDTO ciudadDTO){
        return ciudadService.obtenerIdPorNombre(ciudadDTO.getNombre());
    }

    @PutMapping("/eliminarCiudad")
    public EstadoDTO eliminarCiudad(@RequestParam Integer id){
        EstadoDTO estadoDTO = new EstadoDTO();
        ciudadService.eliminarCiudad(id);
        estadoDTO.setMensaje("Ciudad eliminada");
        return estadoDTO;
    }

}
