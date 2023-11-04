package proyectoFinal.familia.entity;

public abstract class Integrante {

	protected static final Integer HONOR_CAPO = Integer.valueOf(100);
	protected Integer id;
	protected String nombre;
	protected Integer puntosDeHonor;

	public Integrante(Integer id,String nombre, Integer puntosDeHonor) {
		this.id = id;
		this.nombre = nombre;
		this.puntosDeHonor = puntosDeHonor;
	}
	public Integrante() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}
	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public abstract Integer honor();
	public abstract Boolean esCapo();

	public void imprimirNombre() {
		System.out.println(this.nombre);
	}

	protected Boolean tieneHonorParaSerCapo() {
		return this.honor()>HONOR_CAPO;
	}

	public String getNombre() {
		return nombre;
	}
}
