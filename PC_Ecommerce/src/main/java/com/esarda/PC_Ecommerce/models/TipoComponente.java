package com.esarda.PC_Ecommerce.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoComponente  {
	
	@Id
	private int id_tipocomponente;
	
	@Column
	private String nometipocomponente;
	
	
	/*puntato da componente
	@OneToMany (mappedBy="tipocomponente")
	private List<Componente> listaComponenti;
	*/

	public int getId_tipocomponente() {
		return id_tipocomponente;
	}

	public void setId_tipocomponente(int id_tipocomponente) {
		this.id_tipocomponente = id_tipocomponente;
	}

	public String getNometipocomponente() {
		return nometipocomponente;
	}

	public void setNometipocomponente(String nometipocomponente) {
		this.nometipocomponente = nometipocomponente;
	}

	public TipoComponente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoComponente(int id_tipocomponente, String nometipocomponente) {
		super();
		this.id_tipocomponente = id_tipocomponente;
		this.nometipocomponente = nometipocomponente;
	}
	
	
}
