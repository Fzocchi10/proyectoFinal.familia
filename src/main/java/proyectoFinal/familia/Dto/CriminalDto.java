package proyectoFinal.familia.Dto;

import java.util.Collection;

import proyectoFinal.familia.entity.Criminal;

public class CriminalDto {
	protected String nombre;
	protected Integer puntosDeHonor;
	protected Integer id;
	private Collection<ArmaDto> armas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}
	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Collection<ArmaDto> getArmas() {
		return armas;
	}
	public void setArmas(Collection<ArmaDto> armas) {
		this.armas = armas;
	}
	public CriminalDto() {}
	
	public Criminal toModel() {
        Criminal criminal = new Criminal( this.id, this.nombre, this.puntosDeHonor);

        // Convertir las armas a modelos si es necesario
        if (this.armas != null) {
        	this.armas.forEach( armaDto -> {
        		criminal.getArmas().add(armaDto.toModel());
        	});
        }
        return criminal;
    }
	

}
