package proyectoFinal.familia.entity;

import java.util.ArrayList;
import java.util.Collection;


public class Criminal extends Integrante {

	// atributos
	private Collection<Arma> armas;

	// constructores
	public Criminal(Integer id, String nombre, Integer puntosDeHonor) {
		super(id,nombre, puntosDeHonor);
		this.armas = new ArrayList<Arma>();
	}

	// metodos
	@Override
	public void imprimirNombre() {
		System.out.println(this.nombre);
	}

 	@Override
	public Integer honor() {
		return this.honorArmas() + this.puntosDeHonor;
	}

	@Override
	public Boolean esCapo() {
		return  this.tieneHonorParaSerCapo() && this.tieneArmaHeavy();
	}

	private Boolean tieneArmaHeavy() {
		return this.armas.stream().anyMatch(Arma::isHeavy);
	}

 	private Integer honorArmas() {
 		return this.armas.stream()
 							.mapToInt(Arma::getPuntosDeHonor)
 							.sum();
 	}
 	
	public void add(Arma arma) {
		this.armas.add(arma);
	}
	
	public Collection<Arma> getArmas(){
		return this.armas;
	}
}
