package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Detalleordentrabajo;

import java.util.List;
import java.util.Optional;

public interface DetalleOrdenTrabajoRepository {
    List<Detalleordentrabajo> listaDetalleOrdenTrabajos();

    void registrar(Detalleordentrabajo detalleOrdenTrabajo);

    Optional<Detalleordentrabajo> buscarPorId(Integer id);
}

