package co.edu.unbosque.gestioncampo.repository;


import co.edu.unbosque.gestioncampo.dto.EmpleadoDTO;
import co.edu.unbosque.gestioncampo.entity.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoRepository {
    List<Empleado> listaEmpleados();

    void registrar(Empleado empleado);

    Optional<Empleado> buscarPorId(Integer id);

    void eliminarEmpleado(Integer id);

    List<EmpleadoDTO> listaPorUsuario(Integer id);

    Empleado buscarPorId2(Integer id);

    Empleado buscarPorCedula(String cedula);

    Empleado buscarPorCedula2(String cedula, String cedula2);

    Integer validarCedula2(String cedula, String cedula2);

    Integer validarCedula(String cedula);

    void editarEmpleado(EmpleadoDTO empleadoDTO);


}
