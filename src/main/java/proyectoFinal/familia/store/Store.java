package proyectoFinal.familia.store;

import java.util.ArrayList;
import java.util.Collection;

import proyectoFinal.familia.model.Integrante;

public class Store {

	private static Store instance;
	
	private Collection<Integrante>integrantes ;
	
	private Store() {
		this.integrantes = new ArrayList<Integrante>();
	}
	
	public static Store getInstance() {
		if (instance==null) {
			instance = new Store();
		}
		return instance;
	}
	
	public Collection<Integrante> findAll() {
		return this.integrantes;
	}
	
	public Integrante add(Integrante i) {
		this.integrantes.add(i);
		return i;
	}
}