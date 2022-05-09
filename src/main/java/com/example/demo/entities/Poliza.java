package com.example.demo.entities;

public class Poliza {
	private Long id_poliza;
	private int id_cliente;
	private String Estado;
	private String Fecha_inicio;
	private String Fecha_fin;
	
	public Poliza(Long id_poliza, int id_cliente, String estado, String fecha_inicio, String fecha_fin) {
		super();
		this.id_poliza = id_poliza;
		this.id_cliente = id_cliente;
		Estado = estado;
		Fecha_inicio = fecha_inicio;
		Fecha_fin = fecha_fin;
	}

	public Long getId_poliza() {
		return id_poliza;
	}

	public void setId_poliza(Long id_poliza) {
		this.id_poliza = id_poliza;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getFecha_inicio() {
		return Fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		Fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return Fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		Fecha_fin = fecha_fin;
	}
	
	
}
