/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica1web.practica1web.controller;

import com.practica1web.practica1web.entity.Concierto;
import com.practica1web.practica1web.services.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jorklin
 */
@Controller
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;

    
    @GetMapping("/concierto")
    public String indexC(Model model) {
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla de conciertos");
        model.addAttribute("Conciertos", listaConcierto);
        return "conciertos";
    }
    
    @GetMapping("/conciertoNuevo")
    public String crearConcierto(Model model){
        model.addAttribute("concierto", new Concierto());
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto){
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }
    
    @GetMapping("/editConcierto/{idCon}")
    public String editarConcierto(@PathVariable("idCon") Long idCon, Model model){
        Concierto concierto = conciertoService.getConciertoById(idCon);
        model.addAttribute("concierto", concierto);
        return "crear";
    }
    
    @GetMapping("/delete/{idCon}")
    public String eliminarConcierto(@PathVariable("idCon") Long idCon){
        conciertoService.delete(idCon);
        return "redirect:/concierto";
    }
}
    

