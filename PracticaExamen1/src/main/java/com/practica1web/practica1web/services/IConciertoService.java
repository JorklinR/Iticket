/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica1web.practica1web.services;
import com.practica1web.practica1web.entity.Concierto;
import java.util.List;
/**
 *
 * @author Jorklin
 */
public interface IConciertoService {
     public List<Concierto> getAllConcierto();
    public Concierto getConciertoById(long idCon);
    public void saveConcierto(Concierto concierto);
    public void delete(long idCon);
    
}
