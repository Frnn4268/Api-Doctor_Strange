package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Poliza;

public interface Poliza_Service {
	public List<Poliza> listarPolizas();
	public Poliza buscarPolizas(long id);
	public void crearPolizas(int id_cliente, Poliza poliza);
	public void eliminarPolizas(long id);
	public void editarPolizas(long id, Poliza poliza);
}
