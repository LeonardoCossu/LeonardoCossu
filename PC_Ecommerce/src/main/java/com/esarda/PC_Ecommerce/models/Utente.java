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
public class Utente {
	@Id
	private int id_utente;

	@Column
	private String nome;

	@Column
	private String cognome;

	@Column
	private String email;

	@Column
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tipoutente")
	private TipoUtente tipoutente;
	
	//Puntato da ordine
			@OneToMany(mappedBy="utente")
		    @PrimaryKeyJoinColumn (name = "id_utente")
			private List<Ordine> ordine;

	public Utente(int id_utente, String nome, String cognome, String email, String password, TipoUtente tipoutente) {
		super();
		this.id_utente = id_utente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.tipoutente = tipoutente;
	}

	public int getId_utente() {
		return id_utente;
	}

	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TipoUtente getTipoutente() {
		return tipoutente;
	}

	public void setTipoutente(TipoUtente tipoutente) {
		this.tipoutente = tipoutente;
	}
	
	
}