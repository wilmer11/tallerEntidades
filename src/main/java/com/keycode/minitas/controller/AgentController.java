package com.keycode.minitas.controller;

import com.keycode.minitas.service.IDesminadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AgentController {
    @Autowired
    private IDesminadoService desminadoService;
    @GetMapping("/agents")
    public String dashboard(Model model){
        model.addAttribute("agentes", desminadoService.obtenerProcesos());
        return "agents";
    }
    @GetMapping("/agent/{id}")
    public String agent(Model model, @PathVariable Long id) {
        model.addAttribute("agente", desminadoService.obtenerProcesoById(id));
        return "agent";
    }
}
