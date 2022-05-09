package com.example.demo.entities;

public class Citas {
	private String Fecha;
	private String Hora;
	private Long id_Poliza;
	private String Estado;
	private String Observaciones;
	
	public Citas(String fecha, String hora, Long id_Poliza, String estado, String observaciones) {
		super();
		Fecha = fecha;
		Hora = hora;
		this.id_Poliza = id_Poliza;
		Estado = estado;
		Observaciones = observaciones;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public Long getId_Poliza() {
		return id_Poliza;
	}

	public void setId_Poliza(Long id_Poliza) {
		this.id_Poliza = id_Poliza;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	
	
}
