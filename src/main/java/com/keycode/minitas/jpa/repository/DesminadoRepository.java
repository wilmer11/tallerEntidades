package com.keycode.minitas.jpa.repository;

import com.keycode.comun.entidades.jpa.entity.Desminado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesminadoRepository extends JpaRepository<Desminado, Long> {
}
