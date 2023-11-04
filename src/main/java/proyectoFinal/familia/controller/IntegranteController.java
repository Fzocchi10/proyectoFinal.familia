package proyectoFinal.familia.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectoFinal.familia.entity.Criminal;
import proyectoFinal.familia.entity.Integrante;
import proyectoFinal.familia.entity.Respetable;
import proyectoFinal.familia.store.Store;

@RestController
@RequestMapping("/integrantes")
public class IntegranteController {
	 @GetMapping("/listar")
	 public Collection<Integrante> listar(){
		 return Store.getInstance().findAll();
	}
	
	@PostMapping("/agregarRespetable")
	public Collection<Integrante> agregar (@RequestBody Respetable r) {
		Respetable existingRespetable = (Respetable) Store.getInstance().findById(r.getId());

        	if (existingRespetable != null) {
        		return Store.getInstance().findAll();
        	} else {
        		Store.getInstance().add(r);
        		return Store.getInstance().findAll();
        	}	
	}
	
	@PostMapping("/agregarCriminal")
	public Collection<Integrante> agregar (@RequestBody Criminal r) {
		Criminal existingRespetable = (Criminal) Store.getInstance().findById(r.getId());

		if (existingRespetable != null) {
    		return Store.getInstance().findAll();
    	} else {
    		Store.getInstance().add(r);
    		return Store.getInstance().findAll();
    	}	
	}
	
	@PutMapping("/modificarCriminal")
	public Collection<Integrante> modificar (@RequestBody Criminal c) {
		Criminal integranteAModificar = (Criminal) Store.getInstance().findById(c.getId());
		
			if (integranteAModificar != null) {
				integranteAModificar.setNombre(c.getNombre());
			}
			return Store.getInstance().findAll();
			
	}
	
	@PutMapping("/modificarRespetable")
	public Collection<Integrante> modificar (@RequestBody Respetable r) {
		Respetable integranteAModificar = (Respetable) Store.getInstance().findById(r.getId());
			
			if (integranteAModificar != null) {
				integranteAModificar.setNombre(r.getNombre());
			}
			return Store.getInstance().findAll();
	}
	
	@DeleteMapping("/eliminarIntegrante/{id}")
	public Collection<Integrante> eliminar (@PathVariable Integer id) {
			Store.getInstance().remove(id);
			return Store.getInstance().findAll();

	}
}