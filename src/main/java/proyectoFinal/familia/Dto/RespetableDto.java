package proyectoFinal.familia.Dto;

import java.util.Collection;

import proyectoFinal.familia.entity.Respetable;


public class RespetableDto {
	protected String nombre;
	protected Integer puntosDeHonor;
	protected Integer id;
	protected Boolean cargoPolitico;
	protected Collection<TituloDto> titulos;
	
	
	public void setTitulos(Collection<TituloDto> titulos) {
		this.titulos = titulos;
	}


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


	public Boolean getCargoPolitico() {
		return cargoPolitico;
	}


	public void setCargoPolitico(Boolean cargoPolitico) {
		this.cargoPolitico = cargoPolitico;
	}


	public RespetableDto() {}
	
	public Respetable toModel() {
        Respetable respetable = new Respetable(this.id, this.nombre, this.puntosDeHonor, this.cargoPolitico);
        if (this.titulos != null) {
        	this.titulos.forEach( tituloDto -> {
        		respetable.getTitulos().add(tituloDto.toModel());
        	});
        }
        return respetable;
    }
}
