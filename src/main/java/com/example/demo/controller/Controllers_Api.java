package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Citas;
import com.example.demo.entities.Pacientes;
import com.example.demo.entities.Poliza;
import com.example.demo.services.Citas_Service;
import com.example.demo.services.Pacientes_Service;
import com.example.demo.services.Poliza_Service;

@RestController
@RequestMapping("/api_doctorstrange")
public class Controllers_Api {
	
	@Autowired
	Pacientes_Service paciente_Service;
	@Autowired
	Poliza_Service poliza_Service;
	@Autowired
	Citas_Service cita_Service;
	
	//"Listar" Function
	@GetMapping("paciente")
	public List<Pacientes> listarPacientes(){
		List<Pacientes> lista = paciente_Service.listarPacientes();
		return lista;
	}
	
	@GetMapping("poliza")
	public List<Poliza> listarPolizas(){
		List<Poliza> lista = poliza_Service.listarPolizas();
		return lista;
	}
	
	@GetMapping("cita")
	public List<Citas> listarCitas(){
		List<Citas> lista = cita_Service.listarCitas();
		return lista;
	}
	
	//"Buscar" Function
	@GetMapping("paciente/{id}")
	public Pacientes buscarPacientes(@PathVariable Long id) {
		Pacientes paciente = paciente_Service.buscarPacientes(id);
		return paciente;
	}
	
	@GetMapping("poliza/{id}")
	public Poliza buscarPolizas(@PathVariable Long id) {
		Poliza poliza = poliza_Service.buscarPolizas(id);
		return poliza;
	}
	
	@GetMapping("cita/{id}")
	public Citas buscarCitas(@PathVariable Long id) {
		Citas cita = cita_Service.buscarCitas(id);
		return cita;
	}
	
	//"Crear" Function
	@PostMapping("paciente")
	public void crearPacientes(@RequestBody Pacientes paciente) {
		paciente_Service.crearPacientes(paciente);
	}
	
	@PostMapping("poliza/{id}")
	public void crearPolizas(@PathVariable int id, @RequestBody Poliza poliza) {
		poliza_Service.crearPolizas(id, poliza);
	}
	
	@PostMapping("cita/{id}")
	public void crearCita(@PathVariable Long id, @RequestBody Citas cita) {
		cita_Service.agendarCitas(id, cita);
	}
		
	//"Eliminar" Function
	@DeleteMapping("paciente/{id}")
	public void eliminarPacientes(@PathVariable Long id) {
		paciente_Service.eliminarPacientes(id);
	}
	
	@DeleteMapping("poliza/{id}")
	public void eliminarPoliza(@PathVariable Long id) {
		poliza_Service.eliminarPolizas(id);
	}
	
	@DeleteMapping("cita/{id}")
	public void eliminarCitas(@PathVariable Long id) {
		cita_Service.eliminarCitas(id);
	}
		
	//"Editar" Function
	@PutMapping("paciente/{id}")
	public void editarPacientes(@PathVariable Long id, @RequestBody Pacientes paciente) {
		paciente_Service.editarPacientes(id, paciente);
	}
	
	@PutMapping("poliza/{id}")
	public void editarPolizas(@PathVariable Long id, @RequestBody Poliza poliza) {
		poliza_Service.editarPolizas(id, poliza);
	}
	
	@PutMapping("cita/{id}")
	public void editarCitas(@PathVariable Long id, @RequestBody String estado) {
		cita_Service.estadoCitas(id, estado);
	}
		
}
