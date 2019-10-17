/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app;

import ar.com.app.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ramiro
 */
@RestController
@CrossOrigin(origins = "*")
public class LoginRest {

    @Autowired
    private UserController userController;

    @PostMapping(path = "/login")
    public Usuario login(@RequestBody LoginDTO dto) {

        try {

            Usuario u = userController.findByNombre(dto.getUser());

            if (u.getPass().equals(dto.getPass())) {
                return u;
            }

            return null;

        } catch (Exception e) {
            return null;
        }

    }

}
