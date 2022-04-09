package com.esarda.PC_Ecommerce.models;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Prodotto {
	@Id
	private int id_prodotto;

	@Column
	private double prezzotot;

	@Column
	private String nome;
	
	@Column
	private String descrizione;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="categoriaprodotto")
	private CategoriaProdotto categoriaprodotto;
	
	//Puntato da ordine
		@OneToMany(mappedBy="utente")
	    @PrimaryKeyJoinColumn (name = "id_prodottto")
		private List<Ordine> ordine;
	
	@Column String imgpath;

	public Prodotto(int id_prodotto, double prezzotot, String nome, String descrizione,
			CategoriaProdotto categoriaprodotto) throws ParseException{
		super();
		this.id_prodotto = id_prodotto;
		this.prezzotot = prezzotot;
		this.nome = nome;
		this.descrizione = descrizione;
		this.categoriaprodotto = categoriaprodotto;
		this.imgpath = "";
	}

	public int getId_prodotto() {
		return id_prodotto;
	}

	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}

	public double getPrezzotot() {
		return prezzotot;
	}

	public void setPrezzotot(double prezzotot) {
		this.prezzotot = prezzotot;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public CategoriaProdotto getCategoriaprodotto() {
		return categoriaprodotto;
	}

	public void setCategoriaprodotto(CategoriaProdotto categoriaprodotto) {
		this.categoriaprodotto = categoriaprodotto;
	}

	public String getImgpath() {
		return imgpath;
	}

	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	
	
	
	
}