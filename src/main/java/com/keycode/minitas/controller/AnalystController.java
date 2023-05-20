package com.keycode.minitas.controller;

import com.keycode.comun.entidades.jpa.entity.Desminado;
import com.keycode.minitas.service.IDesminadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnalystController {
    @Autowired
    private IDesminadoService desminadoService;
    @GetMapping("/analyst")
    public String dashboard(Model model){
        model.addAttribute("agentes", desminadoService.obtenerProcesos());
        return "analyst";
    }

    @GetMapping("/analyst/{id}")
    public String eliminarProceso(@PathVariable Long id) {
        desminadoService.eliminarProceso(id);
        return "redirect:/analyst";
    }

    @GetMapping("/analyst/new")
    public String iniciarProceso(Model model){
        Desminado desminado = new Desminado();
        model.addAttribute("agent", desminado);
        return "createAgent";
    }

    @PostMapping("/analyst/save")
    public String saveProceso(@ModelAttribute("agent") Desminado desminado) {
        desminadoService.crearProceso(desminado);
        return "redirect:/analyst";
    }

    @GetMapping("/analyst/edit/{id}")
    public String editarProceso(Model model, @PathVariable Long id){
        model.addAttribute("agent", desminadoService.obtenerProcesoById(id));
        return "editAgent";
    }

    @PostMapping("/analyst/{id}")
    public String updateProceso(Model model, @PathVariable Long id, @ModelAttribute("agent") Desminado desminado){
        Desminado desminado1 = desminadoService.obtenerProcesoById(id);
        desminado1.setId(id);
        desminado1.setUbicacion(desminado.getUbicacion());
        desminado1.setRegion(desminado.getRegion());
        desminado1.setDesminado(desminado.getDesminado());
        desminado1.setAgente(desminado.getAgente());
        desminadoService.actualizarProceso(desminado1);
        return "redirect:/analyst";
    }
}
