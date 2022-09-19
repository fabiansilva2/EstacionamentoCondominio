package com.example.EstacionamentoCondominio.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EstacionamentoCondominio.Entities.Models.UsuariosModel;
import com.example.EstacionamentoCondominio.Entities.Repositories.EstacionamentoRepository;

@CrossOrigin("/*")
@RestController
@RequestMapping("/condominio/estacionamento")
public class EstacionamentoController {
	@Autowired
	private EstacionamentoRepository estacionamentoRepository;
	
	@GetMapping
	public Iterable<UsuariosModel> consultarVagas(){
		return estacionamentoRepository.findAll();
	}
	
	@PostMapping
	public @ResponseBody UsuariosModel cadastrarVaga(UsuariosModel vaga) {
		estacionamentoRepository.save(vaga);
		return vaga;
	}
	
	@PutMapping
	public @ResponseBody UsuariosModel alterarVaga(UsuariosModel vaga) {
		estacionamentoRepository.save(vaga);
		return vaga;
	}
	
	@DeleteMapping("/{id}")
	public void excluirVaga(@PathVariable int id) {
		estacionamentoRepository.deleteById(id);
	}	
	

}
