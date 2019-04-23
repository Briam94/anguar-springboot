/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.ejemplo01;

import java.util.List;

/**
 *
 * @author BRIAN
 */
public interface PersonaService {
    
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona editar(Persona p);
    Persona delete(int id);
}
