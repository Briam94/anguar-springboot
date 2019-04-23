/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intento1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BRIAN
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/usuarios"})
public class Controlador {
    
    @Autowired
    UsuarioService service;
    
    @GetMapping
    public List<Usuario>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Usuario agregar(@RequestBody Usuario u){
        return service.add(u);
    }
    
    @GetMapping(path = {"/{id}"})
    public Usuario listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    @PutMapping(path ={"/{id}"})
    public Usuario editar(@RequestBody Usuario u, @PathVariable("id") int id){
        u.setId(id);
        return service.editar(u);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public Usuario delete(@PathVariable ("id") int id){
        return service.delete(id);
    }
    
    
}
