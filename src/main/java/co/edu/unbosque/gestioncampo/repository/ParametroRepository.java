package co.edu.unbosque.gestioncampo.repository;

import co.edu.unbosque.gestioncampo.entity.Parametro;

public interface ParametroRepository {
    Parametro obtenerParametro(String tipo);
}
