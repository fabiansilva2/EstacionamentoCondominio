package com.example.EstacionamentoCondominio.Entities.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class UsuariosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Min(0)
	@Max(40)
	private int numeroVaga;
	
	@NotBlank
	private String usuario;
	
	@NotBlank
	private String placa;
	
	private String marcaModelo;
	
	private String cor;
	
	public UsuariosModel() {
		super();
	}

	public UsuariosModel(int numeroVaga, String usuario, String placa, String marcaModelo, String cor) {
		super();
		this.numeroVaga = numeroVaga;
		this.usuario = usuario;
		this.placa = placa;
		this.marcaModelo = marcaModelo;
		this.cor = cor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(int numeroVaga) {
		this.numeroVaga = numeroVaga;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarcaModelo() {
		return marcaModelo;
	}

	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
		
}
