package co.edu.unbosque.gestioncampo.repository;


import co.edu.unbosque.gestioncampo.dto.MaterialDTO;
import co.edu.unbosque.gestioncampo.entity.Material;

import java.util.List;
import java.util.Optional;

public interface MaterialRepository {
    List<Material> listaMateriales();

    void registrar(Material material);

    Material buscarPorNombre(String nombre);

    Optional<Material> buscarPorId(Integer id);

    Integer validarNombre(String nombre);

    void eliminarMaterial(Integer id);

    Material buscarPorNombre2(String nombre, String nombre2);


    Integer validarNombre2(String nombre, String nombre2);
    

    void editarMaterial(MaterialDTO materialDTO);


    Material buscarPorId2(Integer id);


}
