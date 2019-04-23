/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intento1;

import java.sql.ResultSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

/**
 *
 * @author BRIAN
 */
public class UsuarioServiceImp implements UsuarioService {
    
    
    @Autowired
    
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> listar() {
        return repositorio.findAll();
    }

    @Override
    public Usuario listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Usuario add(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario editar(Usuario u) {
        return repositorio.save(u);
    }

    @Override
    public Usuario delete(int id) {
        Usuario u = repositorio.findOne(id);
        if(u != null){
            repositorio.delete(u);
        }
        return u;
    }
    
    
}
