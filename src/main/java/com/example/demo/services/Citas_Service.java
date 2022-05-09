package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Citas;

public interface Citas_Service {
	public List<Citas> listarCitas();
	public Citas buscarCitas(long id);
	public void agendarCitas(Long id, Citas citas);
	public void eliminarCitas(long id);
	public void estadoCitas(long id, String estado);
}
