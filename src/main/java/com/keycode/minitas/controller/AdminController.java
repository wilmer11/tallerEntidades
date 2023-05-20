package com.keycode.minitas.controller;

import com.keycode.minitas.service.IDesminadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @Autowired
    private IDesminadoService desminadoService;
    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("agentes", desminadoService.obtenerProcesos());
        return "admin";
    }
}
