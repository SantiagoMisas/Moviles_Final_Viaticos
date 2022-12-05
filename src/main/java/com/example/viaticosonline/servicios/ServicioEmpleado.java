package com.example.viaticosonline.servicios;


import com.example.viaticosonline.entidades.Empleado;
import com.example.viaticosonline.repositorios.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioEmpleado implements ServicioBase{

    @Autowired
    RepositorioEmpleado repositorioEmpleado;

    @Override
    public List buscarTodos() throws Exception {
        try{
          List<Empleado> empleados=repositorioEmpleado.findAll();
          return empleados;

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    @Override
    public Empleado buscarPorId(Integer id) throws Exception {
   try{
       Optional<Empleado> empleadoBuscado=repositorioEmpleado.findById(id);
       return empleadoBuscado.get();

   }catch(Exception error){
       throw new Exception(error.getMessage());
   }
    }

    @Override
    public Object registrar(Object entidad) throws Exception {
        return null;
    }

    @Override
    public Object editar(Integer id, Object entidad) throws Exception {
        return null;
    }
}
