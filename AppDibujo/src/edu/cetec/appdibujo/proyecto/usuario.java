package edu.cetec.appdibujo.proyecto;

public class usuario 
{
	private String nombreUsuario;
	private int contraseña;
	
	public usuario(String nombreUsuario, int contraseña)
	{
		this.nombreUsuario  = nombreUsuario;
		this.contraseña = contraseña;
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
	public int getContraseña() {
		return contraseña;
	}
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}	
}
