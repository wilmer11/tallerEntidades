package com.keycode.minitas.service.impl;

import com.keycode.comun.entidades.jpa.entity.Desminado;
import com.keycode.minitas.jpa.repository.DesminadoRepository;
import com.keycode.minitas.service.IDesminadoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DesminadoService implements IDesminadoService {

    @Autowired
    private DesminadoRepository desminadoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Desminado crearProceso(Desminado desminado) {
        return desminadoRepository.save(desminado);
    }

    @Override
    public List<Desminado> obtenerProcesos() {
        return desminadoRepository.findAll();
    }

    @Override
    public Desminado obtenerProcesoById(Long id) {
      return desminadoRepository.findById(id).get();
    }

    @Override
    public Desminado actualizarProceso(Desminado desminado) {
        return desminadoRepository.save(desminado);
    }

    @Override
    public void eliminarProceso(Long id){
        Desminado desminado = desminadoRepository
                .findById(id)
                .orElseThrow();
        desminadoRepository.delete(desminado);
    }
}
