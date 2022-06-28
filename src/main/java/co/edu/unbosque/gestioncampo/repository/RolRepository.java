package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Rol;

import java.util.List;
import java.util.Optional;

public interface RolRepository {

    Optional<Rol> buscarPorId(Integer id);
    List<Rol> listaRoles();

    void registrar (Rol rol);
}
