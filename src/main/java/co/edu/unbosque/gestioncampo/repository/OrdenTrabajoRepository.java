package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.dto.OrdenTrabajoDTO;
import co.edu.unbosque.gestioncampo.entity.Ordentrabajo;

import java.util.List;
import java.util.Optional;

public interface OrdenTrabajoRepository {
    List<Ordentrabajo> listaOrdenes();

    void registrar(Ordentrabajo ordentrabajo);

    Optional<Ordentrabajo> buscarPorId(Integer id);

    Ordentrabajo buscarPorId2(Integer id);

    void eliminarOrden(Integer id);

    List<OrdenTrabajoDTO> listaPorUsuario(Integer id);

    Ordentrabajo buscarPorNombre2(String nombre, String nombre2);

    Integer validarNombre2(String nombre, String nombre2);

    void editarOrden(OrdenTrabajoDTO ordenTrabajoDTO);

}
