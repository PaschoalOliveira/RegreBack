package com.main.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "imovel")
public class Imovel {

	@Id
	private Integer id;
	
	@Column
	private Double m2;
	
	@ManyToOne
	@JoinColumn(name="id_bairro")
	private Bairro bairro;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getM2() {
		return m2;
	}

	public void setM2(Double m2) {
		this.m2 = m2;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
}
