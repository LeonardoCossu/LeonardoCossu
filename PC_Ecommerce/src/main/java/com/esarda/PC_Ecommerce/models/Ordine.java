package com.esarda.PC_Ecommerce.models;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

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

@Entity
public class Ordine {
	
	@Id
	private int id_ordine;
	
	@Column
	private int stato;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private GregorianCalendar dataordine;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private GregorianCalendar dataspedizione;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_utente")
	private Utente utente;
	
	

	public Ordine(int id_ordine, int stato, GregorianCalendar dataordine, Utente utente) {
		super();
		this.id_ordine = id_ordine;
		this.stato = stato;
		this.dataordine = dataordine;
		this.dataspedizione = new GregorianCalendar();
		this.dataspedizione.set(1900, 12, 12);
		this.utente = utente;
	}
	public Ordine(int id_ordine, int stato, String dataordine, Utente utente) throws ParseException{
		super();
		this.id_ordine = id_ordine;
		this.stato = stato;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(dataordine);
		this.dataordine = new GregorianCalendar();
		this.dataordine.setTime(date);
		this.dataspedizione = new GregorianCalendar();
		this.dataspedizione.set(1900, 12, 12);
		this.utente = utente;
	}

	public int getId_ordine() {
		return id_ordine;
	}

	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
	}

	public int getStato() {
		return stato;
	}

	public void setStato(int stato) {
		this.stato = stato;
	}

	public GregorianCalendar getDataordine() {
		return dataordine;
	}

	public void setDataordine(GregorianCalendar dataordine) {
		this.dataordine = dataordine;
	}

	public GregorianCalendar getDataspedizione() {
		return dataspedizione;
	}

	public void setDataspedizione(GregorianCalendar dataspedizione) {
		this.dataspedizione = dataspedizione;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	
	
}