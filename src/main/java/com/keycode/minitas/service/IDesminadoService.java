package com.keycode.minitas.service;

import com.keycode.comun.entidades.jpa.entity.Desminado;;

import java.util.List;

public interface IDesminadoService {
    public Desminado crearProceso(Desminado desminado);
    public List<Desminado> obtenerProcesos();
    public Desminado obtenerProcesoById(Long id);
    public Desminado actualizarProceso(Desminado desminado);
    public void eliminarProceso(Long id);
}
