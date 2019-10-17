/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.app;

import ar.com.app.entity.Vehiculo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author ramiro
 */

@RepositoryRestResource(path = "/vehiculo", collectionResourceRel = "vehiculo")
public interface VehiculoController extends PagingAndSortingRepository<Vehiculo, Long> {

    
}
