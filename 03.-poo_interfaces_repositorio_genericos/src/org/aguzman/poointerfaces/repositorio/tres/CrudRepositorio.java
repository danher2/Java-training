package org.aguzman.poointerfaces.repositorio.tres;

import java.util.List;

import org.aguzman.poointerfaces.modelo.tres.Cliente;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);
}
