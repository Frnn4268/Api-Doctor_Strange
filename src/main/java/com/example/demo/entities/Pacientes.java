package com.example.demo.entities;

public class Pacientes {
	private Long id;
	private String Primer_Nombre;
	private String Segundo_Nombre;
	private String Primer_Apellido;
	private String Segundo_Apellido;
	private String Edad;
	
	public Pacientes(Long id, String primer_Nombre, String segundo_Nombre, String primer_Apellido,
			String segundo_Apellido, String edad) {
		super();
		this.id = id;
		Primer_Nombre = primer_Nombre;
		Segundo_Nombre = segundo_Nombre;
		Primer_Apellido = primer_Apellido;
		Segundo_Apellido = segundo_Apellido;
		Edad = edad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimer_Nombre() {
		return Primer_Nombre;
	}

	public void setPrimer_Nombre(String primer_Nombre) {
		Primer_Nombre = primer_Nombre;
	}

	public String getSegundo_Nombre() {
		return Segundo_Nombre;
	}

	public void setSegundo_Nombre(String segundo_Nombre) {
		Segundo_Nombre = segundo_Nombre;
	}

	public String getPrimer_Apellido() {
		return Primer_Apellido;
	}

	public void setPrimer_Apellido(String primer_Apellido) {
		Primer_Apellido = primer_Apellido;
	}

	public String getSegundo_Apellido() {
		return Segundo_Apellido;
	}

	public void setSegundo_Apellido(String segundo_Apellido) {
		Segundo_Apellido = segundo_Apellido;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
	}
	
	
}
