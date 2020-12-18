package com.br.clientes.service;

import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.clientes.dto.Cliente;
import com.br.clientes.repository.ClienteRepository;

@Component
public class ClienteService {

	public ClienteService() {
		System.out.println("classe inicializada");
	}
	
	@Autowired
	private ClienteRepository repository;
	
	@PostConstruct
	public void teste() {
		Cliente cliente = Cliente.builder()
				.withId(UUID.randomUUID().toString())
				.withCpf("05879619845")
				.withNome("Andressa")
				.build();
		
		this.repository.save(cliente);
		System.out.println("cliente salvo");
				
				
				
				
	}
}
