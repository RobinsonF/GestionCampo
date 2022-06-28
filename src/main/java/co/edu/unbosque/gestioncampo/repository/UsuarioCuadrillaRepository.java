package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Usuariocuadrilla;

import java.util.List;
import java.util.Optional;

public interface UsuarioCuadrillaRepository {
    List<Usuariocuadrilla> listaUsuarioCuadrillas();

    void registrar(Usuariocuadrilla usuarioCuadrilla);

    Optional<Usuariocuadrilla> buscarPorId(Integer id);

}
