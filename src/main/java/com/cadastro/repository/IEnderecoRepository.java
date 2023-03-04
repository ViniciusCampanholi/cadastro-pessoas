package com.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.entity.Endereco;

@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco, Long>{

}
