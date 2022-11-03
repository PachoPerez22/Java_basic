package cl.generationf20221103;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String correo;
	private String password;
	private String apellido;
	private String nick;
	
	ArrayList<String> telefonos;
	private String direccion;
	
	//Constructors
	public Usuario() {
		super();
		//Inicializando un arreglo, para que funcione en el main
		this.telefonos = new ArrayList<String>();//
		//Inicializar el objeto direccion
		//this.direccion = new Direccion 
	    
	
	}
	public Usuario(String nombre, String correo, String password, String apellido, String nick,
			ArrayList<String> telefonos, String direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.apellido = apellido;
		this.nick = nick;
		this.telefonos = telefonos;
		this.direccion = direccion;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//To String
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public ArrayList<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", apellido=" + apellido
				+ ", nick=" + nick + ", telefonos=" + telefonos + ", direccion=" + direccion + "]";
	}
	
	
	
}


	