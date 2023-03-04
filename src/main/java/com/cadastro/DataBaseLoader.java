package com.cadastro;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cadastro.entity.Endereco;
import com.cadastro.entity.Pessoa;
import com.cadastro.repository.IEnderecoRepository;
import com.cadastro.repository.IPessoaRepository;

@Component
public class DataBaseLoader implements CommandLineRunner{


    private final IPessoaRepository pessoaRepository;

    private final IEnderecoRepository enderecoRepository;
    
	public DataBaseLoader(IPessoaRepository pessoaRepository, IEnderecoRepository enderecoRepository) {
		this.pessoaRepository = pessoaRepository;
		this.enderecoRepository = enderecoRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa pessoa1 = new Pessoa(1l,"João", "Silva", 18);
        Pessoa pessoa2 = new Pessoa(2l,"Maria","Silva", 18);

        Endereco endereco1 = new Endereco(1,"Rua 1", "100", "Bairro 1", "Cidade 1");
        Endereco endereco2 = new Endereco(2,"Rua 2", "100", "Bairro 2", "Cidade 2");
        Endereco endereco3 = new Endereco(3,"Rua 3", "100", "Bairro 3", "Cidade 3");

        pessoa1.addEndereco(endereco1);
        pessoa1.addEndereco(endereco2);

        pessoa2.addEndereco(endereco3);

        pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2));
        //enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2, endereco3));
		
	}

}
