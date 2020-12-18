package com.br.clientes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.clientes.dto.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
