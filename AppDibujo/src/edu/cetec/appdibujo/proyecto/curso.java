package edu.cetec.appdibujo.proyecto;

public class curso extends usuario{
	private String online;
	private String grabado;
	
	public curso(String nombreUsuario, int contraseña, String online, String grabado)
	{	 
		super (nombreUsuario, contraseña);
		this.online = online;
		this.grabado = grabado;
	}
	public void clases()
	{		
	}
	public String getOnline() {
		return online;
	}
	public void setOnline(String online) {
		this.online = online;
	}
	public String getGrabado() {
		return grabado;
	}
	public void setGrabado(String grabado) {
		this.grabado = grabado;
	}
	

}
