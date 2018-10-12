package email;

import java.io.Serializable;

public class message implements Serializable {
	private String nombre;
	private String email;
	private String sitio;
	private String message;
	
	public message() {
		
	}
	
	public message(String name, String email, String sitio_web, String message) {
		super();
		this.nombre = name;
		this.email = email;
		this.sitio = sitio_web;
		this.message = message;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
