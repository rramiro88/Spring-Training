/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app;

import ar.com.app.entity.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author ramiro
 */

@RepositoryRestResource(path = "/persona", collectionResourceRel = "persona")
@CrossOrigin(origins = "*")
public interface PersonaController extends PagingAndSortingRepository<Persona, Long> {

}
