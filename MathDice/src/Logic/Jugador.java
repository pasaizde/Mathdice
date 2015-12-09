package Logic;
//Definicion clase, nombrereservado
public class Jugador {
	//propiedades
	private String nombre;
	private String apellido;
	private int edad;
	private int puntos;
	private int nivel;
	
	//Constructor
	public Jugador() {
		
	}
	//MEtodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
		
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
}

