package com.example.viaticosonline.servicios;

import com.example.viaticosonline.entidades.Empleado;

import java.util.List;

public interface ServicioBase<E> {

    public List<E> buscarTodos() throws Exception;

    public E buscarPorId(Integer id) throws Exception;

    public E registrar(E entidad) throws Exception;

    Empleado registrar(Empleado entidad) throws Exception;

    public E editar(Integer id, E entidad) throws Exception;

}
