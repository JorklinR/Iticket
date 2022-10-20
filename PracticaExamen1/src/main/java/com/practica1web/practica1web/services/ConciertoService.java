/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica1web.practica1web.services;
import org.springframework.stereotype.Service;
import com.practica1web.practica1web.entity.Concierto;
import com.practica1web.practica1web.repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jorklin
 */
@Service
public class ConciertoService implements IConciertoService{
    
    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getAllConcierto() {
       return (List<Concierto>) conciertoRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long idCon) {
        return conciertoRepository.findById(idCon).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto concierto) {
       conciertoRepository.save(concierto);
    }

    @Override
    public void delete(long idCon) {
       conciertoRepository.deleteById(idCon);
    }
    
}
