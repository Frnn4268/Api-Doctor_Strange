package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Citas;
import com.example.demo.entities.Pacientes;
import com.example.demo.entities.Poliza;

@Service
public class Citas_Services_Impl implements Citas_Service{
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Citas> lista = new ArrayList<Citas>();
	
	@Override
	public List<Citas> listarCitas() {
		return lista;
	}
	
	@Override
	public Citas buscarCitas(long id) {
		for(Citas e:lista)
			if(e.getId_Poliza().equals(id)) {
				return e;
			}
		return null;
	}
	
	@Override
	public void agendarCitas(Long id, Citas citas) {
		citas.setId_Poliza(id);
		lista.add(citas);
	}
	
	@Override
	public void eliminarCitas(long id) {
		for (Citas e: lista) {
			if (e.getId_Poliza().equals(id))
				lista.remove(e);
		}
	}
	
	@Override
	public void estadoCitas(long id, String estado) {
		for (Citas e: lista) {
			if (e.getId_Poliza().equals(id))
				e.setEstado(estado);
		}
		
	}

}
