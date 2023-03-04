package com.cadastro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.entity.Pessoa;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa, Long>{

	public List<Pessoa> findAll();
	
	
}
