package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoRepository {

    Optional<Departamento> buscarPorId(Integer id);
    List<Departamento> listaDepartamentos();
    void registrar (Departamento departamento);

    Departamento buscarPorNombre(String nombre);

    Integer validarNombre(String nombre);

    Integer obtenerIdPorNombre(String nombre);

    void eliminarDepartamento(Integer id);
}
