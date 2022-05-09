package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Pacientes;

@Service
public class Pacientes_Services_Impl implements Pacientes_Service {
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Pacientes> lista = new ArrayList<Pacientes>();

	public List<Pacientes> listarPacientes() {
		return lista;
	}

	@Override
	public Pacientes buscarPacientes(long id) {
		for (Pacientes e: lista) {
			if (e.getId().equals(id))
				return e;
		}
		return null;
	}

	@Override
	public void crearPacientes(Pacientes paciente) {
		paciente.setId(sequence.incrementAndGet());
		lista.add(paciente);		
	}

	@Override
	public void eliminarPacientes(long id) {
		for (Pacientes e: lista) {
			if (e.getId().equals(id))
				lista.remove(e);
		}
	}

	@Override
	public void editarPacientes(long id, Pacientes paciente) {
		int id_value = (int) id-1;	
		paciente.setId(id);
		lista.set(id_value, paciente);
	}
	
}
