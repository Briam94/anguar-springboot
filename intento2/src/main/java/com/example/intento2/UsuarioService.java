/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.intento2;

import java.util.List;

/**
 *
 * @author BRIAN
 */
public interface UsuarioService {
    List<Usuario>listar();
    Usuario listarId(int id);
    Usuario add(Usuario u);
    Usuario editar(Usuario u);
    Usuario delete(int id);
    
}
