package br.edu.facisa.cwf.example5.service;

import java.util.List;

import br.edu.facisa.cwf.example5.domain.Cliente;

public interface ClienteService {

	Cliente save(Cliente cliente);

	Cliente getById(String id);
	
	Cliente getById_loja(String id_loja);
	
	List<Cliente> listAllClientes();

	 void delete(Cliente cliente);

}
