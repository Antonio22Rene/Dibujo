package edu.cetec.appdibujo.proyecto;

public class usuario 
{
	private String nombreUsuario;
	private int contrase�a;
	
	public usuario(String nombreUsuario, int contrase�a)
	{
		this.nombreUsuario  = nombreUsuario;
		this.contrase�a = contrase�a;
	}

	public void registrarse()
	{	
		 System.out.println("registrarse");
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public int getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(int contrase�a) {
		this.contrase�a = contrase�a;
	}	
}
