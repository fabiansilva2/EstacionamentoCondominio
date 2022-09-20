package com.example.EstacionamentoCondominio.Entities.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_apartamento")
public class ApartamentoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int numeroApartamento;
	
	private String morador;

	public ApartamentoModel() {
		super();
	}

	public ApartamentoModel(int numeroApartamento, String morador) {
		super();
		this.numeroApartamento = numeroApartamento;
		this.morador = morador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(int numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public String getMorador() {
		return morador;
	}

	public void setMorador(String morador) {
		this.morador = morador;
	}
	
}
