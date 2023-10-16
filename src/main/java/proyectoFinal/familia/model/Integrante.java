package proyectoFinal.familia.model;

public class Integrante {

	private String nombre;
	private Integer puntosDeHonor;
	private Integer id;

	public Integrante() {
	}

	public Integrante(String nombre, Integer ph, Integer id) {
		super();
		this.nombre = nombre;
		this.puntosDeHonor = ph;
		this.id = id;
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
	
}
