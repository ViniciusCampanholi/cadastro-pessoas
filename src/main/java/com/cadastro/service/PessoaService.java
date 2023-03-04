package com.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.entity.Pessoa;
import com.cadastro.repository.IPessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private IPessoaRepository pessoaRepository;
	
	public List<Pessoa> buscarTodasAsPessoas(){
		return pessoaRepository.findAll();
	}
}
