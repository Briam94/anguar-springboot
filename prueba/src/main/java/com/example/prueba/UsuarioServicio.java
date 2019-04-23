/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prueba;

import java.util.List;

/**
 *
 * @author BRIAN
 */
public interface UsuarioServicio {
    List<Usuario>listar();
    Usuario listarId(int usuid);
    Usuario add(Usuario u);
    Usuario editar(Usuario u);
    Usuario delete(int usuid);
}
