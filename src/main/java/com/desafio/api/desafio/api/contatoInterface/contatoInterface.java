package com.desafio.api.desafio.api.contatoInterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.api.desafio.api.contatoModel.Contato;


public interface contatoInterface extends JpaRepository<Contato, Long>{

}
