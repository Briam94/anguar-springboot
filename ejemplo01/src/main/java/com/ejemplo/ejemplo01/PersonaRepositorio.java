/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.ejemplo01;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author BRIAN
 */
public interface PersonaRepositorio extends Repository<Persona, Integer>{
    
    List<Persona>findAll();
    Persona findOne(int id);
    Persona save(Persona p);
    void delete(Persona p);
    
}
