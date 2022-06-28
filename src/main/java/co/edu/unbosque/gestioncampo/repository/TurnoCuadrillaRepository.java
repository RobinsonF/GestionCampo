package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Turnocuadrilla;

import java.util.List;
import java.util.Optional;

public interface TurnoCuadrillaRepository {
    List<Turnocuadrilla> listaTurnoCuadrillas();

    void registrar(Turnocuadrilla turnoCuadrilla);

    Optional<Turnocuadrilla> buscarPorId(Integer id);
}
