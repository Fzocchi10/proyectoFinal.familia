package proyectoFinal.familia.Dto;

import proyectoFinal.familia.entity.Bomba;
import proyectoFinal.familia.entity.Cuchillo;
import proyectoFinal.familia.entity.Ametralladora;
import proyectoFinal.familia.entity.Arma;


public class ArmaDto {
	private String tipo;
	
	public ArmaDto() {
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Arma toModel() {
		Arma arma = null;
		if (this.tipo.equals("cuchillo")) {
			arma = new Cuchillo(1);
		}else if(this.tipo.equals("ametralladora")) {
			arma = new Ametralladora(100);
		}else if(this.tipo.equals("bomba")) {
			arma = new Bomba(0,1000);
		}
		return arma;
	}
}
