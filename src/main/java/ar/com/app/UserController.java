/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app;

import ar.com.app.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ramiro
 */
public interface UserController extends CrudRepository<Usuario, Long> {
    
    public Usuario findByNombre(String nombre);
    
}
