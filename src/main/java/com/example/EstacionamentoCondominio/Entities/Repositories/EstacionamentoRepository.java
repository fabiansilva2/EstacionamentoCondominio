package com.example.EstacionamentoCondominio.Entities.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.EstacionamentoCondominio.Entities.Models.CadastroEstacionamentoModel;

public interface EstacionamentoRepository extends CrudRepository<CadastroEstacionamentoModel, Integer>{

}
