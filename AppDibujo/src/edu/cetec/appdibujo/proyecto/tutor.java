package edu.cetec.appdibujo.proyecto;

public class tutor extends usuario{
	private String nombre;
	private String apellidos;
	private int edad;
	private String pais;
	private String estiloDibujo;
	
	
	//constructor
	public tutor(String nombre, String apellidos, int edad, String pais, String estiloDibujo, String nombreUsuario, int contraseña)
	{
		super (nombreUsuario, contraseña);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.pais = pais;
		this.estiloDibujo = estiloDibujo;
	}
	public void comenzarClase()
	{	
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstiloDibujo() {
		return estiloDibujo;
	}
	public void setEstiloDibujo(String estiloDibujo) {
		this.estiloDibujo = estiloDibujo;
	}
	

}