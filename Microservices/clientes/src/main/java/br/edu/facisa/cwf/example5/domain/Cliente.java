package br.edu.facisa.cwf.example5.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	private String id;
	private String name;
	private int idade;
	private String id_compra;
	
	public Cliente() {
	}

	public Cliente(String id, String name, int idade, String id_compra) {
		this.id = id;
		this.name = name;
		this.idade = idade;
        this.id_compra = id_compra;
	}

	public String getId() {
		return id;
	}

	public String getId_compra() {
		return id_compra;
	}

	public void setId_compra(String id_compra) {
		this.id_compra = id_compra;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}