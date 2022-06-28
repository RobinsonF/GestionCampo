package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Ciudad;

import java.util.List;
import java.util.Optional;

public interface CiudadRepository {

    List<Ciudad> listaCiudades();

    void registrar(Ciudad ciudad);

    Optional<Ciudad> buscarPorId(Integer id);

    Ciudad buscarPorNombre(String nombre);

    Integer validarNombre(String nombre);

    Integer obtenerIdPorNombre(String nombre);

    void eliminarCiudad(Integer id);
}
