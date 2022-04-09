package com.esarda.PC_Ecommerce.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CategoriaProdotto  {
	
	@Id
	private int id_categoria;
	
	@Column
	private String nomecategoria;
	
	/*puntato da prodotto
	@OneToMany (mappedBy="categoriaprodotto")
	private List<Prodotto> listaProdotti;
	*/

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNomecategoria() {
		return nomecategoria;
	}

	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}

	public CategoriaProdotto(int id_categoria, String nomecategoria) {
		super();
		this.id_categoria = id_categoria;
		this.nomecategoria = nomecategoria;
	}

	public CategoriaProdotto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

