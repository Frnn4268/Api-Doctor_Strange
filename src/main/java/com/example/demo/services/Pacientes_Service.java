package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Pacientes;

public interface Pacientes_Service {
	public List<Pacientes> listarPacientes();
	public Pacientes buscarPacientes(long id);
	public void crearPacientes(Pacientes paciente);
	public void eliminarPacientes(long id);
	public void editarPacientes(long id, Pacientes paciente);
}
