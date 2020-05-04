package com.generationc20.quesadillotasapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quesadillota")
public class Quesadillota {
	
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private int tipoTortilla;
	private int tipoChile;
	private String queso;
	private String comentario;
	
	public Quesadillota() {}

	public Quesadillota(int id, String nombre, int tipoTortilla, int tipoChile, String queso, String comentario) {
		this.id = id;
		this.nombre = nombre;
		this.tipoTortilla = tipoTortilla;
		this.tipoChile = tipoChile;
		this.queso = queso;
		this.comentario = comentario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoTortilla() {
		return tipoTortilla;
	}

	public void setTipoTortilla(int tipoTortilla) {
		this.tipoTortilla = tipoTortilla;
	}

	public int getTipoChile() {
		return tipoChile;
	}

	public void setTipoChile(int tipoChile) {
		this.tipoChile = tipoChile;
	}

	public String getQueso() {
		return queso;
	}

	public void setQueso(String queso) {
		this.queso = queso;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
