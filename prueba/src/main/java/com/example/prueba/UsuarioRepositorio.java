/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prueba;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author BRIAN
 */
public interface UsuarioRepositorio extends Repository<Usuario, Integer>{
    
    List<Usuario>findAll();
    Usuario findOne(int usuid);
    Usuario save(Usuario u);
    void delete(Usuario u);
}
