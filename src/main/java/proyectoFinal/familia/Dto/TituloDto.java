package proyectoFinal.familia.Dto;

import proyectoFinal.familia.entity.Titulo;

public class TituloDto {
	public String descripcion;
	
	public TituloDto() {}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Titulo toModel() {
		Titulo titulo = new Titulo(this.descripcion);
		return titulo;
	}
	
	
}