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

import proyectoFinal.familia.Dto.CriminalDto;
import proyectoFinal.familia.Dto.RespetableDto;
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
	
	@PostMapping("/agregarCriminal")
	public CriminalDto agregar (@RequestBody CriminalDto cDto) {
		Integrante existingCriminal = (Criminal) Store.getInstance()
													.findById(cDto.getId());
		if (existingCriminal != null) {
			return null;
	    } else {
	    	Store.getInstance().add(cDto.toModel());
	        return cDto;
	    }
	}
	
	@PostMapping("/agregarRespetable")
	public RespetableDto agregar (@RequestBody RespetableDto rDto) {
		Integrante existingRespetable = (Respetable) Store.getInstance()
														.findById(rDto.getId());

        	if (existingRespetable != null) {
        		return null;
        	} else {
        		Store.getInstance().add(rDto.toModel());
        		return rDto;
        	}	
	}
	
	@PutMapping("/modificarCriminal")
	public void modificar(@RequestBody CriminalDto cDto ) {
		Integrante existingCriminal =(Criminal) Store.getInstance().findById(cDto.getId());
		
		if (existingCriminal != null) {
			existingCriminal.setNombre(cDto.getNombre());
		}
	}
	@PutMapping("/modificarRespetable")
	public void modificar(@RequestBody RespetableDto rDto ) {
		Integrante existingRespetable =(Respetable) Store.getInstance().findById(rDto.getId());
		
		if (existingRespetable != null) {
			existingRespetable.setNombre(rDto.getNombre());
		}
	}
	
	@DeleteMapping("/eliminarIntegrante/{id}")
	public Collection<Integrante> eliminar (@PathVariable Integer id) {
			Store.getInstance().remove(id);
			return Store.getInstance().findAll();

	}
}