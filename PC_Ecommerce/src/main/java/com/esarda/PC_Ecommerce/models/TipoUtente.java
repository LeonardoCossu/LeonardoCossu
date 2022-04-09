package com.esarda.PC_Ecommerce.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoUtente  {
	
	@Id
	private int id_tipo;
	
	@Column
	private String nometipo;


	
	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getNometipo() {
		return nometipo;
	}

	public void setNometipo(String nometipo) {
		this.nometipo = nometipo;
	}

	//puntato da utente
	@OneToMany (mappedBy="tipoutente")
	private List<Utente> listaUtenti;
	
	public TipoUtente(int id_tipo, String nometipo) {
		this.id_tipo = id_tipo;
		this.nometipo = nometipo;
	}
	
	public TipoUtente() {
		this.id_tipo = 1;
		this.nometipo = "utente";

	}



	
	
}