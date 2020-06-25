package edu.cetec.appdibujo.proyecto;

public class locacion extends usuario{
	private String pais;
	private String estado;
	private String idioma;
	
	
	
	public locacion(String nombreUsuario,int contraseña, String pais, String estado, String idioma)
	{	
		super(nombreUsuario, contraseña);
		this.estado=estado;
		this.idioma=idioma;
		this.pais=pais;
	}
	public void buscarPais()
	{	
	}
	public void buscarEstado()
	{	
	}
	public void seleccionIdioma()
	{	
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	

}
