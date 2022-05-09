package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Poliza;

@Service
public class Poliza_Services_Impl implements Poliza_Service {
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Poliza> lista = new ArrayList<Poliza>();

	public List<Poliza> listarPolizas() {
		return lista;
	}

	@Override
	public Poliza buscarPolizas(long id) {
		for (Poliza e: lista) {
			if (e.getId_poliza().equals(id))
				return e;
		}
		return null;
	}

	@Override
	public void crearPolizas(int id_cliente, Poliza poliza) {
		poliza.setId_poliza(sequence.incrementAndGet());
		poliza.setId_cliente(id_cliente);
		lista.add(poliza);	
	}

	@Override
	public void eliminarPolizas(long id) {
		for (Poliza e: lista) {
			if (e.getId_poliza().equals(id))
				lista.remove(e);
		}
	}

	@Override
	public void editarPolizas(long id, Poliza poliza) {
		int id_value = (int) id-1;	
		poliza.setId_poliza(id);
		lista.set(id_value, poliza);
	}
	
}
