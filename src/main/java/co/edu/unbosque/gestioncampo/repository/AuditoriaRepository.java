package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Auditoria;
import co.edu.unbosque.gestioncampo.entity.Rol;


import java.util.List;
import java.util.Optional;

public interface AuditoriaRepository {

    Optional<Auditoria> buscarPorId(Integer id);
    List<Auditoria> getAuditorias(Integer id);

    List<Auditoria> getAuditorias();

    void registrar(Auditoria auditoria);

    Auditoria obtenerAuditoriaPorId(Auditoria auditoria);;


    List<Auditoria> obtenerAuditoriasPorFecha(String fecha1, String fecha2, Integer id);

    void actualizarFecha(String fecha, Integer id);
}
